
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
        
        int even[] = new int[100];
        int odd[] = new int[100];
        int sumEven = 0;
        int sumOdd = 0;
        
        System.out.println("Array with 100 elements : \n");
        
        for (int i = 0; i < array.length; i++) {
            //new line every 5 elements
            if (i % 5 == 0 ){ System.out.println(""); } 
            
            //-----------  
            //check for EVEN index and even values
            //-----------
            if(i % 2 ==0) { //check index is EVEN
                //------
                do { // check for and generate EVEN values only, loop until EVEN
                    randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                }while ( !(randomNum % 2 == 0)); //won't execute again if NOT EVENT is True, can also say while( (randomNum % 2 == 0) == FALSE)
            } //end for
            
            else { //Imma keep doin this Random Number until it TRUE
                do {
                    randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                } while ( (randomNum % 2 == 0)); //execute if TRUE
            } //end for  
            // if and else finishes once Condition is satisfied
            //------
            array[i] = randomNum;
            System.out.print(array[i] + "\t");
            
            even[i] = array[i]; //add the current EVEN value to EVEN array
            sumEven += even[i]; //sumEven keeps getting bigger! 
            
            //-----------  
            //check for ODD index and even values
            //-----------
            if(i % 2 == 1) { //check index is ODD... note: (0 % 2 == 0), (1 % 2 == 1), (2 % 2 == 0) etc..
                //------
                do { // check for and generate ODD values only, loop until EVEN
                    randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                }while ( !(randomNum % 2 == 1) ); //won't execute again if NOT ODD is True, loop when False
            } //end for
            
            else {              
                do {
                    randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                }while ( (randomNum % 2 == 1)); //execute if TRUE, then keep this number for this Odd Value at this Odd Index
            } //end for  
            // if and else finishes once Condition is satisfied
            //------
            array[i] = randomNum; //assign ODD value to this array index
            System.out.print(array[i] + "\t");
            
            odd[i] = array[i]; //add the current ODD value to ODD array
            sumOdd += odd[i]; //sumOdd keeps getting bigger, what a whopper! 

        } //end FOR
        
        //------
        // Sum of Evens, Sum of Odds
        //------
        System.out.println("\nSum of the Odd Numbers in array is : " + sumOdd);
        System.out.println("Sum of the Even Numbers in array is : " + sumEven);
        
        //------
        // powers
        //------
        /*
        int first = array[0];
        
        for (int i = 0; i < 100; i++){
            if (i % 5 == 0 ){ System.out.println(""); } //new line every 5 elements
            
            if (i == 99){
                array[1] = (int)Math.pow( (array[i]), (array[i+1]) );   
            } //end if last index
            else {
                array[i] = (int)Math.pow( (array[i]), (array[i+1]) );   
            }// end else
            System.out.print("P " + array[i] + "\t");
        } //end Power FOR
        */
        
        
        int first = array[0];
            for (int i =0; i < array.length; i++){
                //new line every 5 elements
                if (i % 5 == 0 ){ System.out.println(""); }
                
                //start POWER UP! Do the SUPER MARIO
                if (i == 99)
                    array[i] = (int)Math.pow((double) array[i],(double)first);
                else {
                    array[i] = (int)Math.pow((double) array[i], (double) array [i+1]);
                }
                System.out.print(array[i] + "\t\t");
                        
                 
        
            } //end POWER for
    } //end main
    
}// end class
