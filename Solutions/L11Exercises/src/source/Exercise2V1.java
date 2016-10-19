/*

This version DOES NOT ENSURE that the same number cannot occur more 
than once in a given row of the array.

*/

package source;

import java.util.concurrent.ThreadLocalRandom;


public class Exercise2V1 {

   
    public static void main(String[] args) {
        
        final int min = 0;
        final int max = 30;
        
        final int ROWS = 20;
        final int COLS = 10;
        
        int table[][] = new int[ROWS][COLS];
        
        int occuranceCount = 0;
        
        
        //assign a random value to each element in the array
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                table[i][j] = ThreadLocalRandom.current().nextInt(min, max + 1);
            }
        }

        //print the array
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(table[i][j] + ", ");
            }
            System.out.println("");
        }
        
        //determine the how many times 7 and 8 appear sequentially in the array
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                
                //you must break out of the inner loop if you have reached the end of a given row
                //otherwise you will attempt to index a non-existent element in the array
                //this will cause the program to crash
                if (j == COLS-1)
                    break;
                
                //check if 7 and 8 occur sequentially in a row
                if ((table[i][j] == 7 && table[i][j+1]==8)) {
                    occuranceCount++;
                    
                }
        
            }
        }
        
        System.out.println("\nThe number of times 7 & 8 occur sequentially in a row in this array is " + occuranceCount);
        
        
    }
    
}
