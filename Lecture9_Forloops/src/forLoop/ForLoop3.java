/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forLoop;

/**
 *
 * @author K00223361
 * exercise 4
 */
class ForLoop3 {
    
    public static void main (String[] args){
        final int LOW = 10;
        final int HIGH = 200;
        int i;
        String output = "";
        
        for(i = 10; i<100; i++){
            
            // print numbers multiples of 4 but not 5
            // similar to "leap year" program
            if ( (i%4 == 0) && (i%5 != 0) ){
                System.out.print(i + ", ");
            }
        
        }
            
    }//end main    
} //end class
