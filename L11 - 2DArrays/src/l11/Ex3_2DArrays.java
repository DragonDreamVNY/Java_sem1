/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l11;

/**
 * Ex3. average temperatures (in Celsius) experienced in the counties of Munster in the first six months of 2016.
 * Represent this data (use random values for the temperatures).
 * Two arrays: 1.County (column)  2. Tempereature 2Darray[][] Array 2.Months[] column 
 * 
 * @author DragonDream
 */
public class Ex3_2DArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /* EXAMPLE explaining for loop and nested for loop to fill values across the fields column by column, row by row, 
        for(int row =0; row <6; row++){
            for(int col=0; col<6; col++){
                temp[row][col] = randomVal() ; //returns value for this index ie (row 0, col 0)
            }
        }
        
        */
        
        
        /* EXAMPLE explaining average tempaerature.  This one doesn't use Total Sum of county like Alan's
        * alan does both calculations for average month in the same For Loop
        * need new array to store average
        double[] AvgPerCounty = new double[6];
        
        for(int row = 0; row < 6; row++){
            for(int col=0; col<6; col++){
                avgCount[row] +=  temp[row][col];
                
            }
            System.out.print(avgCount[row]/6);
        }
        
        */
        
         /* EXAMPLE average for all months
        * need new array to store average
        double[] avgMonth = new double[6];
        
        for(int row = 0; row < 6; row++){
        
            for(int col=0; col<6; col++){
                avgMonth[col] +=  temp[row][col]; // 
                
            }
            System.out.print(avgCount[row]/6);
        }
        
        for(int i =0; i <6; i++_{
            avgCount += c;
        }
        
        */
        
        
    }
    
}
