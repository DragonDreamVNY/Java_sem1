
import java.text.DecimalFormat;

public class LabExercise2 {

    public static void main(String[] args) {
        
        int celsius = -20;
        double fahrenheit, kelvin;
        
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        
        System.out.print("Celsius\tKelvin\tFahrenheit\n");
        
        while (celsius <=50) {
            
            fahrenheit =  ((9.0/5.0) *  celsius + 32);
            
            kelvin = celsius + 273.15;

            System.out.print(celsius + "\t" + twoDigits.format(kelvin) + "\t" + twoDigits.format(fahrenheit) + "\n");
            
            celsius++;
        }//end  while
        
    }//end main
    
}//end class
