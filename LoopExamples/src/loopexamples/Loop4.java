/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopexamples;

import javax.swing.JOptionPane;

/**
 *
 * @author DragonDream
 * exercise 4
 */
public class Loop4 {
    public static void main (String[] args){
    
        int N; //user input
        int i = 1; // counter for comparing to N, starts at 1 before increasing by factor "Row" each loop
        int row = 0; // counter for jumping rows
        String input, output = ""; //user Input to be parsed to N, and Output for storing number each Loop iteration
        
        /* User input
        ========*/
        input = JOptionPane.showInputDialog(null, "Please enter a positive number");
        N = Integer.parseInt(input); 
        
        // input handler for positive numbers only
        if (N <= 0){ 
                JOptionPane.showMessageDialog(null,"It must be a Positive Number!");
                System.exit(0); 
        } // end if
        
        do{
            output += i; //append to output, the current i values including Tabs, multiples
            output += "\t"; 
            while (row < N) {
                row++; // add one to row, the first needs to be 1, then 2...3...4
                output += "\t";   //append to the String output 1 -> 1 \n 1 2 -> 1 \n 1 2 \n 1 2 3
                i = i*row; //assign i the new multiplied value (1*1, 2*2 , 3*3 : append to Output in between each iteration)
                
                
            } //end while for Rows
        
        System.out.println(output);
            
            
        } while (row < N); //end Do While
        
        
    }
}
