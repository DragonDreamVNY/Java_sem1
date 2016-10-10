
package forLoop;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author K00223361
 * exercise 3
 */
public class ForLoop2 {
    
    
    public static void main(String[] args){
        
        int n, limit;
        String inPos, inLim, output;
        
        //user inputs Positive Number
        inPos = JOptionPane.showInputDialog(null, "Enter a positive value");
        n = Integer.parseInt(inPos);
        
        // quit the program if not Positive Number
        /* ====
        if (n <=0){
            JOptionPane.showMessageDialog(null, "it must be a postive number");
            System.exit(0); 
        }
        ==== */
        
        // user inputs Upper Limit
        inLim = JOptionPane.showInputDialog(null, "Enter an upper limit");
        limit = Integer.parseInt(inLim);
        
        // multiples of value up to the limit
        //base value of user input 
        int multi = n;
        output = "";
        
        for (n = Integer.parseInt(inPos) ; n <= limit; n += multi) {
            output += n;
            output += "\t";
            
            // add a New line every 5 multiples
            if(n % (multi*5) == 0){
                output += "\n";
            } //end if
            
        } //end Forloop
        
        
        JTextArea textAreal = new JTextArea(output, 40, 50);
        textAreal.setLineWrap(false);
        
        System.out.println(output);
        JOptionPane.showMessageDialog(null, textAreal);
        
    } // end main
    
} //end class

