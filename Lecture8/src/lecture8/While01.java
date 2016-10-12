
package lecture8;

/**
 *
 * @author k00223361
 */
public class While01 {

    public static void main(String[] args) {
    
        int count =1;
        int countdown = 1000;
        int countEven = 0;
        int countMulti = 0;
        
        /*
        // count 1...1000
        while (count <= 1000){
            System.out.println("counter : " + count);
            count++;
        }
            
        // count down 1000...1
        while (countdown >= 1){
            System.out.println("count down : " + countdown);
            countdown-- ;
            
        }
        

        // print all Even numbers in range {1...1000}
        while  (countEven <= 1000) {
            
            if (countEven % 2 == 0){
                System.out.println("Even number : " + countEven);
                
            }
            countEven ++;
        }
        */
        
       // print all numbers in multiples of 4 and 6 in range {1...1000}
        while (countMulti <= 1000) {
            
            if ( (countMulti % 4 == 0) && (countEven % 6 == 0) ){
            
            
            System.out.println("Multiples  : " + countMulti);
            }
            
            countMulti ++;
        }
 
        
        
    }
    
}
