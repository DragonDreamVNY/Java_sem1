package LabExercise4;

public class Mystery1 {
  
    public static void main(String[] args) {
        
        int count = 1;
        
        while (count <=10) {
            
            if (count % 2 == 1)
                 System.out.println("****");
            else
                System.out.println("++++++++");

            count++;
            
        }//end while
        
    }//end main
    
}//end class

