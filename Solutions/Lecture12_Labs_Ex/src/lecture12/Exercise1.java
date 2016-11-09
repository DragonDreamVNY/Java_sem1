package lecture12;

import javax.swing.JOptionPane;

public class Exercise1 {

    public static void main(String[] args) {
        
        String input1 =  JOptionPane.showInputDialog("Enter First Number");
      int numb1 = Integer.parseInt(input1);
      String input2 =  JOptionPane.showInputDialog("Enter Second Number");
      int numb2 = Integer.parseInt(input2);
      String input3 =  JOptionPane.showInputDialog("Enter Third Number");
      int numb3 = Integer.parseInt(input3);
      String input4 =  JOptionPane.showInputDialog("Enter Forth Number");
      int numb4 = Integer.parseInt(input4);
      String input5 =  JOptionPane.showInputDialog("Enter Fifth Number");
      int numb5 = Integer.parseInt(input5);
      String input6 =  JOptionPane.showInputDialog("Enter Sixth Number");
      int numb6 = Integer.parseInt(input6);
      String input7 =  JOptionPane.showInputDialog("Enter Seventh Number");
      int numb7 = Integer.parseInt(input7);
      String input8 =  JOptionPane.showInputDialog("Enter Eighth Number");
      int numb8 = Integer.parseInt(input8);
      
      System.out.println ("The Sum of " + numb1 + " and " + numb2 + " is: " + sum1 (numb1, numb2));
      System.out.println ("The Subtraction of " + numb3 + " from " + numb4 + " is: " + sum2 (numb3, numb4));
      System.out.println ("The Multiplication of " + numb5 + " and " + numb6 + " is: " + sum3 (numb5, numb6));
      System.out.println ("The Division of " + numb7 + " by " + numb8 + " is: " + sum4 (numb7, numb8));
     
    }
    public static int sum1(int numb1, int numb2) {
        int sum1 = (numb1 + numb2);
        return sum1;
    }
    public static int sum2(int numb3, int numb4) {
        int sum2 = (numb3 - numb4);
        return sum2;
    }
    public static int sum3(int numb5, int numb6) {
        int sum3 = (numb5 * numb6);
        return sum3;
    }
        
    public static int sum4(int numb7, int numb8) {
        int sum4 = (numb7 / numb8);
        return sum4;
    }
    
}
