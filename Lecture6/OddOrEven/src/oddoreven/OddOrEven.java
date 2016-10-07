package oddoreven;

import javax.swing.JOptionPane;
public class OddOrEven{

    public static void main (String[] args){
                
            int n; //declare whole number variable
            
            String input = JOptionPane.showInputDialog("Enter Your Number");
            n = Integer.parseInt(input);
            
            if ( (n%2) == 0)
                JOptionPane.showMessageDialog(null, "Your Number is Even");
            // even is TRUE
            else
                JOptionPane.showMessageDialog(null, "Your Number is Odd");
            // odd is FALSE
        }
    
}
