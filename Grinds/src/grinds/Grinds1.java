package Grinds;

public class Grinds1 {

    public static void main(String[] args) {
        
        int [] array = new int [100];
        int min = 1;
        int max = 10;
        int randomNum;
        
        System.out.println("Array with 100 elements: \n");
        
        for (int i = 0; i < array.length; i++){
            if (i % 5 == 0){ 
                System.out.println(""); 
            }
            if(i%2 == 0){    // if i is even
                do {
                    randomNum = min + (int)(Math.random() * ((max - min) + 1));

                } while (!(randomNum%2==0)); 
            }  
            else{
                do {
                    randomNum = min + (int)(Math.random() * ((max - min) + 1));
                } while ((randomNum%2==0));                 
            }
            array[i] = randomNum;

            System.out.print (randomNum + "\t");            
        }
            int evensum = 0;
            int oddsum =0;
            for (int i = 0; i < array.length; i++){
                if (array[i] % 2 ==0){
                    //System.out.print (array[i]);
                 evensum = evensum + array[i];   
                }
            
            
                else{
                oddsum = oddsum + array[i];
                }
            }
            System.out.println("\nThe Sum of all Even Numbers are: " + evensum);
            System.out.println("\nThe Sum of all Odd Numbers are: " + oddsum);
            
        
                   System.out.println ("");
                   
                   System.out.println("\n Powered Array with 100 elements: ");
                   
            int first = array[0];
            
            for (int i =0; i < array.length; i++){// start new line every 5 elements
                if (i % 5 == 0){ 
                    System.out.println(""); 
                    }
                if (i == 99)
                    array[i] = (int)Math.pow((double) array[i],(double)first);
                else 
                    array[i] = (int)Math.pow((double) array[i], (double) array [i+1]);
                
                    System.out.print(array[i] + "\t\t");
                    
            }
     
    }// end main
    
}// end class
