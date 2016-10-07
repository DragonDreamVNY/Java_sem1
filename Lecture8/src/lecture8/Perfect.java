
package lecture8;

import javax.swing.JOptionPane;
/**
 *
 * @author k00223361 Vinny
 */

public class Perfect {

    public static void main(String[] args) {
       int n, count, midNum, perfect;
       int tempNum;
       
       // user input
       String input = JOptionPane.showInputDialog("enter your number : ");
       n = Integer.parseInt(input);
       System.out.println("You've entered : " + n); 
       if (n < 6){ 
           System.out.println("Perfect number has to be at least 6!");
       }
       
       //midNum = n/2; //initialise middle number, highest Factor number to compare Counter to is half the number itself
       count = 1; 
       tempNum = 0;
       
       while (count <=  n/2 ){ 
          
           
           if(n % count == 0){ // if the Count number is a factor that divides evenly into User input n
               System.out.println ("your factor : " + count);
               tempNum += count; //add count Factor to Temporary number and see if becomes same value as n...
           } // while loop repeats to see if count is less than or same as half the Number
           count ++;
       } //end while loop

           if (tempNum == n){  //check if Temporary Number is the same as user input
                System.out.println(n + " is a PERFECT Number ");
           } 
           else{ 
               System.out.println(n + " is Not a PERFECT Number"); 
           }
         
    } 
}


