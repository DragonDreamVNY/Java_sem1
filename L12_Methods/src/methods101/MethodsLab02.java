package methods101;
import javax.swing.JOptionPane;
/**
 *
 * @author DragonDream
 * 1. accepts two numbers from the user
 * 2. accepts two integer values and returns nothing
 * 3. output an Error message if the second number is smaller than the first
 * 4. output the sum of the integers
 */
public class MethodsLab02 {

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter your first number ");
        String input2 = JOptionPane.showInputDialog("Enter your second number ");
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        
        acceptAndAdd(num1,num2); //invoke method
        
    }// end main method
    
    /*----------
    check values from user and add them METHOD
    ----------*/
    public static int acceptAndAdd (int n1, int n2){
        int sum = 0;
        if (n2 < n1){
            System.out.println("your second number is smaller than the first");
            JOptionPane.showMessageDialog(null, "ERROR! Your second number " + n2 + 
                                            " is smaller than the first " + n1);
            System.exit(0);
            
        } else { sum = n1 +n2;}
        System.out.println("sum of your numbers :\t" + sum);
        JOptionPane.showMessageDialog(null, "Sum of your numbers :\t" + sum);
        return sum;
        
    }
   
    
} // end class 
