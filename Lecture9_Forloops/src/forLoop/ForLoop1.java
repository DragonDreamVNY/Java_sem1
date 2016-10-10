
package forLoop;
import javax.swing.JOptionPane;
/**
 *
 * @author K00223361
 * Exercise 2 For Loop
 */
public class ForLoop1 {

    
    public static void main(String[] args) {
        
        int i;
        String output = "";
        
        for (i=0; i <10; i++){
            output += i;
            output += ",";
        }
        
        JOptionPane.showMessageDialog(null, output);
        
    } // end main
    
} // end class
