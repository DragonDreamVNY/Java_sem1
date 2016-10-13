package WithFor;

import javax.swing.JOptionPane;

public class Exercise2 {
  
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter positive value");
        int n = Integer.parseInt(input);
            
        for (int i = 1; i <=n; i++) {
           System.out.print(i+ "\t");
           
           if (i % 8 ==0)
               System.out.println("");
           
        }//END FOR
        
    }//END MAIN
    
}//END CLASS
