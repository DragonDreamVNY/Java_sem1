package ageprogram;
import javax.swing.JOptionPane;

public class AgeProgram {

    public static void main(String[] args) {
        
            final int MINOR =18;
            
            String input = JOptionPane.showInputDialog("Enter Your Age");
            int age = Integer.parseInt(input);
            
            if (age < MINOR)
                    JOptionPane.showMessageDialog(null, "Sorry, You Cannot Vote!");
            
            if (age >= MINOR)
                    JOptionPane.showMessageDialog(null, "Get Ready To Cast Your Vote!");
    }
    
}
