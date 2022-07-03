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
public class UDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InsufficientFundOfException { //3alashan 7atetha fy method wihdraw fa lo sheltaha mmken teshelha 3andak fy main kaman 
        // TODO code application logic here
        BankAccount BA = new BankAccount("hossam","19-00417",6000);

        BA.deposit(5000);
        BA.withdraw(7000);
    }
    
}
