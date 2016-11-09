package lecture12;

import javax.swing.JOptionPane;

public class Exercise6 {

    public static void main(String[] args) {
        
      String input1 =  JOptionPane.showInputDialog("Enter The Gross Pay Here");
      double grosspay = Double.parseDouble(input1);
      
      System.out.println ("The Required Tax Payable is: " + gettax(grosspay)); 
    }
    
        public static double gettax(double grosspay) {
            if (grosspay <7500){
            return 0;
            }
            else if (grosspay<20000){
            return 0.23*(grosspay - 7500);
            }
            else 
            return (grosspay - 20000)*0.45 + (0.23* 12500);
        }
        
}