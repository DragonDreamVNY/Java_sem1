
package classtest2revisit;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author DragonDream k00223361
 *  1. array with 100 elements
 *  2. random value in range {0..10}
 *  i . odd numbers at odd indexes
 *  ii. even numbers at even indexes
 *  3. print in rows of 5
 *  4. sumEVEN, sum ODD
 *  5. number[i] to power of next number index[j]  Need new Array for this
 *  6. print in rows of 5 use For Loop for this new Array
 */


public class ClassTest2Revisit {

  
    public static void main(String[] args) {
        int array[] =new int[100]; //100 element array
        int min = 1;
        int max = 10;
        int randomNum;

        System.out.println("Array with 100 elements : \n");
        
        for (int i = 0; i < array.length; i++) {
            //new line every 5 elements
            if (i % 5 == 0 ){ System.out.println(""); } //end if multiple 5
            
//-----------  
//check for EVEN index and even values
//-----------
            if(i % 2 ==0) { //check index is EVEN
                //------
                do { // check for and generate EVEN values only, loop until EVEN
                    randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                }while ( !(randomNum % 2 == 0)); //won't execute again if NOT EVENT is True, can also say while( (randomNum % 2 == 0) == FALSE)
            } //end if
            
            else {             
                do {
                    randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                } while ( (randomNum % 2 == 0)); //execute if TRUE
            } //end else Do

            array[i] = randomNum;
            System.out.print(randomNum + "\t");
        } //end for
        
        
        int evensum = 0;
        int oddsum =0;
//-----------  
//check for ODD index and even values
//-----------
        for (int i = 0; i < array.length; i++){
                if(array[i] % 2 == 0) {//check index is EVEN
                    //System.out.print (array[i]);
                    evensum = evensum + array[i];   
                }
                else{
                    oddsum = oddsum + array[i];
                }
            } //end for  
//------
// Sum of Evens, Sum of Odds
//------
        System.out.println("\nThe Sum of all Even Numbers are: " + evensum);
        System.out.println("\nThe Sum of all Odd Numbers are: " + oddsum);
        
//------
// powers
//------
        
        int first = array[0];
        
        for (int i = 0; i < 100; i++){
            if (i % 5 == 0 ){ System.out.println(""); } //new line every 5 elements
            
            if (i == 99){
                array[i] = (int)Math.pow( (double)array[i],(double)first);   
            } //end if last index
            else {
                array[i] = (int)Math.pow( (double)array[i], (double)array[i+1] );   
            }// end else
            System.out.print(array[i] + "\t");
        } //end Power FOR
        
    } //end main
    
}// end class
