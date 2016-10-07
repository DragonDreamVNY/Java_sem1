
import javax.swing.JOptionPane;

/**
 *
 * @author alan.ryan
 */
public class LabExercise3 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter Number");
        int value = Integer.parseInt(input);

        int factorSum = 1;

        int b = 2;

        while (b <= value / 2) {

            if (value % b == 0) {
                factorSum += b;
           
            }

            b++;
      
        }//end while    

        if (factorSum == value) {
            JOptionPane.showMessageDialog(null, value + " is a perfect number");
        } else {
            JOptionPane.showMessageDialog(null, value + " is NOT a perfect number");
        }

    }

}
