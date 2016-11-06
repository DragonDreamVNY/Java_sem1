/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods101;

import javax.swing.JOptionPane;

/**
 *
 * @author DragonDream
 * Lab 04
 * 1. teacher to enter 10 marks (as int's)
 * 2. stored in an array []
 * 3. passed to a method which will output the grade
 *      less than 40 is a FAIL
 *      greater than or equal to 40 , but less than 50 is a PASS
 *      greater than or equal to 50 but less than 60 is a MERIT
 *      greater than or equal to 60 but less than or equal to 100 is a DISTINCTION
 *      less than 0 but greater than 100: print an Error
 */     
public class MethodsLabs04 {

    public static void main(String[] args) {
        int marks[] = new int[10]; //initialise array var with 10 index locations
        for (int i = 0; i < 10; i++) {
            String markInput = JOptionPane.showInputDialog("Enter your marks");        
            marks[i] = Integer.parseInt(markInput); //assign the value to this index at this loop
            System.out.println(i + ". you've entered :\t" + marks[i]);
            grade(marks[i]);
        } // end for loop used to populate array
        
        
    } // end main method
    
    
    public static int grade(int n1){
        if (n1 < 40){ System.out.println ("You scored " +  n1 + " which is a FAIL"); }
        return n1;
    } //end method
    
} //end class
