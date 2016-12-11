/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l11;

/**
 * Lab ex 04
 *  local car dealership for the first six months of 2016.
 * 
 * @author DragonDream
 */
public class Ex4_CarSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        String[] cars = {"Opel", "Volvo", "Nissan", "Ford", "Toyota", "Honda"};
        int[][] sold = {
                                    {120, 56, 55, 67, 19, 8},
                                    {17, 8, 4, 0, 0, 0},
                                    {99, 80, 89, 48, 24, 8},
                                    {115, 111, 78, 80, 45, 60},
                                    {101, 102, 100, 89, 75, 65},
                                    {67, 89, 81, 60, 55 ,29}
                                   };
        
        // array to hold total sum of each car brand sold over the 6 months (row)
        int[] totalSoldRow = new int[6];
        
        //array to hold sum of cars sold per month (col)
        int[] totalSoldCol = new int[6];
        
        //2. sum/total of each brand per brand and per month
        for(int i =0; i <months.length; i++){ 
            for(int j =0; j<cars.length; j++){ //goes through month columns first, before next row
                totalSoldRow[i] += sold[i][j]; //total for car brand (row)
                totalSoldCol[j] += sold[i][j]; //total for month (col)
            }
        } 
        
        // print data
        for(int i =0; i <months.length; i++){
            
            // print column headers (months)
            System.out.print("\t" + months[i]);
        } //end for Col headers
    
        System.out.println("\t|Average");
        
        for(int i =0; i <months.length; i++){
            // print Row Headers (Car brands)
            System.out.print(cars[i] + "\t");
            
            for(int j = 0; j <cars.length; j++){
                // print value of cars sold for each brand (each field)
                System.out.print(sold[i][j] + "\t");
            }
            //print average number sold for each month
            System.out.println("|" + totalSoldCol[i] /totalSoldCol.length); //col => months, top to bottom
            
        }//end for Row headers
        
        System.out.println("-------------------------------------------------------------");
        System.out.print("AVG:\t");
        
        //print the average cars sold MONTHLY
        for (int i = 0; i < months.length; i++) {
            
            System.out.print((totalSoldCol[i] / totalSoldCol.length) + "\t");
            
        }//end for
        System.out.println();
        
        //5. total number of cars sold each month
        System.out.print("Total:\t");
        for (int i = 0; i < months.length; i++) {
            
            System.out.print((totalSoldCol[i]) + "\t");
            
        }//end for
        System.out.println();
        
        
        //3+4. Best and Worst Sales over 6 months
        int best = 0;
        int worst = 1000;
        String bestCar = "";
        String worstCar = "";
        
        for (int i = 0; i < months.length; i++) {
            for(int j =0; j<cars.length; j++){ 
                 if (totalSoldRow[i] > best){
                    best = totalSoldRow[i];
                    bestCar = cars[i];
                }//end if
            
                //check worst seller (smallest number)
                if (totalSoldRow[i] < worst){
                    worst = totalSoldRow[i];
                    worstCar = cars[i];     
                } //end if
            }//end col (months)
           
        }//end for row (cars)
        System.out.println("\nThe Best Seller : " + bestCar  + " sold : " + best);
        System.out.println("The Worst Seller : " + worstCar  + " only sold : " + worst);
        System.out.println();

        
        
        
        
        
        
        
    }// end Main Class
    
}// END
