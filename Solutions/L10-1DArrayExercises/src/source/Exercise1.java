
package source;

import javax.swing.JOptionPane;


public class Exercise1 {

    public static void main(String[] args) {
        int[] values = new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            String input = JOptionPane.showInputDialog("Enter a number");
            values[i] = Integer.parseInt(input);
            
        }
        
         for (int i = 9; i >=0; i--) {
            
            System.out.println(values[i]);
            
            
        }
        
       
        
    }
    
}
