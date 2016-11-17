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
    
    /*1 default constructor*/
    public BankAccount(){
        name = "";
        address = "";
        number = 0;
        sortCode = "";
        openingDate = "";
        balance = 0;
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
     
   /* debit method*/
     
    
} //end Class
