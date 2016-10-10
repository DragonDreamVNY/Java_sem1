 
package loopexamples;

import javax.swing.JOptionPane;
/**
 *
 * @author DragonDream
 * Exercise 2 Loop examples
 */
public class Loop2 {

    
    public static void main(String[] args) {
        
        int N;
        int i = 1; 
        
        String input = JOptionPane.showInputDialog("Enter your Number");
        N = Integer.parseInt(input);
        
        // String output = System.out.println(("\t" + N)) ;
                
        while (i < N ){
            System.out.print(i + "\t");
            
            if (i % 8 == 0) {
            System.out.println("\n");
            }
            
        i++;
        
        
        }
    
    }
}