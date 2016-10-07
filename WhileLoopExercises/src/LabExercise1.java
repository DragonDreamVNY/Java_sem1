public class LabExercise1 {

    public static void main(String[] args) {
        
        ////////////////////////////////
        //A while loop to display all the numbers from 1-1000 (starting at 1, 2,3….1000)
        System.out.println("PART I. The numbers from 1-1000 are...");
        int i = 1;
        while (i <= 1000) {
            System.out.print(i + ",");
            i++;
        }//end main
        
        
        ///////////////////////////////
        //A while loop to display all the numbers from 1000-1 (starting at 1000, 999,998…1)
        System.out.println("\n\nPART II. The numbers from 1000-1 are...");
        int j = 1000;
        while (j >= 1) {
            System.out.print(j + ", ");
            j--;
        }//end main
        
        
        ////////////////////////////////
        //A while loop to display all the even numbers in the range 1 – 1000.
        System.out.println("\n\nPART III. The even numbers between 1-1000 are...");
        int k = 1;
        while (k <= 1000) {
            if (k % 2 ==0)
                System.out.print(k + ", ");
            k++;
        }//end main
        
        
        
        ////////////////////////////////
        //A while loop to display all the numbers in the range 1 – 1000 that are multiples 
        //of both 4 and 6
        System.out.println("\n\nPART IV. The numbers in the range 1-1000 that are multiple of 4 and 6 are...");
        int t = 1;
        while (t <= 1000) {
            
            if ((t % 4 ==0) && (t % 6 ==0 ))
                System.out.print(t + ", ");
            
            
            t++;
        }//end while
        
        System.out.println("\n\n");
    }//end main
    
}//end class
