
package l11;
import java.util.Random;
import javax.swing.JOptionPane;

/**
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
        
        int largest = matrix[0][0]; //large and small Variables for comparing/holding
        int smallest = matrix[0][0];

        String outLarge = "";
        String outSmall = "";
        
        for (int r = 0; r < matrix.length; r++){ //row
            largest = 0;
            smallest = 110;
            for (int c = 0; c < 4; c++) { //col
                //reset both values each loop before comparing again to the value at the new Index [c] at row [r]
               
                // check largest
                if (matrix[r][c] > largest) {
                    largest = matrix[r][c];
                } // end if
                
                //  check smallest
                if (matrix[r][c] < smallest){
                    smallest = matrix[r][c];
                }
            } // end Matrix column For    
            System.out.println("The largest number on Row " + r  + " is " + largest);
            System.out.println("The smallest number on Row " + r  + " is " + smallest);
        } //end Matrix row For
        
       
    } //end main
    
} // end class
