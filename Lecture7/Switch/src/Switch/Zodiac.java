package Switch; 

import javax.swing.JOptionPane;


public class Zodiac{
    
    public static void main (String [] args) {
    
        int year, zodiacNum;
        String input;
        
        input = JOptionPane.showInputDialog("Enter the year ( number 0 -12 inclusive)");
        year = Integer.parseInt(input);       
        
        // maths
        zodiacNum = year%12;
        
        System.out.println("You've entered : " + year);
        System.out.println("zodiacNum : " + zodiacNum);
        
        switch (zodiacNum){
            case 0: JOptionPane.showMessageDialog(null, "You're born in the year of the Monkey");
            break;
            
            case 1: JOptionPane.showMessageDialog(null, "You're born in the year of the Rooster");
            break;
            
            case 2: JOptionPane.showMessageDialog(null, "You're born in the year of the Dog");
            break;
            
            case 3: JOptionPane.showMessageDialog(null, "You're born in the year of the Pig");
            break;
            
            case 4: JOptionPane.showMessageDialog(null, "You're born in the year of the Rat");
            break;
            
            case 5: JOptionPane.showMessageDialog(null, "You're born in the year of the Ox");
            break;
            
            case 6: JOptionPane.showMessageDialog(null, "You're born in the year of the Tiger");
            break;
            
            case 7: JOptionPane.showMessageDialog(null, "You're born in the year of the Rabbit");
            break;
            
            case 8: JOptionPane.showMessageDialog(null, "You're born in the year of the Dragon");
            break;
            
            case 9: JOptionPane.showMessageDialog(null, "You're born in the year of the Snake");
            break;
            
            case 10: JOptionPane.showMessageDialog(null, "You're born in the year of the Horse");
            break;
            
            case 11: JOptionPane.showMessageDialog(null, "You're born in the year of the Sheep");
            break;
            
            default: JOptionPane.showMessageDialog(null, "you didn't enter a Year number");
        }
        
        System.exit(0);
    }
}