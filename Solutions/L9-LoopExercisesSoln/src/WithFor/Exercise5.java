package WithFor;

/**
 * Program to print the first 1000 prime numbers It uses to loop to achieve
 * this. The first loop iterates over the numbers from 2 - 1000. The second loop
 * checks if each number (lets call it m) in the range 2-1000 is a prime. It
 * does this by checking m's factors. If any of m's factors divide evenly into
 * it, then its not a prime number.
 *
 * @author alan.ryan
 */
public class Exercise5 {

    public static void main(String[] args) {

        final int MAX = 1000;

        int outputCount = 0;

        boolean isPrime;

        for (int m = 2; m < MAX; m++) {

            isPrime = true;

            for (int v = 2; v <= m / 2; v++) {
                if (m % v == 0) {
                    isPrime = false;
                }
            }//end for

            if (isPrime) {
                System.out.print(m + ", ");
                outputCount++;
            }//end if

            if (outputCount == 10) {
                System.out.println("");
                outputCount = 0;
            }//end if
        }//end for
    }//end main
}//end class