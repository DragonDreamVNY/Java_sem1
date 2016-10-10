 
package loopexamples;

import javax.swing.JOptionPane;
/**
 *
 * @author DragonDream
 */
public class loop2 {

    
    public static void main(String[] args) {
        
        int N;
        int i = 0; 
        
        String input = JOptionPane.showInputDialog("Enter your Number");
        N = Integer.parseInt(input);
        
        // String output = System.out.println(("\t" + N)) ;
                
        while (i < N )
            if (i % 8 == 0) {
            System.out.print("\n" );
            }
            
        i++;
        System.out.print(i);
        
    }
    
}
