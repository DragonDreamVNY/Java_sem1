package LabExercise4;

public class Mystery3 {

  public static void main(String[] args) {
        
      
        int row =0;
        
        while (row  <=8) {
            
            int col = 0;
            
            if (row % 2 ==0)
                 System.out.print(" ");
            
            while (col  <=8) {
                System.out.print("* ");
                col++;
            
            }//end inner loop
            
            System.out.println("");
            
            row++;
            
        }//end outer loop
        
    }//end main

}//end class
