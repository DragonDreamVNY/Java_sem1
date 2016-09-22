package leapyear;
import javax.swing.JOptionPane;

public class LeapYear {

    public static void main(String[] args) {
        
        int d, m, y;
        int nextD, nextM, nextY; //variables for the successor date
        int nDays=0; //variable to test number of days in a month
                       // note: remember to assign a value because if statements may not get executed
        String inputDay, inputMonth, inputYear, output;
        
        // user inputs day/month/year
        inputDay =  JOptionPane.showInputDialog("Enter Day");
        inputMonth= JOptionPane.showInputDialog("Enter Month");
        inputYear = JOptionPane.showInputDialog("Enter Year");     
         
        // parse user input String as Integer number
        d = Integer.parseInt(inputDay);
        m = Integer.parseInt(inputMonth);
        y = Integer.parseInt(inputYear);
        
        /*
        System.out.println("You entered : " + d + " days" + "\n");
        System.out.println("You entered : " + m + " month" + "\n");
        System.out.println("You entered : " + y + " year" + "\n");
        */
        
        /*=====Part One=====
        The number of days in the month 
        =====================*/

        // April, June, Sept, Nov has 30 days
        if ( (m == 4) || (m == 6) || (m == 9) || (m == 11) ) {
                nDays = 30;
                System.out.println("Your month has 30 days");
        }    
           // or if it is February, it has 28 days, or 29 days on Leap year
        else if (m == 2) {
                //  Leap year code. Divisible by 4 but NOT 100, OR (if else) divisible by 400
                if  ( ( y % 4 == 0) && (y % 100 != 0) || (y  % 400 == 0) ){
                        nDays = 29;
                        System.out.println("It's a leap year.");
                        System.out.println("Your month has 29 days");
                }
                    // 
                    /*i    if else (y  % 400 == 0);
                    System.out.println("It's a leap year.");
                    */
                else {
                        nDays = 28;
                        System.out.println("It's NOT a leap year.");
                        System.out.println("Your month has 28 days");
                }
           } // end February Leap year code
           
          // Jan, Mar, May, Jul, Aug, Oct, Dec. has 31 days
        if ( (m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10) || (m == 712) ) {
                nDays = 31;
                System.out.println("Your month has 31 days");
           }     
          
           /*=====Part Two=====
           The number of days  generate successor date 
           =====================*/

        if (d < nDays) 
                d += 1; //add one day to itself
                
           // OR if it's the last day of the month OR if user enters wrong date greater than allowed
           else if ((d == nDays) || (d > nDays))  { 
                d = 1; // reset: successor is first day of new month
                System.out.println("It's the first day of a new month");
           
                // Do this if first day of new month and possibly new year
                if (m <12) {
                    m += 1; // add one month value to itself
                }
                // or if it is last day of December
                else if (m == 12) {
                    m = 1; // month value becomes January
                    y += 1; // add one to year value 
                }
            } // end of Last Day of the Month code
          

        System.out.println("You Entered : " + inputDay + "/" + inputMonth + "/"  + inputYear);
        System.out.println("The next date is : " + d + "/" + m + "/"  + y );
                                                                      
        output = ("The successor date for : " + inputDay + "/" + inputMonth + "/"  + inputYear  + "\n");
        output += ("is : " + d + "/" + m + "/"  + y ); //appends this string to the previous
        
        JOptionPane.showMessageDialog(null, output);                                                                   
                                                                      
        
    }
}
