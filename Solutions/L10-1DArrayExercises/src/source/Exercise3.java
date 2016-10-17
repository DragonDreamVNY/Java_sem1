package source;

import javax.swing.JOptionPane;

public class Exercise3 {

    public static void main(String[] args) {

        double array1[] = new double[5];
        double array2[] = new double[5];
        double temp;

        //gather input for first array
        for (int i = 0; i < array1.length; i++) {
            String input = JOptionPane.showInputDialog("Enter a number For 1st Array");
            array1[i] = Double.parseDouble(input);
        }

        //gather input for second array
        for (int i = 0; i < array2.length; i++) {
            String input = JOptionPane.showInputDialog("Enter a number For 2nd Array");
            array2[i] = Double.parseDouble(input);
        }
        
        System.out.println("Contents of first array is...");
        //display contents of first array
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }

        System.out.println("\nContents of second array is...");
        //display contents of second array
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }

        //swap the contents of both arrays
        for (int i = 0; i < array2.length; i++) {
            temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;

        }
        
        System.out.println("\n\nAfter Swapping both arrays");
        
        System.out.println("\n\nContents of first array is...");
        //display contents of first array
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        
        System.out.println("\nContents of second array is...");
        //display contents of second array
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }

    }

}
