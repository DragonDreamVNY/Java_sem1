package forLoop;

/**
 *
 * @author K00223361
 * exercise 5
 */
public class ForLoop4 {

    public static void main(String[] args) {
        // variables
        //int n = 9;
        int col; //column headers
        int row; // Row headers 
        int i;  // for multiplying 
        int j; //table counter 1-9
        String output = "\t|\t"; //start of Column Headers line
        
        // Loop 1
        // column headers 0 - 9
        for (col = 1; col < 10; col++ ){
            output += col + "\t";
        } // end loop COLUMNS
        
        // Loop 2
        for (row = 0; row < 10; row++){
            output += row + "\t|\t";
            
            for (j = 1; j < 10; j++){ // within first loop execute this 9 times
                i = row*j ;
                
                output += i + "\t";
            } // end loop TABLE BODY

           
            
            output += "\n"; //next line of multiplications

        } // end loop ROWS        
        
        System.out.print(output);
        
    
    } // end main    
} // end class
