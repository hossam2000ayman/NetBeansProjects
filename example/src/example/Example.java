/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author hp
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int a = args.length;
            System.out.println("a ="+a);
            int b =42/a;
            int c[] = {1};
            c[42] = 99;
        }catch(ArithmeticException e){
            System.out.println("divided by zero");
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array of index oob");
        }
        System.out.println("After try and catch block");
    }
    
}
