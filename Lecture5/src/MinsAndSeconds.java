
import javax.swing.JOptionPane;

class MinsAndSeconds{ 
      public static void main(String args[]){
 
         int secs; 
         int mins;
         int remainSecs;
                
                String input1 = JOptionPane.showInputDialog("Enter the Integer amount of seconds");
                secs = Integer.parseInt(input1); // prase uses input from String to int

                mins = secs/60; // number of minutes from user's input
                remainSecs = secs%60; // calculate number of remaining seconds
                
                JOptionPane.showMessageDialog(null, secs + " seconds is  " + mins + " minute(s) and " 
                                                                          + remainSecs + " seconds");
        }
 }
      
      

