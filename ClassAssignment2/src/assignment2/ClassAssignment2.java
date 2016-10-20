
package assignment2;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author k00223361
 * Assignment 2 : 20thOct2016
 * 
 *  1. array with 100 elements
 *  2. random value in range {0..10}
 *  i . odd numbers at odd indexes
 *  ii. even numbers at even indexes
 *  3. print in rows of 5
 *  4. sumEVEN, sum ODD
 *  5. number[i] to power of next number index[j]  Need new Array for this
 *  6. print in rows of 5 use For Loop for this new Array
 */
public class ClassAssignment2 {

    public static void main(String[] args) {
       
        int rands[] = new int[100]; 
        int even[] = new int[100];
        int odd[] = new int[100];
        
        int min = 1;
        int max = 10;
        int randomValue = 0;
        int sumEven = 0;
        int sumOdd = 0;
        
        
        //init array with random values in range 1..10
        System.out.println("Array with 100 elements : \n");
        for (int i = 0; i < rands.length; i++) {
            randomValue = ThreadLocalRandom.current().nextInt(min, max + 1);
            //rands[i] = randomValue; // assign randomValue to this index
            
            //-----------
            //check for even index and even value
            //-----------
            if((i % 2 == 0 ) && (randomValue % 2 == 0)){ 
                    rands[i] = randomValue; 
                    even[i] = rands[i];
                    System.out.print("even " + even[i] + "\t");
                    sumEven += even[i];
            } 
            else while(randomValue % 2 != 0){ 
                        even[i] = (randomValue = ThreadLocalRandom.current().nextInt(min, max + 1)); //re-assign new value
                        System.out.print("NOW IS EVEN " + even[i] + "\t");
                        //System.out.print("NOT EVEN " + rands[i] + "\t");
                    }//END WHILE loop re-assign random to be Even Value, keep looping this until it is EVEN
            
            
                /*if (randomValue % 2 == 0){//check for even number value
                    //even[i] = rands[i];// assign to even[index] in the array
                    rands[i] = randomValue; //assign random generated value to rands array
                    even[i] = rands[i];// assign same value to even[index] in the array
                    System.out.print("even " + even[i] + "\t");
                    sumEven += even[i]; //add the Sum total for Even values in the array
                }
                */
                
                /*
                else {
                    rands[i] = randomValue;
                    System.out.print("NOT EVEN " + rands[i] + "\t");
                    //System.out.print("NOT EVEN " + rands[i] + "\t");
                }
            }// end EVEN index check + print
               */  
             
           
            //-----------  
            //check for odd index
            //-----------
            if (i % 2 == 1 ){ 
                if (randomValue % 2 == 1){//check for odd number value
                    //odd[i] = rands[i];;// assign to odd[index] array : this gets skipped if this loop is Even 
                    rands[i] = randomValue;
                    odd[i] = randomValue; // assign to odd[index] in the array
                    System.out.print("odd " + odd[i] + "\t");
                    sumOdd += odd[i]; //add the Sum total for Odd values in the array
                }
                
                else {
                    rands[i] = randomValue;
                    System.out.print("NOT ODD " + rands[i] + "\t");
                    //System.out.print("NOT ODD " + rands[i] + "\t");
                }
                
           } //end ODD index check and print
           
            
            //new every 5 elements line
            if (i % 5 == 0 ){
                System.out.println(""); 
            } //end if multiple 5
            
        } //end FOR
        
        System.out.println("\nSum of the Odd Numbers in array is : " + sumOdd);
        System.out.println("Sum of the Even Numbers in array is : " + sumEven);

        //-----------
        // raise each number in array to power of next number
        //-----------
        int n = 0;
        int m = 0; 
        int powVal = 0;
        int power[] = new int[100];
        for(int i = 0; i < 100; i++){
            
            /*
            n = (int)Math.pow( (rands[i]) ,(rands[i+1]) ); //I don't want a double... 
            m = (int)Math.pow( (odd[i]) ,(even[i+1]) );
            
            System.out.print("even^" + n + "\t");
            System.out.print("odd^" + m + "\t");
            */
            
            /*
            power[i] = (int)Math.pow( (rands[i]) ,(2) );
            System.out.print("POW^ = " + power[i] + "\t");
            */

            if(rands[i] < rands.length){  
                powVal = (int)Math.pow( (rands[i]),(rands[i+1]) ); // randValue to power of next randValue
                power[i] = powVal;
                System.out.print("POW^ = " + power[i] + "\t");
            } 
            else if (rands[i] == rands.length){ //this will be false until the last randValue in the array
                powVal = (int)Math.pow( (rands[i]),(rands[0]) ); // last randValue, then power to the first RandValue
                power[i] = powVal;
                System.out.print("POW^ = " + power[i] + "\t");
            }
            
            
            //new line every 5 elements
            if (i % 5 == 0 ){
                System.out.println(""); 
            } //end if multiple 5
            
        } //end FOR Power array
        
        
    } // end main
    
} // end class
