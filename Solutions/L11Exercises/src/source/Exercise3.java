package source;

import java.text.DecimalFormat;

public class Exercise3 {

    public static void main(String[] args) {
        
        DecimalFormat twoDigits = new DecimalFormat("0.0");
       
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun" };
        
        String[] counties ={"Clare", "Cork", "Kerry", "Limk", "Tipp", "Watfrd"};
        
        double[][] temperatures = {
                                    {2.5, 4.5, 5.1, 8.1, 12.6, 18.6},
                                    {3.0, 6.0, 7.5, 8.5, 13.0, 17.5},
                                    {3.0, 6.0, 8.1, 8.6, 13.4, 19.0},
                                    {2.5, 5.2, 7.9, 8.4, 13.3, 18.6},
                                    {2.5, 5.1, 7.1, 9.0, 13.4, 18.4},
                                    {4.0, 5.9, 10.0, 9.1, 13.6, 18.5}
                                   };
    
        //array to hold a sum of the temperatures for each county 
        double[] totalCountyTemp = new double[6];
        
        //array to hold a sum of the temperatures for each month
        double[] totalMonthTemp = new double[6];

        //get a sum/total of each temperature in each month AND county
        for (int i = 0; i < months.length; i++) {    
            for (int j = 0; j < counties.length; j++) {
                totalCountyTemp[i]  += temperatures[i][j];
                totalMonthTemp[j] += temperatures[i][j];
            } 
        }
       
        
        //print the data 
        for (int i =0; i < months.length; i++) {
            
            //print the column headers (the months)
            System.out.print("\t" + months[i]);
        
        }//end for
        
        System.out.println("\t|Avg");
    
        for (int i = 0; i < months.length; i++) {

            //print the row headers (the county name)
            System.out.print(counties[i] + "\t");
                
            for (int j = 0; j < counties.length; j++) {
                
                //print the temperatures for each county
                System.out.print(temperatures[i][j] + "\t");       
            }//end for
            
            //print the average temp for each county formatted to two decimal places
            System.out.println("|" + twoDigits.format(totalCountyTemp[i] /totalCountyTemp.length));
          
        }//end for
        
        System.out.println("-------------------------------------------------------------");
        System.out.print("AVG:\t");
        
        //print the average monthly temps
        for (int i = 0; i < totalMonthTemp.length; i++) {
            
            System.out.print(twoDigits.format(totalMonthTemp[i] / totalCountyTemp.length) + "\t");
            
        }//end for
        
        
        System.out.println();
    }//end main
}//end class