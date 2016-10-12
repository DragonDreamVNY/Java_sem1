
import javax.swing.JOptionPane;

class AreaAndPerimeter{ 
        public static void main(String args[]){
                int length, breadth, area, perimeter;
                
                String input1 = JOptionPane.showInputDialog("Enter the Length");
                length = Integer.parseInt(input1);

                String input2 = JOptionPane.showInputDialog("Enter the Breadth");
                breadth = Integer.parseInt(input2);

                area = length*breadth;
                perimeter = (length*2) + (breadth*2);
                
                JOptionPane.showMessageDialog(null, "the area is = " + area);
                JOptionPane.showMessageDialog(null,  "the perimeter is " + perimeter);
        }
 }