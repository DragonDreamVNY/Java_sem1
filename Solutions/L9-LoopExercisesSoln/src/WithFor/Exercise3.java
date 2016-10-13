package WithFor;

import javax.swing.JOptionPane;

public class Exercise3 {

    public static void main(String[] args) {
         String input = JOptionPane.showInputDialog("Enter positive value");
         int n = Integer.parseInt(input);
                  
         for (int i =1; i <=n; i++) {
             for (int j =1; j <=i; j++)
                 System.out.print(j + "\t");
            
            System.out.println("");
         
         }//end for
    
    }//end main

}//end class