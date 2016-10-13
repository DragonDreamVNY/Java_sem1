package WithWhile;

import javax.swing.JOptionPane;

public class Exercise3 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter positive value");
        int n = Integer.parseInt(input);

        int i = 1;
        while (i <= n) {

            int j = 1;
            while (j <= i) {
                System.out.print(j + "\t");
                j++;
            
            }//end while
            
            System.out.println("");

            i++;
        }//end while

    }//end main

}//end class
