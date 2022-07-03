/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdefineexception;

/**
 *
 * @author hp
 */
public class UserDefineException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount BA = new BankAccount("hossam",5000,"19-40017");
        BA.withdraw(7000);
    }
    
}
