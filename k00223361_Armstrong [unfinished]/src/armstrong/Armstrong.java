/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;
import javax.swing.JOptionPane;

/**
 *
 * @author k00223361 Vincent Lee
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialise then overide
        double a, b, c;
        double armNum = 0;
        a=0;
        b =0;
        c=0;

        boolean end = false;
        double compare_a = 0; 
        double compare_b =0; 
        double compare_c = 0;
        
        int count = 100; //counter from 100...999
        while (count <= 999){
                   
            while(a <= 9){
                a++; //add 1 to a
                compare_a = a; // temp num is assigned new a value for comparison
                compare_a = Math.pow(a, 3); //
                armNum =  (compare_a + compare_b + compare_c);
                
                // 'a' compare to armNum digit1, 'b' to arnmNum digit2, 'c' to armNum digit3
                if ( (compare_a == armNum/100) && ( compare_b == ((armNum%100)/10))  && ( compare_c == ((armNum%100)%10)) ){
                     a = armNum/100;//to check if a b c and armstrong number match digits 
                     
                } //end if compare 
                else a++;
                
                while(b<=9){
                    b++;
                    compare_b = b; // temp num is assigned new a value for comparison
                    compare_b = Math.pow(b, 3); //
                    
                    
                    if ( (compare_a == armNum/100) && ( compare_b == ((armNum%100)/10))  && ( compare_c == ((armNum%100)%10)) ){
                     end = true; //to check if a b c and armstrong number match digits 
                }
                
                if (c<=9){
                    c++;
                    compare_c = c; // temp num is assigned new a value for comparison
                    compare_c = Math.pow(c, 3); //
                }
                armNum += (compare_a + compare_b + compare_c); // armNum for three numbers 
                
                
                  
                        
            } // end while loop for 'a' 'b' 'c'
        count++; // add count +1 until 999 and prevent inf loop
        
            if ( end == true ){      
                System.out.println("Armstrong Number is : " + armNum);
            } else System.out.println("not a number : ");
            
        } // end while until 999
        
        
       
        
    }
    
}
