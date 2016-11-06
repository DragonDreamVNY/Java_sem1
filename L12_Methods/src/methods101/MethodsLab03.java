/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods101;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author DragonDream
 * 1. Accept two numbers (int's) from the user (two sides of RightAngled Triangle)
 */
public class MethodsLab03 {
    
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter your first number ");
        String input2 = JOptionPane.showInputDialog("Enter your second number ");
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        
        System.out.println("First Number: " + num1 );
        System.out.println("Second Number: " + num2 );
        
        hypotenuse(num1,num2); //invoke method
        
    }// end main method
    
    /*-----------
    Length of Hypotenuse Method
    -----------*/
    public static double hypotenuse(int n1, int n2){
        double l1 = Math.pow(n1, 2); //square the first : practicing Math.pow method Mofos
        double l2 = Math.pow(n2, 2); //square the second 
        double hyp = (Math.sqrt(l1 + l2)); //hypotenuse = SqRt ( side1^2 + side2^2)
        DecimalFormat twodecimal = new DecimalFormat(".##"); //rounding the value up
        System.out.println("Hypotenuse is :\t " + twodecimal.format(hyp));
        return hyp;
    }// end hypotenuse method
    
    
    
} //end class
