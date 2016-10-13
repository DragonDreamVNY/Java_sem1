
public class Exercise5 {

   
    public static void main(String[] args) {
        System.out.println("\t\t\tMultiplication Tables");
       
        for (int i = 1; i <= 9; i++) {
            
            System.out.print("_________");
            
        }
        
        System.out.println("");
        
        System.out.print("\t");
        for (int i = 1; i <= 9; i++) {
            
            System.out.print(i + "\t");
            
        }
        
       
        
        System.out.println("");
        
        for (int j = 1; j <= 9; j++) {
            
            System.out.print(j + "|");
            
            for (int k = 1; k <= 9; k++) {
                System.out.print("\t" + j * k);
            }
            System.out.println("");
        }
        
    }
    
}
