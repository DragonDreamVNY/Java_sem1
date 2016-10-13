
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
        
        //random number variables
        int min = 1;
        int max = 1000;
        int randomNum;
        int array1 [] = new int[100]; // 100 elements in this array
        int large = min; //comparison, starts at the lowest
        
        //generate 100 random numbers
        for (int i = 0; i < 100; i++) {
            randomNum = ThreadLocalRandom.current().nextInt(min, max +1); 
            array1[i] = randomNum;  //array now has values being assigned..
            System.out.print(randomNum + ", ");
            
            // largest number is...
            // if the value of this Index is bigger than the last largest
            if (array1[i] > large){
                large = array1[i]; //you the new Alpha/ big boss/ GodFather/King of the Rock, 
            } //end if
            
        }
        System.out.println("\n The Largest number is : " + large);
        
        
        
        
        
    }// end main 
} //end class
