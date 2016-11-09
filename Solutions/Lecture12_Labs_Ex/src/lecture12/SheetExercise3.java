package lecture12;

import javax.swing.JOptionPane;

public class SheetExercise3{

    public static void main(String[] args) {
        
        String input1 =  JOptionPane.showInputDialog("How Many Hours");
        int numb1 = Integer.parseInt(input1);
        String input2 =  JOptionPane.showInputDialog("How Many Minutes");
        int numb2 = Integer.parseInt(input2);
        
        String input3 =  JOptionPane.showInputDialog("How Many Hours");
        int numb3 = Integer.parseInt(input3);
        String input4 =  JOptionPane.showInputDialog("How Many Minutes");
        int numb4 = Integer.parseInt(input4);
        String input5 =  JOptionPane.showInputDialog("How Many Seconds");
        int numb5 = Integer.parseInt(input5);
        
        printMessage(numb1,numb2);
        printMessage(numb3,numb4,numb5);
        
    }
    
        public static void printMessage(int numb1, int numb2){
        
        int x = numb1*60;
        int y = numb2;
        int sum1 = x+y;
        System.out.println ("The Amount of Minute in the Time Given is: " + sum1);
        }
        
        public static void printMessage(int numb3, int numb4, int numb5){
        
        int x = (numb3*60)*60;
        int y = numb4*60;
        int z = numb5;
        int sum2 = x+y+z;
        System.out.println ("The Amount of Seconds in the Time Given is: " + sum2);
        }
   
}