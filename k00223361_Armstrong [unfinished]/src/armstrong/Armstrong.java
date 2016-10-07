package armstrong;

import javax.swing.JOptionPane;

/**
 *
 * @author k00223361 Vincent Lee
 */
public class Armstrong {

    public static void main(String[] args) {
        //variables
        final int MAX = 999;
        int n =100;
        int a, b, c, compare, armNum;
        String output = "List of Armstrong numbers between " + n + " and " + MAX + "\n";
        

            while(n < MAX){
                compare = n; //assign value to temporary. Break this value up to three digits to compare
                
                /*--- extra first, second, third digits ---*/
                
                //extract the first number
                a = compare/100;
                
                 // extract the second number
                compare = compare%100;   
                
                b= compare / 10; 
                
                // extract the third number
                compare = compare % 10;
                        // is the remaining digit.
                c =compare; 

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
