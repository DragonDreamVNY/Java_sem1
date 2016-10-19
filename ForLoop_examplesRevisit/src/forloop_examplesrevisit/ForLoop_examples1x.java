
package forloop_examplesrevisit;

/**
 *
 * @author DragonDream
 * exercise 1
 * 100 numbers
 * new row every 10 values
 */

public class ForLoop_examples1x {


    public static void main(String[] args) {
        
        int n ;
        final int MAX = 100;
        
        for (n=1; n <= MAX; n++) { //initialise n, check True/False, execute statements, add n
            System.out.print (n + "\t");
            if (n % 10 == 0) {
                System.out.println();  
            }
        }
        
    } //end main 
} // end class
