package Soln;

/**
 *
 * @author Alan Ryan
 * @Date 3/9/2015
 * @Version 1.0
 * @Description: Program that utilises the Collatz theory and determines which number less than 1000000 
 * produces the longest chain in the following iterative sequence:
 *      n → n/2 (n is even)
 *      n → 3n + 1 (n is odd)
 * 
 *
 * E X A M P L E
 * 
 * If n = 13
 * 
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * 
 * it can be seen that 13 contains 10 terms.
 *
 */

public class AssignmentOne {

    public static void main(String[] args) {
        int number = 1000000; //starting point

        long greatestCount = 0; //holds the number of terms that the largest number has
        long greatestCountStartingNumber = 0; //holds the number with the largest number of terms

        int i = 1; //var to iterate between 1 - 1000000. I.E. the programs counter.
        
        while(i < number) {
            
            long count = 1;//keep track of the number terms for each number between 1 and 1000000
            long temp = i; //temp var
            
            while (temp != 1) { //loop while temp is not = 1
                if (temp % 2 == 0) { //if even number divide by 2
                    temp = temp / 2;
                }//end if 
                else { //if odd number, mult number by 3 and add 1
                    temp = 3 * temp + 1;
                }//end else
                count++; //increment count of number of terms for a given number
            }//end while

            if (count > greatestCount) { //if the count (for a given number) is > than the greatest count so far
                greatestCount = count; //greatestCount is now = count
                greatestCountStartingNumber = i; //greatestCountStartingNumber is now equal to the current number we are analysing

            }//end if
            
            i++; //increment i
        
        }//end 

        //display answer to the user
        System.out.println("Number with greatest number of terms is " + greatestCountStartingNumber + " it contains " + greatestCount + " terms"); //number = 837799, number of terms = 525

    }//end main
}//end class