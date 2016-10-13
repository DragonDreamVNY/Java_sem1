package WithFor;


import javax.swing.JOptionPane;

/**
 *
 * @author alan.ryan
 */
public class Exercise6 {

    /**
     * Program to print the factorial of a number which is input from the keyboard
     *
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        int n, c, fact = 1;
        
        String input = JOptionPane.showInputDialog("Enter Number");
        n = Integer.parseInt(input);

       if (n < 0) {
            System.out.println("ERROR. Number must be greater than 0");
            System.exit(0);
        }

        for (c = 1; c <= n; c++) {
            fact = fact * c;
        }
        
        System.out.println("Factorial of " + n + " is = " + fact);
        System.exit(0);
    }

}
