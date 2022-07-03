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
public class InsufficientFundException extends Exception{
    public void printError(double amount){
        System.out.println("Insufficient fund to cover"+amount);
    }
}
