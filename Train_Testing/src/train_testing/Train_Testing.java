/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train_testing;

/**
 *
 * @author hp
 */
public class Train_Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public static int Add(int num1 , int num2){
        return num1+num2;
    }
    public static Integer getFactorial(int number){
        if(number<0){
            return null;
        } 
        //if it's not true then
        
        int fact = 1;
        for(int i = number;i>1;i--){
            fact *= i;
        }
        return fact;
    }
    
}
