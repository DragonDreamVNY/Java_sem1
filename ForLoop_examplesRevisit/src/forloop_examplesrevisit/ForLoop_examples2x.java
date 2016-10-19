package forloop_examplesrevisit;
import javax.swing.JOptionPane;

/**
 *
 * @author DragonDream
 * exercise 2: new line every 8 elements
 * 1  2  3  4  5  6  7  8
 * 9 10 11 12 13 14 15 16
 */
public class ForLoop_examples2x {

    public static void main(String[] args) {
       
        int N; // user input
        int i = 0; //counter from 1-8
        String input; //user input to be parsed to Integer Number
        String output = ""; //holder for output appends, may not be needed here...
        
        /*
        User Input
        ========
        */
        input = JOptionPane.showInputDialog(null, "Enter your Number");
        N = Integer.parseInt(input);
        
        // user error handler
        if (N <= 0){
            JOptionPane.showMessageDialog(null, "Your number has to be positive!");
            System.exit(0);
        }
        
        for (i =1; i <=N; i++ ){
            System.out.print(i + "\t");
            if (i % 8 == 0){ 
                System.out.println(); //every 8 elements, New line
            }
        } // end For Loop
        
        
        
        
    } // end main
} // end class
