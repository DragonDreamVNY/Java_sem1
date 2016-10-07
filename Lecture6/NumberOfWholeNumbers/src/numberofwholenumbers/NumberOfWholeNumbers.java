package numberofwholenumbers;

import javax.swing.JOptionPane;

public class NumberOfWholeNumbers {

    public static void main(String[] args) {
        
        // initalise user input numbers and the 'Counter' variables
        int num1, num2, num3, num4, num5; 
        int posCounter = 0, negCounter = 0, zeroCounter = 0; // remember to assign a value to counter dumb-dumb
        String input1, input2, input3, input4, input5, output; 
         
        // ask user  to input five whole numbers positive or negative
        input1 = JOptionPane.showInputDialog("Please enter Number 1");
        input2 = JOptionPane.showInputDialog("Please enter Number 2");
        input3 = JOptionPane.showInputDialog("Please enter Number 3");
        input4 = JOptionPane.showInputDialog("Please enter Number 4");
        input5 = JOptionPane.showInputDialog("Please enter Number 5");
        
        // parse or convert user String input as Integer whole numbers
        num1 = Integer.parseInt(input1);
        num2 = Integer.parseInt(input2);
        num3 = Integer.parseInt(input3);
        num4 = Integer.parseInt(input4);
        num5 = Integer.parseInt(input5);
        
        //  First number
        if (num1 > 0){
                posCounter += 1;
                System.out.print("num1 is positive");
        }
            else if (num1 == 0) {
                zeroCounter += 1;
                System.out.println("num1 is zero");
            }
        else {
                //none of the above is true, so add 1 to the Negative Number counter
                negCounter += 1; 
                 System.out.println("num1 is negative");
        }
                
        // Second number 
        if (num2 > 0){
                posCounter += 1;
                System.out.println("num2 is positive");
        }
            else if (num2 == 0) {
                zeroCounter += 1;
                System.out.println("num2 is zero");
            }
        else {
                //none of the above is true, so add 1 to the Negative Number counter
                negCounter += 1; 
                 System.out.println("num2 is negative");
        }
        
        // Third number 
        if (num3 > 0){
                posCounter += 1;
                System.out.println("num3 is positive");
        }
            else if (num3 == 0) {
                zeroCounter += 1;
                System.out.println("num3 is zero");
            }
        else {
                //none of the above is true, so add 1 to the Negative Number counter
                negCounter += 1; 
                 System.out.println("num3 is negative");
        }
        
        // Fourth number 
        if (num4 > 0){
                posCounter += 1;
                System.out.println("num4 is positive");
        }
            else if (num4 == 0) {
                zeroCounter += 1;
                System.out.println("num4 is zero");
            }
        else {
                //none of the above is true, so add 1 to the Negative Number counter
                negCounter += 1; 
                 System.out.println("num4 is negative");
        }
 
        // Fifth number 
        if (num5 > 0){
                posCounter += 1;
                System.out.println("num5 is positive");
        }
            else if (num5 == 0) {
                zeroCounter += 1;
                System.out.println("num5 is zero");
            }
        else {
                //none of the above is true, so add 1 to the Negative Number counter
                negCounter += 1; 
                 System.out.println("num5 is negative");
        }        
        
        
        output = ("Number of Positive Numbers : " + posCounter + "\n");
        output    += ("Number of Negative Numbers : " + negCounter + "\n"); //appends this string to the previous
        output    += ( "Number of Zero Numbers : " + zeroCounter); //appends it again to output
        
        JOptionPane.showMessageDialog(null, output);
       
                
    }
    
}
