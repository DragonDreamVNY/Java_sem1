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
 * Enter positive number (let’s call it N) from the user and print the first N rows
 * 1
 * 2 4 
 * 3 6 9
 * 4 8 12 16
 */
public class Loop4 {
    public static void main (String[] args){
    
        int N; //user input
       // ' i'  counter for comparing to N, starts at 1 before increasing by factor "Row" each loop
        // int row = 0; // counter for jumping rows
       //  int multi; // for multiplying and appending to Output String
        
        String input, output = ""; //user Input to be parsed to N, and Output for storing number each Loop iteration
        
        /* User input
        ========*/
        input = JOptionPane.showInputDialog(null, "Please enter a positive number");
        N = Integer.parseInt(input); 
        
        // input handler for positive numbers only
        if (N <= 0) { 
                JOptionPane.showMessageDialog(null,"It must be a Positive Number!");
                System.exit(0); 
        } // end if
        
        for (int i =1; i <= N; i++){
        
            for(int  row= 1; row<=i; row++){
                 System.out.print( row*i + "\t");
            } // end row
            System.out.println("");
         
        } //end for 
        
        
        
        /*
        do{
           
            i++; //start with one... repeat
            
            while (row < i) { //catch up to i Counter...
                row++; // add one to row, the first needs to be 1, then 2...3...4
                multi = i*row; //assign 'multi' the new multiplied value of this iteration (1*1, 2*2 , 3*3 
                                        //  append to Output in between each iteration)
                System.out.print(i); // new line...
                output += "\n"; 
                output += multi; //append to output, the current i values
                output += "\t";   //append Tab 
            } //end while for Rows
            
            System.out.print(output); 
            System.out.print("\t"); 
            
        } while (i < N); //end Do-While
        
     */
        
        
    } // end  main
}// end class
