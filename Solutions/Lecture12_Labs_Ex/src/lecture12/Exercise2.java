package lecture12;

import javax.swing.JOptionPane;

public class Exercise2 {

    public static void main(String[] args) {
        
        String input1 =  JOptionPane.showInputDialog("Enter First Number");
      int numb1 = Integer.parseInt(input1);
      String input2 =  JOptionPane.showInputDialog("Enter Second Number");
      int numb2 = Integer.parseInt(input2);
      
      printMessage(numb1, numb2); 
    }
    
    public static void printMessage(int numb1, int numb2){
        int sum=0;
    
        if (numb1>numb2)
            System.out.println ("You Have an Error");
        
        else
            for (int i = numb1; i<numb2; i++){
                sum+=i;
            }
            System.out.println ("Your Total is " + sum);
            
    
    }
}