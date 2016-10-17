
package l10.arrays;
import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom; //random number Thread Local Random class is imported
/**
 *
 * @author DragonDream
 * ex 4 : 100 element Array[] with random numbers in the range 1..1000
 * 1. display largest number in array
 * 2. smallest number in array
 * 3. sum of all numbers (sum variable)
 * 4. average of all numbers (divide 'sum 'by100)
 * 5. Frequency of number '7' in array ????
 */
class Arrays04 {
    
    public static void main (String[] args){
        
        //Variables
        int min = 1;
        final int MAX = 1000;
       
        int array1 [] = new int[100]; // 100 elements in this array
        int randomNum = array1[0];  //randomNum will be over written by array in the For Loop
        
        int large = 0; //comparison, starts at the lowest       
        int small = 0; 
        small = randomNum; // assume first entered number is small
        
        String out = "";
        int sum = 0;
        
        int count7 = 0; //counter for number '7'
        
        //generate 100 random numbers
        for (int i = 0; i < 100; i++) {
            randomNum = ThreadLocalRandom.current().nextInt(min, MAX +1); 
            array1[i] = randomNum;  //array now has values being assigned..
            System.out.print(randomNum + ", ");
            
        // largest number is...
            // if the value of this Index is bigger than the last largest
            if (array1[i] > large){
                large = array1[i]; //you the new Alpha/ big boss/ GodFather/King of the Rock, 
            } //end LARGEST if
            
            // smallest number is...
                // if the value of this Index is bigger than the last largest
            if (array1[i] < small) {
                small = array1[i]; //you are the new underDog, 
            } //end SMALLEST if
            
            // Sum of all numbers
            sum += array1 [i]; 

            // frequency of '7' in the array
            // check 1st digit, 2nd digit, 3rd digit and see if these are '7', add to 'count7'
            if ( array1[i] / 100 == 7 )
                count7 ++;
             //end if for 1st digit
            
            if( array1[i] /10 == 7)
                count7++;
            //end if for 2nd digit
            
             if( array1[i] % 10 == 7)
                count7++;
            //end if for 3rd digit
            
        } // end Loop
        
        System.out.println("\n The Largest number is : " + large);
        System.out.println("\n The Smallest number is : " + small);
        System.out.println("\n The Sum of all numbers is : " + sum);
        //average of the 100 numbers in array
        System.out.println("\n The average of all numbers is : " + (sum)/100);
         
        // frequency of number 7 in the random number array
        System.out.println("\n The number of times 7 appears : " + count7);
        
         
         
    }// end main 
} //end class
