
package l10.arrays;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author DragonDream
 * ex 6. 
 * create array with 5000 elements
 * fill with random numbers from range {5..50}
 * output arrays in columns of 20 values/elements
 * output arrays in multiples of 6, 7, and  8 along with the Index
 * if no output in multiples of 6,7, && 8, display error message.
 * 
 */
public class Arrays06 {

    
    public static void main(String[] args) {
        
        int min = 5;
        int max =500;
        int array1 [] = new int [5000];
        Random rands = new Random();
        boolean isTrueOrFalse = false;
        
        for (int i = 0; i < array1.length; i++){ //generates 5000 random numbers...
            int randomNum = rands.nextInt ( (max - min) + 1 ) + min; //
            array1[i] = randomNum; //assign the generated number to the current index of this Loop...
        }
        
        // columns in 20, new line every 20 values
        for(int i = 0; i < array1.length; i++){
            if (i % 20 == 0 ){
                System.out.println(""); //new line
            } //end if multiple 20
            
            System.out.print(array1[i] + "\t");
        } // end for multiples of 20
        
          System.out.println("\n\n");
        
          // array values in multiples of 6,7 and 8 along with index
          for (int i = 0; i < array1.length; i++){
              
              if( (array1[i] %  6 == 0) && ((array1[i] % 7 ==0) ) && ((array1[i] % 8 ==0) )     ){
                  System.out.println(array1[i] + " at index " + i + " is a multiple of 6,7, and 8");
                  isTrueOrFalse = true;
              }
          }
          if (isTrueOrFalse == false){ System.out.println("\nThere are no numbers in multiples of 6, 7 , 8..");}
    } // end main
} // end class
