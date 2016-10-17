package source;

import javax.swing.JOptionPane;

public class Exercise2 {

    public static void main(String[] args) {

        double values[] = new double[10];
        double sum = 0.0;
        double average;

        for (int i = 0; i < values.length; i++) {

            String input = JOptionPane.showInputDialog("Enter a number");
            values[i] = Double.parseDouble(input);
        }

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        average = sum / values.length;
        
        JOptionPane.showMessageDialog(null, "Average is " + average);

    }

}
