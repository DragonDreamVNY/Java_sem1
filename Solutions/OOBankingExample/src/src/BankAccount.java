package src;

/**
 *
 * @author alan.ryan
 */
public class BankAccount {
    
    private String name;
    private String address;
    private int number;
    private String sortCode;
    private String openingDate;
    private double balance;

    public BankAccount() {
        this.name = "";
        this.address = "";
        this.number = 0;
        this.sortCode = "";
        this.openingDate = "";
        this.balance = 0.0;
    }

    public BankAccount(String name, String holderAddress, int number, String sortCode, String openingDate, double balance) {
        this.name = name;
        this.address = holderAddress;
        this.number = number;
        this.sortCode = sortCode;
        this.openingDate = openingDate;
        this.balance = balance;
    }
    
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the holderAddress to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the sortCode
     */
    public String getSortCode() {
        return sortCode;
    }

    /**
     * @param sortCode the sortCode to set
     */
    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    /**
     * @return the openingDate
     */
    public String getOpeningDate() {
        return openingDate;
    }

    /**
     * @param openingDate the openingDate to set
     */
    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
   
    
    public double debit(double amount) {
        
        this.balance -= amount;
        return this.balance;
    }
    
    public double credit(double amount) {
        
        this.balance += amount;
        return this.balance;
    }
    
    public double transfer(double amount, BankAccount transferAccount) {
        
        transferAccount.credit(amount);
        return this.debit(amount);
        
    }
    
    @Override
    public String toString() {
        
        return String.format("%-20s%-10s%8.2f", this.getName(), this.getAddress(),this.getBalance());
         //in the above formatting, s refers to a String and f to a floating point number
         //-20s will print the string as it is. If the string has less than 20 characters, the output will be padded on the right.
         //-10s will print the string as it is. If the string has less than 10 characters, the output will be padded on the right.
         //8.2f will print the number as it is (to two decimal places). As its the last thing to print on a row I don't need any padding
        
    }
    
}
