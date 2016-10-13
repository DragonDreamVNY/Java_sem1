
package l10.arrays;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author DragonDream
 * ex 3:  two x 5 DOUBLES inputs , two arrays
 */
public class Arrays03 {


    public static void main(String[] args) {
       
     double array1 [] = new double[5]; // declare first array for 5 user inputs and the Type
     double array2 [] = new double[5]; // declare second  array for 5 user inputs and the Type
        
        String input = "";  //initialise String for user input
        
        // get user input (part 1)...
         System.out.println("First array...");
        for (int i = 0; i<5; i++ ) {
                input = JOptionPane.showInputDialog("Please enter a number ");  
                array1 [i] = Double.parseDouble(input);
                System.out.print(array1[i] + "\t");      
        } //end Loop for User inputs... 
        //there should be five values stored in 5 Indexes/Elements...
        
        System.out.println(); //line break for Testing purposes
        
          // get user input (part 2)...
          System.out.println("Second array...");
        for (int j = 0; j<5; j++ ) {
                input = JOptionPane.showInputDialog("Please enter a number ");  
                array2 [j] = Double.parseDouble(input);
                System.out.print(array2[j] + "\t");      
        } //end 2nd Loop for User inputs... 
       
        // To Do: swap contents of array1 with array2 and Output both 
        double  temp []; //temporary array variable to swap values between the two contents
        
       // System.out.println("\n First Array : " +  Arrays.toString(array1)  + "\n Second  Array : " + Arrays.toString(array2) ); 
       JOptionPane.showMessageDialog(null, 
                                                                ("\n First Array : " +  Arrays.toString(array1)  + 
                                                                    "\n Second  Array : " + Arrays.toString(array2)) , 
                                                                        "First Set Before Swap", 
                                                                            JOptionPane.INFORMATION_MESSAGE);

        //SWAPPING
        temp = array1; //temporary 
        array1 = array2; // first array gets overwritten with the values from the second
        array2 = temp; 
       
        JOptionPane.showMessageDialog(null,
                                                                ("\n First Array : " +  Arrays.toString(array1)  + 
                                                                        "\n Second  Array : " + Arrays.toString(array2)), 
                                                                            "After Swap",
                                                                                JOptionPane.INFORMATION_MESSAGE);
         
        
    } //end main
} // end class
