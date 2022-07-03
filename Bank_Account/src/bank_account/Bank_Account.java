/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_account;

/**
 *
 * @author hp
 */
public class Bank_Account {

    private String accountname;
    private String accountnumber;
    private double accountbalance;
    
    public Bank_Account(String n,String nn,double ab){
        this.accountname=n;
        this.accountnumber = nn;
        this.accountbalance = ab;
    }
    
    public void deposit(double amount){
     accountbalance=+amount;   
    }

    public void withdraw(double amount) throws InsufficientFund{ 
        try{
        if(amount<accountbalance){
            accountbalance=-amount;
        }else{
            throw new InsufficientFund();
        }
        }catch(InsufficientFund IF){
           IF.printError(amount);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InsufficientFund {
        // TODO code application logic here
        
        int a = args.length;
        System.out.println("a ="+a);
        
        Bank_Account BA = new Bank_Account("hossam","19-0012",6000);
        BA.withdraw(400);
    }

    /**
     * @return the accountname
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * @param accountname the accountname to set
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
     * @return the accountnumber
     */
    public String getAccountnumber() {
        return accountnumber;
    }

    /**
     * @param accountnumber the accountnumber to set
     */
    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    /**
     * @return the accountbalance
     */
    public double getAccountbalance() {
        return accountbalance;
    }

    /**
     * @param accountbalance the accountbalance to set
     */
    public void setAccountbalance(double accountbalance) {
        this.accountbalance = accountbalance;
    }
    
}
