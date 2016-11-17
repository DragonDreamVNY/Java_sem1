package l14_oo_bank;

/**
 *Bank Account example
 * using Objects, methods, constructors, public and privates
 * @author DragonDream
 */
public class Accounts {

    public static void main(String[] args) {
        BankAccount JohnAccount = new BankAccount("John", "Limerick", 987654, "98-78-63", "17/12/2002", 788.36);
        
        BankAccount LisaAccount = new BankAccount("Lisa", "Limerick", 123456, "98-78-65", "24/02/1998", 1300.36);

        BankAccount MaryAccount = new BankAccount("Mary", "Cork", 784512, "63-41-61", "12/05/1007", 25.33);

        BankAccount ShaneAccount = new BankAccount(1933.24); //uses default constructor with single arg
      
        /*initialise Shane's Account */
        ShaneAccount.setName("Shane");
        ShaneAccount.setAddress("Dublin");
        ShaneAccount.setnumber(895623);
        ShaneAccount.setSortCode("");
        ShaneAccount.setOpeningDate("2/12/2000");
        // ShaneAccount.setBalance(1933.24);
        
        /*1*/ MaryAccount.setSortCode("78-56-96");
        /*2*/ LisaAccount.setAddress("Waterford");
        /*3*/ JohnAccount.setOpeningDate("17/11/2016");
        /*4*/ JohnAccount.setName("John McBride");
        /*5*/ MaryAccount.setName("Mary O' Connor");
        /*6*/ LisaAccount.setName("Lisa Ahern");
        /*7*/ ShaneAccount.setName("John Moroney");
        /*8*/ System.out.println(JohnAccount.toString() + "\n"
                                + LisaAccount.toString() + "\n"
                                + MaryAccount.toString() + "\n"
                                + ShaneAccount.toString());
        
    } // end Main method
    
} // end BankAccount class
