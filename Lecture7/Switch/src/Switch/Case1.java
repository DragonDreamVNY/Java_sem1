
package Switch;

import javax.swing.JOptionPane;


public class Case1 {


    public static void main(String[] args) {
        
            int n;
            String numInput;
            
           numInput = JOptionPane.showInputDialog("Please enter a number from 0-9");
           n = Integer.parseInt(numInput);  //parse String to Int. Switch case needs Int type.
           
           switch (n) {
               case 0: System.out.println("You've entered \'Zero\' ");
                            JOptionPane.showMessageDialog(null, "You've entered \'Zero\' ");
               break;
               
               case 1:System.out.println("You've entered \'One\' ");
                            JOptionPane.showMessageDialog(null, "You've entered \'One\' ");
               break;
                        
               case 2: System.out.println("You've entered \'Two\' ");
                            JOptionPane.showMessageDialog(null, "You've entered \'Two\' ");
               break;
               
               case 3:System.out.println("You've entered \'Three\' ");
                            JOptionPane.showMessageDialog(null, "You've entered \'Three\' ");
               break;
               
               case 4: System.out.println("You've entered \'Four\' ");
                            JOptionPane.showMessageDialog(null, "You've entered \'Four\' ");
               break;
               
               case 5:System.out.println("You've entered \'Five\' ");
                            JOptionPane.showMessageDialog(null, "You've entered \'Five\' ");
               break;
             
                case 6: System.out.println("You've entered \'Six\' ");
                             JOptionPane.showMessageDialog(null, "You've entered \'Six\' ");
               break;
               
               case 7:System.out.println("You've entered \'Seven\' ");
                            JOptionPane.showMessageDialog(null, "You've entered \'Seven\' ");
               break;
               
               case 8: System.out.println("You've entered \'Eight\' ");
                            JOptionPane.showMessageDialog(null, "You've entered \'Eight\' ");
               break;
               
               case 9:System.out.println("You've entered \'Nine\' ");
                            JOptionPane.showMessageDialog(null, "You've entered \'Nine\' ");
               break;
               
               default: JOptionPane.showMessageDialog(null, "you didn't enter a number between 0 and 9");
           }
           
    }
    
}
