
public class Exercise4 {

    public static void main(String[] args) {
        
        final int LOW = 10;
        final int HIGH = 200;
    
        for (int i = LOW; i < HIGH; i++) {
            
            if ((i % 4==0) && (i % 5!=0))
                System.out.print(i  + " , ");
            
        }
    }
    
}
