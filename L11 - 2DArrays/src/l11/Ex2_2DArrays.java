/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l11;

import javax.swing.JOptionPane;
import java.util.Random;
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
        Random rand = new Random ();
        int rows = 20;
        int cols = 10;
        int min = 0;
        int max = 29;
        boolean usedNum[][] = new boolean[20][10]; //compare used numbers to this array
        
        // fill array with random numbers
        for (int r = 0; r < array.length; r++){ // rows 0,1,2..19
            for (int c = 0; c<10; c++){ // columns 0,1,2..9
                array[r][c] = rand.nextInt(30 + 1); //populate the matrix array with random values in range {0..30}
                System.out.print( array[r][c] + "\t"); //print each element in the Row ...
            } //end column FOR
            System.out.println(""); //new line for each Row
        } // end row FOR
        
        // print the array
        for(int r = 0; r < array.length; r++){
            for (int c = 0; c<10; c++){
                System.out.print( array[r][c] + "\t"); //print each element in the Row ...
            }
            System.out.println(""); //new line for each Row
        
        }
            
            
    } //end main
    
} //end class
