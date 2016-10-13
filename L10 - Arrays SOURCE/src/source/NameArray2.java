package source;

import javax.swing.JOptionPane;


public class NameArray2 {
   
    public static void main(String[] args) {
       
        String myName[] = new String[5];
	
	for(int i =0; i < 5; i++)
		myName[i] = JOptionPane.showInputDialog("Enter name");

	for(int i =0; i < 5; i++)
		JOptionPane.showMessageDialog(null, myName[i]);

    }
    
}

