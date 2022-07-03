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
public class InsufficientFundOfException extends Exception {
    
    public void printError(double amount){
        System.out.println("insufficient fund for cover this "+amount);
    }
}
