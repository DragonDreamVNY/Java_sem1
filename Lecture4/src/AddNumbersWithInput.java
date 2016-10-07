
import javax.swing.JOptionPane;

class AddNumbersInput{    
    public static void main(String args[]){
        int num1, num2, num3, num4, num5;
        int answer;
        int mean;
        
//        input1(){ 
        
            String input1 = JOptionPane.showInputDialog("Enter your first number");
            num1 = Integer.parseInt(input1);
/*
            if (  num1 >= 0 && <= 100) { 
                System.out.print(num1 + " is your first number");
                return;
            } else if { 
                    System.err.println("your number must be between 0 and 100");
                    return;
             }
        }
        
     */   
        
        String input2 = JOptionPane.showInputDialog("Enter your second number");
        num2 = Integer.parseInt(input2);
        
        String input3 = JOptionPane.showInputDialog("Enter your third number");
        num3 = Integer.parseInt(input3);
        
        String input4 = JOptionPane.showInputDialog("Enter your fourth number");
        num4 = Integer.parseInt(input4);
        
        String input5 = JOptionPane.showInputDialog("Enter your fifth number");
        num5 = Integer.parseInt(input5);

        answer = num1 + num2 + num3 + num4 + num5;
        mean = answer/5;
        
        JOptionPane.showMessageDialog(null, "the Mean value of your inputs is = " + mean);
        
        
    }
            
}