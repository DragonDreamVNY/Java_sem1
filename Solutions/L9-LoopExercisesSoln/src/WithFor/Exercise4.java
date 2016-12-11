package WithFor;

import javax.swing.JOptionPane;

public class Exercise4 {
   
    /*----------
    * Exercise 4
    * Accept a positive number (let’s call it N) from the user and print the first N rows of the following table. 
    * For example the following output assumes that N = 4.
    1
    2 4 
    3 6 9
    4 8 12 16
    * ------------*/
    public static void main(String[] args) {
          
         String input = JOptionPane.showInputDialog("Enter positive value");
         int n = Integer.parseInt(input);
         
         for (int i =1; i <= n; i++) {
             for (int j =1; j <=i; j++)
                 System.out.print(j * i + "\t");
            
            System.out.println("");
         
         }//end for
    
    }//end main
    
}//end class
