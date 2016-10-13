
import javax.swing.JOptionPane;


public class Exercise2 {

   
    public static void main(String[] args) {
        
        String output = "";
        
        for (int i = 1; i <= 10; i++) {
            output += i + ", ";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }
    
}
