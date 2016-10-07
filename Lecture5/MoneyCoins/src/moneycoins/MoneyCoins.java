package moneycoins;
import javax.swing.JOptionPane;


public class MoneyCoins {

    public static void main(String[] args) {
         
         String moneyIn = JOptionPane.showInputDialog("Enter your 'amount' in euros and cents");
         double amount = Double.parseDouble(moneyIn); 
         
         /*
         remAmount = (int)amount*100)  
         // this is the same as below, but cast int type earlier
         */
         double cent = (double)amount * 100 ; //converts 3.45 EUR  to 345 cents
        // double euro = (int)cent/100 ; 
         
         int coin2Eur = (int)cent/200 ; // number of 2Euro coins from amount - preserve it as int by Casting
         /* remAmount = remAmount%200; */ //-reuse remAmount as the variable
         
         int coin1Eur = (int)(cent%200) / 100 ; // number of 1Euro coins after taking 2Euro coins
         /* remAmount = remAmount%100; */ //-reuse remAmount as the variable
         
         int coin50Cent = (int)((cent%100) / 50) ; //  number of 50cent coins after Euro coins
         
         int coin20Cent = (int)((cent%100)%50) /20 ; // number of 20cent coins after Euro and 50cent
         
         int coin10Cent = (int)( ( (cent%100)%50) % 20) / 10; // number of 10cent coins after the above
         
        int coin5Cent = (int)((( (cent%100)%50) % 20) % 10) / 5 ; // number of 5cent coins after the above

        int coin2Cent = (int)(((( (cent%100)%50) % 20) % 10) % 5)/2 ; // number of 5cent coins after the above

        int coin1Cent = (int)(((( ((cent%100)%50) % 20) % 10) % 5) % 2) ; // remainder in 1cent coins after the above
        

//      String cent = JOptionPane.showInputDialog("Enter your emount in cents");
 //      double numCent = Double.parseDouble(cent);
        
        /*Note: put String output for cleaner code*/ 
        /* 
            output += "\n" + coin2Eur + "    2 Euro Coins"; 
        */
         JOptionPane.showMessageDialog(null, "The " + amount + "EUR you put in gives \n " 
                                                            + coin2Eur + "  2 Euro coins \n" +
                                                            + coin1Eur + "  1 Euro coins \n" +
                                                            + coin50Cent + "  50 cent coins \n" +
                                                            + coin20Cent + "  20 centcoins \n" +  
                                                            + coin10Cent + "  10 cent coins \n" +
                                                            + coin5Cent + "  5 cent coins \n" +
                                                            + coin2Cent + "  2 cent coins \n" +
                                                            + coin1Cent + "  1 cent coins" 
         );
         //system.exit(0);
    }
    
}
