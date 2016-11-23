package l14_oo_bank;

/*
 * @author DragonDream
 */
public class BankAccount {
    private String name;
    private String address;
    private int number;
    private String sortCode;
    private String openingDate;
    private double balance;
    
    /*--- set ---*/
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    
    public void setnumber(int newNumber){
        this.number = newNumber;
    }
    
    public void setSortCode(String newSortCode){
        this.sortCode = newSortCode;
    }
    
    public void setOpeningDate(String newDate){
        this.openingDate = newDate;
    }
    
    public void setBalance(double newBal){
        this.balance = newBal;
    }
    
    public String toString(){
        String outString = (this.name +"\t" + this.address + "\t" + this.balance); 
                            //AccountName, Address, AccountBalance
        return outString;
    }
    
    /*
    @Override // to do with Inheritance issue
    public String toString(){
        return String.format("&-20s%-10s%8.2f", this.getName(), this.getAddress(), this.getBalance();
    }
    //if less than 20 characters, puts 8.8 spaces (floating point)  before decimal
    // in main, String method is passed automatically on object when passed into SystemPrint.
    // System.out.orintln(JohnAccount);
    */
    
     /*--- get ---*/
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getnumber(){
        return number;
    }
    
    public String getSortCode(){
        return sortCode;
    }
    
    public String getOpeningDate(){
        return openingDate;
    }
    
    public double getBalance(){
        return balance;
    }
    
    /*1 default constructor*/
    public BankAccount(){
        this.name = "";
        this.address = "";
        this.number = 0;
        this.sortCode = "";
        this.openingDate = "";
        this.balance = 0;
   }//with default values for new object instances
    
    
    /*2 single constructor with one arg for opening balance*/
    public BankAccount(double bal){
        balance = bal;
    }
    
    /*3 constructor with overwrite variables*/
     public BankAccount(String nom, String ad, int n, String sort, String enterdate, double bal){
        name = nom;
        address = ad;
        number = n;
        sortCode = sort;
        openingDate = enterdate;
        balance = bal; 
   } // end constructor
     
   /* debit method */
     public double Debit(double debitAmount){
         this.balance = balance + debitAmount;
         return this.balance;
     }
    
     /* credit method */
     public double Credit(double creditAmount){
         this.balance = balance - creditAmount;
         return this.balance;
     }
     
     /* transfer */
     /*
     public void Transfer(double amount, BankAccount transferAccount){ //pass in 2 params: amount and passed in object instance 
        this.balance = this.balance - amount; //this refers to current Object Instance
        transferAccount.balance = transferAccount.balance + amount; //see this is the balance of the Object Parameter passed in
        //no return here, because "which balance do you return?" therefore void
        // alternative, see below to call the Debit and Credit methods
     }
     */
     
     public double Transfer(double amount, BankAccount transferAccount){
        transferAccount.Credit(amount);
        return this.Debit(amount);
     }
     
     
     
} //end Class
