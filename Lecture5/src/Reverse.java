
import javax.swing.JOptionPane;


class Reverse{
        public static void main (String[] args){
        int num1, firstDigit, secDigit, remDigit;  //note: can add output or revNumber for tidier code in JOptionPane   

        String input = JOptionPane.showInputDialog("Enter a number between 101 and 199");
        
        num1 = Integer.parseInt(input);
        
    
        firstDigit = num1%10; 
        secDigit = (num1/10)%10;
        remDigit = num1/100;
/*        
        number = Integer.parseInt(input);
        // overwrite the value of 'number'
        
        int number = number/10; // remove extracted digit
        middleDigit = number%10; //extract middle digit
        remDigit = number/10; // extra first digit
 */
        
        // note: can put all that into a String variable called 'output' before putting into JOptionPane
        JOptionPane.showMessageDialog(null, "the Reverse of your number  is  " + firstDigit + secDigit + remDigit);

    }
}