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
public class InsufficientFundOfException extends Exception {
    
    public void PrintError(){
        System.out.println("Insufficient fund try to with draw again");
    }
}
