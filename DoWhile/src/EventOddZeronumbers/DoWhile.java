package EventOddZeronumbers;

import javax.swing.JOptionPane;

public class DoWhile {

    public static void main(String[] args) {
        
        // variables
        String input; 
        String output = "";
        int n, temp;
        int zeroCount = 0, oddCount = 0, evenCount = 0;
        
        input = JOptionPane.showInputDialog(null, "Please enter your integer number");
        n = Integer.parseInt(input);
            if( n == 0){
                  input = JOptionPane.showInputDialog(null, "Please enter a number that's not \'0\' ");
            }
            
            /*
            if (n%10 == 0) { 
                 System.out.print("Here's a Zero : " + n +"\n"); 
                 zeroCount++;
             }
             System.out.print("You've entered : " + n +"\n");   
                   
            if (n%10/10 == 0){
                System.out.print("You've entered : " + n +"\n"); 
            }
           */       
        temp = 0;
        do {
            
               
            
        } while (temp < n);
        
        
        output += "The number of 0's in that number is : \t" + zeroCount + "\n";
        output += "The number Even numbers in that number is : \t" + evenCount + "\n";
        output += "The number Odd numbers in that number is : \t" + oddCount;
        
        
        
    }
    
}
