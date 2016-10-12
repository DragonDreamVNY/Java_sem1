package armstrong;

import javax.swing.JOptionPane;

/**
 *
 * @author k00223361 Vincent Lee
 */
public class Armstrong {

    public static void main(String[] args) {
        //variables
        final int MAX = 999; //for assurance that MAX will always be 999
        int n =100; // starts at 100 but will change
        int a, b, c, compare, armNum; // first, second, third Digits, a temporary comparison Number, and end result ArmStrong Number
        String output = "List of Armstrong numbers between " + n + " and " + MAX + "\n"; // going to append  += the output with mix of String and Results.
        

            while (n < MAX){
                compare = n; //assign value to temporary. Break this value up to three digits to compare
                
                /*--- extra first, second, third digits ---*/
                
                //extract the first number
                a = compare/100; //ie. 213 / 100 = [2] [ - ] [ - ]
                
                 // extract the second number
                compare = compare % 100;    // ie. 213 % 100 = [ ] [1] [3] , assigned to itself,
                
                b= compare / 10;  //ie. 13 / 10 = [1] [ - ]
                
                // extract the third number
                compare = compare % 10; // ie. 13 % 10 = [ - ] [3]
                        // is the remaining digit.
                c =compare; //ie. c is the same as temparary.
                
                // this is the formula for ArmStrong Number  ( abc  = a^3 +b^3 + c^3 )
                 armNum = (int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3);
                 
                //  if total == n you have an Armstrong number
                if ( armNum == n ){  
                     
                    output += armNum + "\n" ; //to check if a b c and armstrong number match digits  plus a New Line
                     
                } //end if compare and total
                
                // add count +1 until 999 and prevent inf loop
                 n++; 
            } // end while loop for 'a' 'b' 'c'
            
            //display all Armstrong numbers in a message box
        JOptionPane.showMessageDialog(null, output);
    }


}
