package minofthree;

import javax.swing.JOptionPane;

public class MinOfThree {

    public static void main(String[] args) {
        
        int num1, num2, num3, min;
        String input1, input2, input3;
        
        input1 = JOptionPane.showInputDialog("Enter your first number");
        input2 = JOptionPane.showInputDialog("Enter your second number");
        input3 = JOptionPane.showInputDialog("Enter your third number");
        
        num1 = Integer.parseInt(input1);
        num2 = Integer.parseInt(input2);
        num3 = Integer.parseInt(input3);
        
        if (num1 < num2) 
            if (num1 < num3)
                    min = num1;
            else
                    min = num3;
   
        else 
            if (num2 < num3)
                    min = num2;
            else 
                    min = num3;
     
        JOptionPane.showMessageDialog(null, "Smallest Number is : " + min);

    }
    
}
