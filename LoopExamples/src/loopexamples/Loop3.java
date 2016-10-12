
package loopexamples;

import javax.swing.JOptionPane;
/**
 *
 * @author K00223361
 * Exercise 3. Loop Exercises
 */
public class Loop3 {
    
    public static void main (String[] args){
    
           int N; //number
           int i =0; //counter to compare to N
           int j =0; //counter for row
           String input;
           String output = ""; //must use this variable to Append onto the result each Loop
           
           /* User enters a Positive Number */
           input = JOptionPane.showInputDialog("Enter a positive number");
           N = Integer.parseInt(input);
           
           if (N <= 0){ 
                JOptionPane.showMessageDialog(null,"It must be a Positive Number!");
                System.exit(0); 
            } // end if
           
           /*   */
            do {
               i++; // add one starting
               output += i;  // append to output:  1 ->     1 \n 1 2 ->     1 \n 1 2 \n 1 2 3
               
               while (j < i) { // Let j (row) catch up to i (counter), or else it'll loop too many times if compared to N
                   output += "\t"; //append Tabs to the String output  
                   j++;
               }
             System.out.println(output); //jump to next line and print Output content up to now.
           }  while (i < N) ;// end while
           
    } // end class
    
    
} // end main
