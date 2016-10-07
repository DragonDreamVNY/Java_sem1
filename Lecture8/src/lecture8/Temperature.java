

package lecture8;

import java.text.DecimalFormat;
public class Temperature {

    public static void main(String[] args) {
        
        double c = -20.00; //Celsius
        double k = 0.0; //Kelvin
        double f = 0.0; //Fahrenheit
        
        DecimalFormat twoPlaces = new DecimalFormat("0.00");
    
        System.out.println("Celsius" + "\t" + "Kelvin" + "\t" + "Fahrenheit");
        
        // -20...50 C   Kelvin  Fahrenheit
        while (c <= 50){
            k = c + 273.15;
            f = ((9.0/5.0)*c +32);
            System.out.println( twoPlaces.format(c) + "\t" 
                    + twoPlaces.format(k) + "\t" 
                    + twoPlaces.format(f) );
             c++;   
        }
        
    }
    
}
