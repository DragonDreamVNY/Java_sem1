package l9.furtherloops;

/**
 *
 * @author DragonDream
 * problem 1 - Further Loops featuring Feckin MATHS
 */
public class Further01 {

   
    public static void main(String[] args) {
       int N = 1; //natural number variable
       final int MAX = 1000; // this is the End... my only friend...
       int addMe = 0; //sum variable
        
        
        //multiples of 3 OR 5 
        do{
            N++; 
                if( (N % 3 == 0) || (N % 5 ==0) ){
                    // System.out.print(N + ", "); //testing
                    addMe += N; //add this value of N to SumTotal... 
                    
                } //end if
            } while(N <=MAX); // up to 1000
        
        System.out.println("Sum of all Multiples of 3 or 5 is : /t " + addMe);
        
        
    } // end main
    
}// end class
