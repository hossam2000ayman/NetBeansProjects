package userdefineexception;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class BankAccount {
    private String accountname;
    private double accountbalance;
    private String accountnumber;
    
    public BankAccount(String an , double ab , String ann){
        accountname = an;
        accountbalance = ab;
        accountnumber = ann;
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
    
    
    public void deposit(double amount){
        accountbalance =+amount;
    }
    
    public void withdraw(double amount){
        try{
            if(accountbalance<amount){
                throw new InsufficientFundException();
            }else{
                accountbalance =- amount;
            }
        }catch(InsufficientFundException IFE){
            IFE.printError(amount);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}


