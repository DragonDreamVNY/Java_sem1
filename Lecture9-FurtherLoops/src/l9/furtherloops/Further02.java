/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l9.furtherloops;

/**
 *
 * @author DragonDream
 * problem 2 : Fibonacci sequence
 */
public class Further02 {

    public static void main(String[] args) {
       
        int n = 1; //1st one
        int m = 2; //2nd one
        final int MAX = 4000000; //four million! Holy SHIT
        int sum; //add 1st and 2nd numbers 
        int even = 0; //sum of even numbers Handler
    
        
      /*  for (n=1; n < MAX; n+=m){
            x = n+m; // first time is 1+2, 
      WELL THAT DIDN:T WORK  */  
      
        while (n <=MAX){
             
             sum = (n + m); // result is a fibonacci number (3rd value)  ie [1+2 =3], [2+3 = 5], [3+5 = 8] ...contd
             n = m; // last time's 2nd number becomes next time's 1st number , remember assigned TO THE LEFT
             m = sum; //last time's result number becomes next time's 2nd number
             
            if (sum % 2 ==0){
                even += sum; // this is to filter out  sum of only Evens
                
            } //end if
        }// end Loop
    
        
        System.out.print("sum of even Fibonacci Numbers up to 4 million is  :\t" + even);
    } // end main 
} // end class
