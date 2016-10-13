
package l10.arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author DragonDream
 * ex 1 accept 10 numbers 
 */
public class Arrays01 {

    
    public static void main(String[] args) {
        int numberArray [] = new int[10]; // declare array for user input and the Type
        String input = "";
        
        for (int i = 0; i<10; i++ ) {
                input = JOptionPane.showInputDialog("Please enter a number ");  
                numberArray [i] = Integer.parseInt(input);
        } //end Loop for User inputs
        
        for (int i = 9; i >= 0; i--){
            JOptionPane.showMessageDialog(null, "Your numbers in array" + numberArray[i]);
            
        } //Loop countdown, to display in reverse of how they were stored
        
    
        
    
    } // end main
    
} //end class
