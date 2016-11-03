/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l11;

import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author DragonDream
 * ex 2 :
 * 2D array [20r] [10c]
 * give each element a Random Number in range {0..30}
 * single value cannot appear more than once in each row
 * print/ display contents of array Row, by Row
 * Frequency of the numbers 7, 8 appear sequentially in the array
 */
public class Ex2_2DArrays {

    
    public static void main(String[] args) {
        int array[][] = new int[20][10]; //20 rows, 10 columns
        int randomNum;
        
        int rows = 20;
        int cols = 10;
        int min = 0;
        int max = 30;
        boolean usedNum[] = new boolean[31]; //compare used numbers to this array
        int occurence = 0;
        
        // fill array with random numbers
        for (int r = 0; r < array.length; r++){ // rows 0,1,2..19
            for (int c = 0; c<10; c++){ // columns 0,1,2..9
                
                do {
                randomNum = ThreadLocalRandom.current().nextInt(min, max + 1); //populate the matrix array with random values in range {0..30}
                } while(usedNum[randomNum] == true ); //
                
                //Put the random number into the array at row i and col j
                array[r][c] = randomNum;
                
                //Set element randomNum in the usedNumbers array to ' true '
                //This indicates that this number has been used/generated in this row
                usedNum[randomNum] = true;
                
                
            } //end column FOR
             Arrays.fill(usedNum, false); //after filling Row in array, sets all Array elements to False       
        } // end row FOR
 
        // print the array
        for(int r = 0; r < array.length; r++){
            for (int c = 0; c<10; c++){
                System.out.print( array[r][c] + "\t"); //print each element in the Row ...
            } // end For Columns
            System.out.println(""); //new line for each Row
        
        } //end For Row
            
        
       // number of times 7 and 8 occur sequentially
       for (int r = 0; r < array.length; r++){
           for(int c = 0; c < cols; c++){
                 if (c == cols-1){ break; }  //break out of loop if reach end of a given row (column length)   
                //check if 7 and 8 occur sequentially in a row
                if ((array[r][c] == 7 && array[r][c+1]==8)) { 
                    occurence++; 
                } //end if occurence
                 
            } // end for COLS 
         } //end For Rows
        System.out.println("\nThe number of times 7 & 8 occur sequentially in a row in this array is " + occurence);

    } //end main
    
} //end class
