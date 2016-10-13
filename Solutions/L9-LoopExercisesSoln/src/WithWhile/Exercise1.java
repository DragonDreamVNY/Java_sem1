package WithWhile;


public class Exercise1 {

    public static void main(String[] args) {
        
       int i = 1;
       while (i <= 100) {

           System.out.print(i+ "\t");
           
           if (i % 10 ==0)
               System.out.println("");
           
           i++;
           
       }//end while
           
    }//end main
    
}//end class
