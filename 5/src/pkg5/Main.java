/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5;

/**
 *
 * @author hp
 */

    
    class A{
        protected static String s ="A";
    }
    class B extends A{
        
    }
    class C extends B{
        static void methodOfC(){
            System.out.println(s);
        }
    }

    /**
     * @param args the command line arguments
     */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
    
        C.methodOfC();
    }
    
}
