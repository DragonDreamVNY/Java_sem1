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
 * Lab ex 01
 * Method1 Accepts 2 integer values, adds the values together & returns the answer.
 * Method2  Accepts 2 integer values, subtracts the first value from the second & returns the answer
 * Method3  Accepts 2 integer values, multiples the first value by the second & returns the answer to where it was called.
 * Method4  Accepts two integer values, divides the first number by the second and returns the answer to where it was called.
 */
public class MethodsLab01 {

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("please enter first number");
        String input2 = JOptionPane.showInputDialog("please enter second number");

        int num1 = Integer.parseInt(input1); 
        int num2 = Integer.parseInt(input2);
        
        System.out.print("You've entered " + num1 + " and " + num2 +"\n");
        
        // invoke the four methods
        int addResult = add(num1,num2); 
        int minusResult = minus(num1,num2);
        int multiResult = multi(num1,num2);
        int divideResult = divide(num1, num2);       
    } // end main method
    
    /*---------
    Add two integers Method
    ----------*/
    public static int add(int n1, int n2) {
        
        int sum = n1 + n2;
        System.out.print("Add two numbers\t:" + sum + "\n");
        return sum;
    } //end Add method
    
    /*---------
    Subtract two integers Method
    ----------*/
    public static int minus(int n1, int n2){
        int result = n2 - n1;
        System.out.println("second minus first number \t:" + result);
        return result;
    } //end Subtract method
    
     /*---------
    Multiply two integers Method
    ----------*/
    public static int multi(int n1, int n2){
        int product = n1*n2;
        System.out.println("Multiplied numbers \t:" + product);
        return product;
    }// end Multiply method 
    
    
     /*---------
    Sivide two integers Method
    ----------*/
    public static int divide(int n1, int n2){
        int divi = n1/n2;
        System.out.println("Divided numbers \t:" + divi);
        return divi;
    }// end Divide method
    
} //end Class
