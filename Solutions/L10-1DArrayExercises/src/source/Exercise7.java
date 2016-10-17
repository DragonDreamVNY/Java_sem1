package source;
import java.util.*;
import javax.swing.JOptionPane;

class Quiz {

	public static void main(String args[]) {
		
		String questions[] = new String [10]; 
		String answers[] = new String[10];
		boolean usedQuestions[] = new boolean[10];
		int correct = 0;
		int incorrect = 0;
		Random r =  new Random();
		
		questions [0] = "What is the capital of Australia?";
		answers [0] = "Canberra";
		
		questions [1] = "What club does Kaka play for?";
		answers [1] = "Real Madrid";
		
		questions [2] = "What is a female swan called?";
		answers [2] = "Pen";
		
		questions [3] = "How many miles high is Mount Everest?";
		answers [3] = "8.8";
		
		questions [4] = "What date comes 22 days after June 19th?";
		answers [4] = "11th of July";
		
		questions [5] = "What was Ghana called before 1957?";
		answers [5] = "Gold Coast";
		
		questions [6] = "Which is the only city in the world to lie in two coninents?";
		answers [6] = "Istanbul";
		
		questions [7] = "What is 1/3 of 1/2?";
		answers [7] = "1/6";
		
		questions [8] = "How long (in seconds) does it take for light from the moon to reach the Earth?";
		answers [8] = "1.26";
		
		questions [9] = "What is 4ft 8inches in Metres?";
		answers [9] = "1.42";
		
		int randomNum=0;
		
		for (int i=0; i < 5; i++) {
			
			do {
			
			randomNum = r.nextInt(10);
			
			} while (usedQuestions[randomNum] == true );
			
			
			String answer = JOptionPane.showInputDialog(null, questions[randomNum]);
			usedQuestions[randomNum] = true;
			
			if (answer.equalsIgnoreCase(answers[randomNum])) {
				
				correct++;
				
				JOptionPane.showMessageDialog(null, "Well done, that is the correct answer!");
			}
			
			else {
				
				incorrect ++;	
				JOptionPane.showMessageDialog(null, "Sorry, that is incorrect\nThe answer we were looking for was " + answers[randomNum]);
			}
		
		}

		JOptionPane.showMessageDialog(null, "Thanks for taking the quiz\nNumber of Questions = 5\nNumber of correct answers = " + correct + "\nNumber of incorrect answers = " + incorrect);
		System.exit(0);
	}	
}
