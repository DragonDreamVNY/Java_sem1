
import javax.swing.JOptionPane;

class AddNumbersDouble{    
    public static void main(String[] args){
       double num1, num2, num3, num4, num5;
       double sum;
       double mean; 

        String input = JOptionPane.showInputDialog("Enter your first number");
        num1 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter your second number");
        num2 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter your third number");
        num3 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter your fourth number");
        num4 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter your fifth number");
        num5 = Double.parseDouble(input);

        sum = num1 + num2 + num3 + num4 + num5;
        mean = (double)sum/5;
        
        JOptionPane.showMessageDialog(null, "the Mean value of your inputs is = " + mean);

        
    }
            
}