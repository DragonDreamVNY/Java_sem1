package lecture16.javagui;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


/**
 * @author k00223361
 */
public class FirstFrame {

        
    static JTextField aTextField; //needs to be visible to event handler within Scope
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("This is my first frame");
        frame.setSize(480, 350); //Width and Heigth
        
        
        Container c = frame.getContentPane(); //any part that you can put components into
        
        c.setLayout(new FlowLayout() ); //when you add compenents they will flow left to right
        
        JLabel aLabel = new JLabel("Enter Your Name"); //create label object from JLabel class
        c.add(aLabel); //add label object to container c
        
        aTextField = new JTextField(15); //pass in an int = number of columns in the text field
        c.add(aTextField);
        
        JButton aButton = new JButton("Click Me");
        c.add(aButton);
        
        aButton.addActionListener(new ActionListener() {
            
               public void actionPerformed(ActionEvent e){
                   String usersName = aTextField.getText();
                   JOptionPane.showMessageDialog(null, "Hello " + usersName);
               } //end actionPerformed method
               
               
        }); //end aciton for aButton
        
        frame.setVisible(true); //otherwise you won't see the window/frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //need this or the program stays running
        
    } //end Main
    
} // end Class
