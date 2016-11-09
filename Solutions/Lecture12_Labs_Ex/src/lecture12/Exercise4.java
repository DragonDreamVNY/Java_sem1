package lecture12;

import javax.swing.JOptionPane;

public class Exercise4 {

    public static void main(String[] args) {
        
        int[] studentmarks = new int [10];
        
        for (int i = 0; i<studentmarks.length; i++)
        {
        String input1 =  JOptionPane.showInputDialog("Enter in Grade Here: ");
        studentmarks[i] = Integer.parseInt(input1);
        }
      grade (studentmarks);
    }
       public static void grade(int x[])
           {
               for(int i=0; i < x.length; i++) {
                   
                   if (x[i]<40 && x[i] > 0){
                       System.out.println ("Fail");
                   }
                   else if (x[i]>=40 && x[i] < 50){
                       System.out.println ("Pass");
                   }
                   else if (x[i]>=50 && x[i] < 60){
                       System.out.println ("Merit");
                   }
                   else if (x[i]>=60 && x[i] <= 100){
                       System.out.println ("Distinction");
                   }
                   else if (x[i]<0 || x[i]> 100){
                       System.out.println ("Outside Allowable Grade Range");
                   }
               }   
             }
}