
import javax.swing.JOptionPane;


public class AverageOf5 {

   
    public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog("Enter Number 1");
        int n1 = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog("Enter Number 2");
        int n2 = Integer.parseInt(input2);
        
        String input3 = JOptionPane.showInputDialog("Enter Number 3");
        int n3 = Integer.parseInt(input3);
        
        String input4 = JOptionPane.showInputDialog("Enter Number 4");
        int n4 = Integer.parseInt(input4);
        
        String input5 = JOptionPane.showInputDialog("Enter Number 5");
        int n5 = Integer.parseInt(input5);
        
        int sum = n1 + n2 + n3 + n4 + n5;
        
        int average = sum / 5;
        
        JOptionPane.showMessageDialog(null, "Average of " + input1 + " " + 
                                                            input2 + " " + 
                                                            input3 + " " + 
                                                            input4 + " " + 
                                                            input5 + " is " + average);
        
        
        
        
        
    }
    
}
