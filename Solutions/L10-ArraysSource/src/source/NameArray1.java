package source;

import javax.swing.JOptionPane;

public class NameArray1 {

    public static void main(String[] args) {
        
        String myName[] = new String[5];
	
	myName[0] = JOptionPane.showInputDialog("Enter name");
	myName[1] = JOptionPane.showInputDialog("Enter name");
	myName[2] = JOptionPane.showInputDialog("Enter name");
	myName[3] = JOptionPane.showInputDialog("Enter name");
	myName[4] = JOptionPane.showInputDialog("Enter name");
	
	JOptionPane.showMessageDialog(null, myName[0]);
	JOptionPane.showMessageDialog(null, myName[1]);
	JOptionPane.showMessageDialog(null, myName[2]);
	JOptionPane.showMessageDialog(null, myName[3]);
	JOptionPane.showMessageDialog(null, myName[4]);
    }
    
}

