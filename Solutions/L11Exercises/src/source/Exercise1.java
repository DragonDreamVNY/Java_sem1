package source;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise1 {

    public static void main(String[] args) {

        final int min = 0;
        final int max = 110;

        final int ROWS = 3;
        final int COLS = 4;
        int matrix[][] = new int[ROWS][COLS];
        
        int smallestInRow = 0;
        int largestInRow = 0;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(min, max + 1);
            }
        }

        System.out.println("Values in matrix are....");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }

        for (int i = 0; i < ROWS; i++) {

            int j = 0;
            smallestInRow = matrix[i][j];
            largestInRow = matrix[i][j];

            for (j = 0; j < COLS; j++) {

                if (matrix[i][j] < smallestInRow) {
                    smallestInRow = matrix[i][j];
                }

                if (matrix[i][j] > largestInRow ) {
                    largestInRow = matrix[i][j];
                }
            }
        
            System.out.println("\nSmallest in Row " + i + " is " + smallestInRow);
            System.out.println("Largest in Row " + i + " is " + largestInRow);
        }

    }

}


