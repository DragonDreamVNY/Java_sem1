
package stringworksheet;
import java.lang.Object;
import java.lang.String;

/**
 *
 * @author DragonDream
 */
public class StringWorksheet {

    public static void main(String[] args) {
        String s1 = "Everybody likes a compliment";
        String s2 = "I Am Rather Inclined To Silence";
        String s3 = "You have to do your own growing no matter how tall your grandfather was"; 
        String s4 = "A stitch in time saves nine";
        String s5 = "Happy days are here again";
        
        /*------------------------
        //TASK 1. Does S1 and S2 have same content?
        ------------------------*/
        if (s1.equals(s2)){
            System.out.println("S1 is same as S2");
        }
        else{System.out.println("Strings are not the same");}
        
         /*------------------------
        //TASK 2. i. Convert S2 to uppercase, 
                  ii. then to lower case
        ------------------------*/
        System.out.println(s2.toUpperCase() );
        
        System.out.println(s2.toLowerCase() );
        
        /*------------------------
        //TASK 3.  Check if s3 starts with the word 'You' and ends with the word 'was'
        ------------------------*/
        System.out.println((s3.startsWith("You") ) && (s3.endsWith("was") ));
        
        /*------------------------
        //TASK 4.   frequency of the letter 'a' in s3
        ------------------------*/
        char result = s3.charAt(5);
        //System.out.println(result);
        
        
        int a_count = 0;
        for (int i = 0; i < s3.length(); i++ ){
            s3 = s3.toLowerCase();
            if(s3.charAt(i) == 'a'){
               a_count++;
            }//end if
            
        }//end For
        System.out.println(" \'a\' appears " + a_count + " times.");
        
        /*------------------------
        //TASK 5.    frequency of vowels in s3
        ------------------------*/
        
        int vowel_count = 0;
        for (int i = 0; i < s3.length(); i++ ){
            s3 = s3.toLowerCase();
            if( (s3.toLowerCase().charAt(i) == 'a') || 
                    (s3.charAt(i) == 'e') ||                  
                    (s3.charAt(i) == 'i') ||
                    (s3.charAt(i) == 'o') ||
                    (s3.charAt(i) == 'u') 
                    ){
               vowel_count++;
            }//end if
            
        }//end For
        System.out.println(" Vowels appear " + vowel_count + " times.");
        
        /* Alan's solution
        
        for (int i = 0; i < s3.length(); i++ ){
            s3 = s3.toLowerCase();
            switch (s3.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowel_count++;
            }
        }
        */
        
        /*------------------------
        //TASK 6.    i . Replaces all the occurrences of the letter 't' with '!'
                     ii. AND Replaces all occurrences of the letter 's' with '#' in s4
        ------------------------*/
        String replaced1 = s4.replace('t', '!');
        String replaced2 = replaced1.replace('s', '#');
        System.out.println(replaced2);    
        
        /*------------------------
        //TASK 7.    Prints the index of each occurrence of the letter 'a' in s5.
        ------------------------*/
        s5 = s5.toLowerCase();
        for (int i = 0; i < s5.length(); i++ ){
            
            if( s5.charAt(i) == 'a') {
               System.out.println("\'a\' occurs at index : " + i); //print the index where 'a' occurs
            }//end if
            
        }//end For
        System.out.println("");
        
         /*------------------------
        //TASK 8.   Print each letter in the String s5 on a separate line.
        ------------------------*/
        for (int i = 0; i < s5.length(); i++ ){
            
            System.out.println(s5.charAt(i)); //print the char at this index  
        }//end For
        
         /*------------------------
        //TASK 9.   Extract the word 'days' from s5.
        ------------------------*/
         System.out.println( s5.subSequence(6, 10) );
         
         /*------------------------
        //TASK 10.   Find the last index of 'a' in the s5
        ------------------------*/
        System.out.println(s5.lastIndexOf( 'a') );
         
         
    }//end main method
    
} // end class
