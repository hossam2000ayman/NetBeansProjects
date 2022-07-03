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
public class UserDefineException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        BankAccount BA = new BankAccount(0 , "hossam", "19-00417");
        
    
        BA.deposit(10000+3000);
        BA.withdraw(12999);
    }
    
}
