/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import javax.swing.JOptionPane;

/**
 *
 * @author alan.ryan
 */
public class ComboBoxExample extends javax.swing.JFrame {

    /**
     * Creates new form ComboBoxExample
     */
    public ComboBoxExample() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        rainbowComboBox = new javax.swing.JComboBox();
        checkSelectedButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        removeColourTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addColourTextField = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rainbowComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet" }));
        rainbowComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rainbowComboBoxItemStateChanged(evt);
            }
        });
        rainbowComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rainbowComboBoxActionPerformed(evt);
            }
        });

        checkSelectedButton.setText("Check Selected");
        checkSelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSelectedButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Colour To Remove");

        removeColourTextField.setColumns(10);
        removeColourTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeColourTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Colour To Add");

        addColourTextField.setColumns(10);
        addColourTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addColourTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeColourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addColourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(rainbowComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(checkSelectedButton)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(rainbowComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(checkSelectedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(removeColourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(addColourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeColourTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeColourTextFieldActionPerformed
        String colour = removeColourTextField.getText();
        rainbowComboBox.removeItem(colour);
    }//GEN-LAST:event_removeColourTextFieldActionPerformed

    private void addColourTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addColourTextFieldActionPerformed
        String colour = addColourTextField.getText();
        rainbowComboBox.addItem(colour);
    }//GEN-LAST:event_addColourTextFieldActionPerformed

    private void checkSelectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSelectedButtonActionPerformed
       displaySelectedItem();
    }//GEN-LAST:event_checkSelectedButtonActionPerformed

    private void rainbowComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rainbowComboBoxItemStateChanged
       displaySelectedItem();
    }//GEN-LAST:event_rainbowComboBoxItemStateChanged

    private void rainbowComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rainbowComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rainbowComboBoxActionPerformed

    private void displaySelectedItem() {
        String selectedItem = (String) rainbowComboBox.getSelectedItem();
        JOptionPane.showMessageDialog(null, selectedItem + " is selected");
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ComboBoxExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboBoxExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboBoxExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboBoxExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboBoxExample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addColourTextField;
    private javax.swing.JButton checkSelectedButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox rainbowComboBox;
    private javax.swing.JTextField removeColourTextField;
    // End of variables declaration//GEN-END:variables

    
}