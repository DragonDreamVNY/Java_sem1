package l10.arrays;

import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author DragonDream
 * ex 7 - Array question[] Store 10 General knowledge Questions
 *      - Array Answers[] Store Answers
 *      - Loop 5 times and random select from the 10
 *      - check answers match these arrays/indexes
 *      - User answers this (JOPtionPane) 
 *      - If correct, then Show Message.
 *      - 5 times, how many Right (correctCount[Answer]++)
 *      - How many Wrong (wrongCount[Answer]++)
 *      - % success rate (X correct Ans ) *100 / 5 
 */
public class Arrays07 {

    public static void main(String[] args) {
        String questions[] = new String [10]; 
        String answers[] = new String[10];
        boolean usedQ[] = new boolean[10];
        int correct = 0;
        int incorrect = 0;
        Random r =  new Random();
        
        // the ten Q & A's
        questions [0] = "What is the capital of Ireland?";
        answers [0] = "Dublin";
		
        questions [1] = "What was Walt Disney Studio's first full length anmimated movie?";
        answers [1] = "Snow White";
		
        questions [2] = "What is a female dog called?";
        answers [2] = "Bitch";
		
        questions [3] = "What day follows Hallowe'en?";
        answers [3] = "All Souls Day";

        questions [4] = "What U.S. holiday is celebrated with the feast of Turkey?";
        answers [4] = "ThanksGiving";

        questions [5] = "What year was Hong Kong returned to China?";
        answers [5] = "1997";

        questions [6] = "What is Ash Ketchum's first Pokemon?";
        answers [6] = "Pikachu";

        questions [7] = "What was Bruce Lee's last film?";
        answers [7] = "Game of Death";

        questions [8] = "How long (in seconds) does it take for light from the moon to reach the Earth?";
        answers [8] = "1.26";

        questions [9] = "Where was Bruce Lee born?";
        answers [9] = "San Francisco";
        
        int randomNum = 0;
        
        for(int i = 0; i < 5; i++){
            do{
                randomNum = r.nextInt (10);
                //System.out.println("This index is .. " + randomNum);
            } while(usedQ[randomNum] == true );
            // end Do while
            
            String ans = JOptionPane.showInputDialog(null, questions[randomNum]);
            usedQ[randomNum] = true;
            System.out.println("This Question is : " + usedQ[randomNum]);
            
            if (ans.equalsIgnoreCase(answers[randomNum])) { //lthis method comparse Strings...
				
                correct++;
                System.out.println("That's CORRECT!");
                JOptionPane.showMessageDialog(null, "Correct answer!");
            }//end if
			
            else {
                incorrect ++;	
                System.out.println("That's WRONG!");
                JOptionPane.showMessageDialog(null, "Sorry, that is incorrect\nThe answer we were looking for was " + answers[randomNum]);
            }//end else

        } // end For
        int percent = ((correct*100) / 5);
        JOptionPane.showMessageDialog(null, "\nNumber of Questions = 5\nNumber of correct answers = " + 
                                        correct + "\nNumber of incorrect answers = " + 
                                        incorrect + 
                                        "\nYour success rate is " + percent +"%");
        
        System.exit(0);
        
    } // end main 
} //end class
