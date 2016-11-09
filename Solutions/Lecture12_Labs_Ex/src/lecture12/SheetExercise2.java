package lecture12;

import javax.swing.JOptionPane;

public class SheetExercise2 {

    public static void main(String[] args) {
        
        String input1 =  JOptionPane.showInputDialog("Enter First Number");
        int numb1 = Integer.parseInt(input1);
        
        String input2 =  JOptionPane.showInputDialog("Enter Second Number");
        int numb2 = Integer.parseInt(input2);
        
        String input3 =  JOptionPane.showInputDialog("Enter Third Number");
        int numb3 = Integer.parseInt(input3);
        
      boolean ans1 = even(numb1);
      boolean ans2 = mult(numb2);
      boolean ans3 = div(numb3, numb2);  
      
      System.out.println("Answer 1: " + ans1);    
      System.out.println("Answer 2: " + ans2);    
      System.out.println("Answer 3: " + ans3);
    }
    
        public static boolean even(int numb1){
        boolean ans1;
        
        if (numb1 % 2 ==0){
        ans1 = true;
        }
        else{
        ans1 = false;
        }
        return ans1;
    }
        
        public static boolean mult(int numb2){
        boolean ans2;
        
        if (numb2 % 3 ==0){
        ans2 = true;
        }
        else{
        ans2 = false;
        }
        return ans2;
    }
        
    public static boolean div(int numb3, int numb2){
        boolean ans3;
        
        if (numb3 % numb2 ==0){
            ans3 = true;
        }
        else {
            ans3 = false;
        }
        return ans3;
    }
}
    
