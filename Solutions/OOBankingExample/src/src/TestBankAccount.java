/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author alan.ryan
 */
public class TestBankAccount {

    public static void main(String args[]) {

        //create objects
        BankAccount JohnAccount = new BankAccount("John", "Limerick", 987654, "98-78-63", "17/12/2002", 788.36);
        BankAccount LisaAccount = new BankAccount("Lisa", "Limerick", 123456, "98-78-65", "24/2/1998", 1300.36);
        BankAccount MaryAccount = new BankAccount("Mary", "Cork", 784512, "63-41-61", "12/05/2007", 25.33);
        BankAccount ShaneAccount = new BankAccount(1933.24);

        ShaneAccount.setName("Shane");
        ShaneAccount.setAddress("Dublin");
        ShaneAccount.setNumber(895623);
        ShaneAccount.setSortCode("85-41-52");
        ShaneAccount.setOpeningDate("2/12/2000");


        /* OPERATIONS
        1. Change the SortCode for the MaryAccount to “78-56-96”.
        2. Change the Address for the LisaAccount to “Waterford”.
        3. Change the OpeningDate for the JohnAccount to todays date.
        4. Change the name for the JohnAccount to “John McBride”.
        5. Change the name for the MaryAccount to “Mary O’Connor”.
        6. Change the name for the LisaAccount to “Lisa Ahern”.
        7. Change the name for the ShaneAccount to “Shane Moroney”.
        */
                
        MaryAccount.setSortCode("78-56-96");
        LisaAccount.setAddress("Waterford");
        JohnAccount.setOpeningDate("17/11/2016");
        JohnAccount.setName("John McBride");
        MaryAccount.setName("Mary O'Connor");
        LisaAccount.setName("Lisa Ahern");
        ShaneAccount.setName("Shane Moroney");
               
        
        //print column headingss
        System.out.println(String.format("%-20s%-11s%10s", "Account Name", "Address", "Current Balance"));
        //in the above formatting, s refers to a String
        //-20s will print the string as it is. If the string has less than 20 characters, the output will be padded on the right.
        //-11s will print the string as it is. If the string has less than 11 characters, the output will be padded on the right.
        //10s will print the string as it is. As its the last thing to print on a row I don't need any padding

        //Display the account name, account number and balance for the four accounts.
        System.out.println(JohnAccount);
        System.out.println(LisaAccount);
        System.out.println(MaryAccount);
        System.out.println(ShaneAccount);
        
        
        /* OPERATIONS
         9.  debit the JohnAccount object by €200.
         10. credit the ShaneAccount object with €150
         11. debit the JohnAccount object by €100.
         12. credit the MaryAccount object with €1000.
         13. debit the LisaAccount object with €150.
         14. transfer €150 from the LisaAccount object to the MaryAccount object.
         15. transfer €1000 from the ShaneAccount object to the JohnAccount object 
         */
        
        JohnAccount.debit(200);

        ShaneAccount.credit(150);

        JohnAccount.debit(100);

        MaryAccount.credit(1000);

        LisaAccount.debit(150);

        LisaAccount.transfer(150, MaryAccount);

        ShaneAccount.transfer(1000, JohnAccount);

        //Display the account name, account number and balance for the four accounts.
        System.out.println(JohnAccount);
        System.out.println(LisaAccount);
        System.out.println(MaryAccount);
        System.out.println(ShaneAccount);

    }

}
