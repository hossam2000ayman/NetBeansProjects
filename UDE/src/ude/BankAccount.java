/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ude;

/**
 *
 * @author hp
 */
public class BankAccount {
    private String accountname;
    private String accountnumber;
    private double accountbalance;
    
    public BankAccount(String an , String ann ,double ab){
        accountname = an;
        accountnumber = ann;
        accountbalance = ab;
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
    
    public void deposit(double amount){
        accountbalance =+amount;
    }
//    public void withdraw(double amount){
//        try{
//        if(accountbalance<amount){
//            throw new InsufficientFundOfException();
//        }else{
//            accountbalance=-amount;
//        }
//        }catch(InsufficientFundOfException IFE){
//            IFE.printError(amount);
//        }
//    }
    
    public void withdraw(double amount) throws InsufficientFundOfException{ //but i didnt handler the exception (try - catch) must wrie try and catch 
        try{
        if (accountbalance<amount){
            throw new InsufficientFundOfException();
        }else{
            accountbalance-=amount;
        }
        }catch(InsufficientFundOfException IFE){
            System.out.println("error");
        }
    }
}
