package lecture12;

import javax.swing.JOptionPane;

public class SheetExercise4 {
    
    public static void main(String[] args) {
     
        int[] numbers = new int [10];
        
        int min = 1;
        int max = 10;
        for (int row=0; row<numbers.length; row++){
            int randomNum = min + (int)(Math.random() * ((max-min) +1));    	 
            numbers[row] = randomNum;  
        }  
        
        //after we populate the array, we need to get input from user and call five() method.
        //get input from user:
        String input = JOptionPane.showInputDialog(null, "Please enter number:");
        // parse it to an integer:
        int num = Integer.parseInt(input);
        // create variable to store the answer:
        boolean answer;
        // call the function. Parameter 1 is our array, parameter 2 is a number that user supplied.
        // The function will check if 'num' is in array 'numbers' and will return true if yes, false if not
        answer = five(numbers, num);
        // display result in console:
        System.out.println("Is number in list? - "+answer);
    
    }
    public static boolean five(int[]arr, int x){
   		boolean ans; // don't actually need this
                for(int i = 0; i< arr.length; i++){  //note: we iterate through array, so 'arr.length', not 'x.length'
                	if (arr[i] == x){
                   		 return true;
               		 }
                }
                return false;
    }
}
