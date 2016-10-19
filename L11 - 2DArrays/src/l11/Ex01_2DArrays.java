
package l11;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author DragonDream
 *  Ex 1 2D Arrays
 */
public class Ex01_2DArrays {

    public static void main(String[] args) {
        
        final int ROWS = 3;
        final int COLS = 4;
        int largest = 0; //large and small Variables for comparing/holding
        int smallest = 0;
        
        int matrix[][] = new int[3][4]; //2D array with 3 rows and 4 cols. 
        Random rand = new Random();
        
        // generate Random numbers and populate array/matrix  in range 0..110
        for (int r = 0 ; r < matrix.length; r++){ //rows 0, 1, 2
            for (int c = 0; c < 4; c++){ //columns 0, 1, 2, 3
                matrix [r][c] = rand.nextInt(110 + 1); //populate the matrix array with random values in range {0..110}
            } // end column For
        } //end row For
        
        // print array/matrix
        System.out.println("Values in matrix are : ");
        for (int r = 0; r < matrix.length; r++) { //could also use final ROWS instead of matrix.length to be safe...
            for (int c = 0; c < COLS; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println(""); //new line for each Row
        }
        
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
            System.out.println("\nThe largest number on Row " + r  + " is " + largest);
            System.out.println("The smallest number on Row " + r  + " is " + smallest);
        } //end Matrix row For
        
       
    } //end main
    
} // end class
