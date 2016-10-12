package printarmstrongnumbers;

import javax.swing.JOptionPane;

public class PrintArmstrongNumbers {

    public static void main(String[] args) {
        //declare vars
        final int MAX = 999;
        int n = 100;
        int digit1, digit2, digit3, temp, total;
        String output = "The following are the list of Armstrong numbers between " + n + " and " + MAX + "\n";

        //loop while n < max
        while (n < MAX) {

            //assign temp the value of n - we need to do this as temp will ne broken up into three digits
            temp = n;

            //extract digit1, digit2 and digit3 from temp
            digit1 = temp / 100;

            temp = temp % 100;

            digit2 = temp / 10;

            temp = temp % 10;

            digit3 = temp;

            //raise digit1, digit2 and digit3 to the power of 3 and sum their values
            total = (int) Math.pow(digit1, 3) + (int) Math.pow(digit2, 3) + (int) Math.pow(digit3, 3);

            //if total == n you have an Armstrong number
            if (total == n) {
                output += total + "\n";
            }

            //increment n and move onto the next number
            n++;

        }//end loop

        //display all Armstrong numbers in a message box
        JOptionPane.showMessageDialog(null, output);
    }

}
