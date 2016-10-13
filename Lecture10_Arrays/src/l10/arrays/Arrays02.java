
package l10.arrays;

import javax.swing.JOptionPane;
/**
 *
 * @author DragonDream
 * ex 2 calc and print averages of array
 */
public class Arrays02 {

    public static void main(String[] args) {
        
        double numberArray [] = new double[10]; // declare array for 10 user inputs and the Type
        String input = ""; 
        double sum = 0; //variable for storing sums of  DOuBLE numbers, READ THE Brief properly Vin
        
        for (int i = 0; i<10; i++ ) {
                input = JOptionPane.showInputDialog("Please enter a number ");  
                numberArray [i] = Double.parseDouble(input);
                sum += numberArray [i]; // value of number array is added to Sum total
                System.out.println(sum + ", ");
        } //end Loop for User inputs, should be ten values stored in 10 Indexes/Elements...
        
    
         // Note: sum of all inputs use SUM += index[i]/10 -> because user enters 10 numbers   
         // ============================
         System.out.println("The Average of all your Inputs is : " + (sum/10));
        
         
                
    } // end main
    
} // end class
