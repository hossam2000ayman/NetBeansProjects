/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.define.exception;

/**
 *
 * @author hp
 */
public class BankAccount {
    private double accountbalance;
    private String accountname;
    private String accountnumber;
    
    
    public BankAccount(double ab,String an , String ann){
        accountbalance =ab;
        accountname = an;
        accountnumber  =ann;
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
    
    public void deposit (double amount){
        accountbalance =+amount;
    }
    
    public void withdraw(double amount){
        
        try{
            if(accountbalance<=amount){
                throw new InsufficientFundOfException();
            }
        }catch(InsufficientFundOfException IFE){
            IFE.PrintError();
        }
        
        
        
        
    }
    
    
    
    
}
