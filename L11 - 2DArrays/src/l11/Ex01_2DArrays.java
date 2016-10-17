
package l11;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author DragonDream
 *  Ex 1 2D Arrays
 */
public class Ex01_2DArrays {

 
    
    public static void main(String[] args) {
        
        int matrix[][] = new int[3][4];
        Random rand = new Random();
        
        // generate Random numbers and populate array  in range 0..110
        for (int r = 0 ; r < matrix.length; r++){ //rows 0, 1, 2
            
            for (int c = 0; c < 4; c++){ //columns 0, 1, 2, 3
                matrix [r][c] = rand.nextInt(111); //populate the matrix array with random values in range {0..110}
                System.out.print( matrix [r][c] + " "); //print each element in the Row...
            } // end column For
            System.out.println(""); //new line for each Row
        } //end row For
        
        int largest = matrix[0][0];
        int smallest = matrix[0][0];
        
        String outSmall = "";
        String outLarge = "";
        
        for (int r = 0; r < matrix.length; r++){ //row
            for (int c = 0; c < 4; c++) { //col
                
                // check largest
                if (matrix[r][c] > largest) {
                    largest = matrix[r][c];
                    //outLarge += "\nThe largest number in row " + r + " is ";
                    //outLarge += largest;
                    System.out.println("LARGEST Number at row " + r + "\t" + largest);
                } // end if
                
                //  check smallest
                if (matrix[r][c] < smallest){
                    smallest = matrix[r][c];
                    outSmall += ("The smallest number in row " + r + " is " + smallest);
                }
                
               /*
                outSmall += "The smallest number in col " + r + " : " ;
                System.out.println("\nSmallest is " + outSmall); 
                */
               
            } // end Matrix column For
            
            outLarge += "\n"; //new line for each Row
            outSmall += "\n"; //new line for each Row
            
        } //end Matrix row For
         System.out.println(outLarge);
         System.out.println(outSmall);
        //  JOptionPane.showMessageDialog(null, outLarge);
        // JOptionPane.showMessageDialog(null, outSmall);
       
        
    } //end main
    
} // end class
