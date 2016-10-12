package monthandseason;

import javax.swing.JOptionPane;
public class MonthAndSeason {

    public static void main(String[] args) {
        
        
        // initalise user input numbers and the 'Counter' variables
        int num; 
        int posCounter = 0, negCounter = 0, zeroCounter = 0; // remember to assign a value to counter dumb-dumb
        String input, output, season; 
         
        // ask user  to input the  month number from 1 - 12
        input = JOptionPane.showInputDialog("Please enter the number of the Month (1-12)");

        // parse or convert user String input as Integer  numbers
        num = Integer.parseInt(input);

        //   if number of the month is 2 OR 3 OR 4
        if ( (num == 2) || (num == 3) || (num == 4)){
                season = "Spring";
                System.out.print("month " + num + " is in " + season);
                JOptionPane.showMessageDialog(null, "it is now: " + season);
        }
            else if ((num == 5) || (num == 6) || (num == 7)) {
                season = "Summer";
                System.out.print("month " + num + " is in " + season);
                JOptionPane.showMessageDialog(null, "it is now: " + season);
            }
            else if ((num == 8) || (num == 9) || (num == 10)) {
                season = "Autumn";
                System.out.print("month " + num + " is in " + season);
                JOptionPane.showMessageDialog(null, "it is now: " + season);
            }            
            else if ((num ==11) || (num == 12) || (num == 1)) {
                season = "Winter";
                System.out.print("month " + num + " is in " + season);
                JOptionPane.showMessageDialog(null, "it is now: " + season);
            }                
        else {
                //none of the above is true, so throw Error and Exit
                
                 System.out.println("Number not 1-12 was entered.");
                 JOptionPane.showMessageDialog(null, "You Must enter a number between 1 and 12", "Error", JOptionPane.ERROR_MESSAGE);
                 System.exit(0);
        }     
        
    }
    
}
