
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
           int i =1; //counter
           String input;
           
           
           input = JOptionPane.showInputDialog("Enter a positive number");
           N = Integer.parseInt(input);
           
           // System.out.println("You've entered : " + N); 
           
           if (N <= 0){ 
             JOptionPane.showMessageDialog(null,"It must be a Positive Number!");
             System.exit(0); 
           } // end if
           
           do{
               System.out.print(i + "/t");
               
               i++;
               
               
               
           } while(i < N); // end while
           
    } // end class
    
    
} // end main
