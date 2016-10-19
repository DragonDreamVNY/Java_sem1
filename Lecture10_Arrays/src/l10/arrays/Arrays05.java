
package l10.arrays;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author DragonDream
 * ex 5. array with 5000 elements
 * random values {0 .. 29}
 * output Frequency of each number 0 .. 29 which is stored in array
 * output Modal Value which appears most frequently in array
 */
public class Arrays05 {

    public static void main(String[] args) {
       
        int randomNums[] = new int[5000]; //array with 5000 elements
        int freq[] = new int[30]; //array for 30 values {0..29}
        int min = 0; //variables for limits to Random
        int max = 29;
        
        Random randomVal = new Random(); // special 'Random' variable generating Random Number value
        int randomTemp; //variable for use in the loop before assigning to Array elements
        
        int modal = 0; 
        int compValue = 0;
        
        // ------------------------------------------
        // array with 5000 random values in range 0..29
        //------------------------------------------
        for( int i = 0; i<randomNums.length; i++){
            randomTemp = randomVal.nextInt((max - min) +1) +min; //randomTemp at this index is assigned a random number
            randomNums[i] = randomTemp; //the same randomTemp is assigned to the Array Element at this index..
            
            freq[randomTemp]++; //add a counter for this particular random value in the freq array, 
        } // end for RANDOMS
        
        // ------------------------------------------
        // Print out the number of occurences each 
        //------------------------------------------
        System.out.println("Frequency Table");
        for (int i = 0; i < freq.length; i++) {
            System.out.println("\'" + i + "\' occured " + freq[i] + " times"); //freq[i] array has values stored from last part..
        }
        
        // ------------------------------------------
        // compare frequency value at each index to 
        //------------------------------------------
        compValue = freq[0]; // reset at index 0 to check values 
        for (int i = 0; i <freq.length; i++){
            
            if (freq[i] > compValue){
                modal = i;
                compValue = freq[i];
            } //end if       
        }// end for FREQUENCY
        System.out.println("\nModal Value is " + modal + " which occured " + compValue  + " times.");
        
    } // end main
} // end class
