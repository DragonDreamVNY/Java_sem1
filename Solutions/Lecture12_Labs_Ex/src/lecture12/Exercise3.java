package lecture12;

import javax.swing.JOptionPane;

public class Exercise3 {

    public static void main(String[] args) {
        
        String input1 =  JOptionPane.showInputDialog("Enter First Number");
      int numb1 = Integer.parseInt(input1);
      String input2 =  JOptionPane.showInputDialog("Enter Second Number");
      int numb2 = Integer.parseInt(input2);
      
      System.out.println ("The Hypotenuse of this Triangle is " + hyp(numb1, numb2)); 
    }
    
    public static double hyp(int numb1, int numb2){

        double hyp;
        hyp = Math.sqrt((Math.pow(numb1,2) + Math.pow(numb2,2)));
        return hyp;
    }
}