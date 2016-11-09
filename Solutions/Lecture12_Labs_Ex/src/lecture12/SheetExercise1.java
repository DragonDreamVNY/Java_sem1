package lecture12;

import javax.swing.JOptionPane;

public class SheetExercise1 {

    public static void main(String[] args) {
        
        String input1 =  JOptionPane.showInputDialog("Enter First Number");
        double numb1 = Double.parseDouble(input1);
        
        String input2 =  JOptionPane.showInputDialog("Enter Second Number");
        double numb2 = Double.parseDouble(input2);
        
        String input3 =  JOptionPane.showInputDialog("Enter Third Number");
        double numb3 = Double.parseDouble(input3);
        String input4 =  JOptionPane.showInputDialog("Enter Fourth Number");
        double numb4 = Double.parseDouble(input4);
        String input5 =  JOptionPane.showInputDialog("Enter Fifth Number");
        double numb5 = Double.parseDouble(input5);
      
      System.out.println ("The Square of the Given number " + input1 + " is " + square(numb1)); 
      System.out.println ("The Cube of the Given number " + input2 + " is " + cube(numb2)); 
      System.out.println ("The Average of the Given numbers " + input3 + input4 + input5 + " is " + avg(numb3,numb4,numb5)); 
    }
    
    public static double square(double numb1){
        
        double square;
        square = (Math.pow(numb1,2));
        return square;
    }
    public static double cube(double numb2){
        
        double cube;
        cube = (Math.pow(numb2,3));
        return cube;
    }
    public static double avg(double numb3, double numb4, double numb5){
        
        double avg;
        avg = (numb3 + numb4 + numb5)/3;
        return avg;
    }
    
}