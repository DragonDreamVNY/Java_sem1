
import javax.swing.JOptionPane;

class SayHello3{    
    public static void main(String args[]){
        String name = JOptionPane.showInputDialog("Enter your Name");
        
        JOptionPane.showMessageDialog(null, "Hello there " + name + " how are you?");
        
        
    }
            
 
}