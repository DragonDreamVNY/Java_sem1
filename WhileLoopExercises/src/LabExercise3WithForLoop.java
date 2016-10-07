/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alan.Ryan
 */
import javax.swing.JOptionPane;

/**
 *
 * @author alan.ryan
 */
public class LabExercise3WithForLoop {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter Number");
        int value = Integer.parseInt(input);

        int factorSum = 1;

        for (int b = 2; b <= value / 2; b++) {
            if (value % b == 0) {
                factorSum += b;
            }
        }
        if (factorSum == value) {
            JOptionPane.showMessageDialog(null, value + " is a perfect number");
        } else {
            JOptionPane.showMessageDialog(null, value + " is NOT a perfect number");
        }

    }

}
