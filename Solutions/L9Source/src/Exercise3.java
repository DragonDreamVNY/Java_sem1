
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Exercise3 {

    public static void main(String[] args) {
        //gather input
        String input = JOptionPane.showInputDialog("Enter a value");
        int value = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter an upper limit");
        int limit = Integer.parseInt(input);
        
        String output = "The multiples between " + value + " and " + limit + " are:\n " ;
        
        //variable to keep track of the numbe of times the loop executes
        int count = 1;
        
        for (int i = value; i <= limit; i += value) {
            
            output += i + "\t";
            
            if (count % 5 == 0) //if count is a multiple of 5 add a new line
                output += "\n";

            count++; //incr count by 1
        
        }//end for

        System.out.println(output);
        
        //create text area with 20 rows and 40 cols
        JTextArea jta = new JTextArea(20,40);
        jta.setText(output);
        jta.setEditable(false);
        
        JOptionPane.showMessageDialog(null, jta);
        
        System.exit(0);
    }//end main
    
}//end class
