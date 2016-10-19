package Switch;
import javax.swing.JOptionPane;

public class DayOfWeek {
    public static void main (String [] args) {
        
        int d; //Int variable for Day of the week (1-7)
        String input = JOptionPane.showInputDialog ("Please enter the day (1 - 7) of the week you were born");
      
         d = Integer.parseInt(input);
        
         // check if number is  Integer between 1-7, then check number against Switch Cases        
         if ( (d > 0) && (d < 8) ) {
             
             
            switch (d){
               case 1: JOptionPane.showMessageDialog(null,"Monday's child is fair of face");
               break;

               case 2: JOptionPane.showMessageDialog(null,"Tuesday's child is full of graec");
               break;

               case 3: JOptionPane.showMessageDialog(null,"Wednesday's child is full of woe");
               break;

               case 4: JOptionPane.showMessageDialog(null,"Thursday's child has far to go");
               break;

               case 5: JOptionPane.showMessageDialog(null,"Friday's child is loving and giving");
               break;

               case 6: JOptionPane.showMessageDialog(null,"Saturday's child works hard for a living");
               break;

               case 7: JOptionPane.showMessageDialog(null,"Sunday: but the child who is born on the Sabbath Day \n "
                       + "Is bonny and blithe and good and gay");
               break;
               
               default: JOptionPane.showMessageDialog(null, "you didn't enter a number between 1 and 7");

            }
         }
    }
    
    
}