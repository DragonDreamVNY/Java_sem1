package WithWhile;


import javax.swing.JOptionPane;

public class Exercise2 {
  
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter positive value");
        int n = Integer.parseInt(input);
        
        int i = 1;
        while(i <=n) {
           System.out.print(i+ "\t");
           
           if (i % 8 ==0)
               System.out.println("");
           
           i++;
           
        }//END WHILE
        
    }//END MAIN
    
}//END CLASS
