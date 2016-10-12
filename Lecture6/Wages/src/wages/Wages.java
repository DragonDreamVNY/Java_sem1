package wages;

import javax.swing.JOptionPane;

public class Wages {

    public static void main(String[] args) {
            final double RATE = 8.25;
            final int STANDARD =40;
            
            double pay;
            
            String input = JOptionPane.showInputDialog("Enter Hours Worked");
            int hours = Integer.parseInt(input);
            
            if (hours > STANDARD)
                pay = STANDARD * RATE + (hours - STANDARD) * (RATE * 1.5);
            
            else 
                pay = hours * RATE;
       
            JOptionPane.showMessageDialog(null, "Gross earnings: € " + pay);
    }
    
}
