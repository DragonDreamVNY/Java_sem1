package forloop_examplesrevisit;

import javax.swing.JOptionPane;
/**
 *
 * @author DragonDream
 * exercise 3 - ForLoop version
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */
public class ForLoop_examples3x {

    public static void main(String[] args) {
        int n;
        int i;
        int j = 0;
        String input;
        String output = ""; //start empty, fill during Loop
       
       input =  JOptionPane.showInputDialog(null,"enter your positive number");
        n = Integer.parseInt(input);
        
        if(n <= 0){
            JOptionPane.showMessageDialog(null, "your number must be greater than 0");
        }// end 'stupid User' handler, please don't reproduce
        
        for (i = 1; i <= n;  i++){
            
            while (j < i) { //only one step behind counter 'i'... 
                j++; //prevent infinite loop, catch up to 'i'
            } // end while Row Tabs
            
            output += i; // appended to Output String, followed by 
            output += "\t"; // add a tab to Output String after the current 'i' Output String value
            System.out.println(output); //print next line current output string
        } // end For Loop
        
    } // end main
} // end class
