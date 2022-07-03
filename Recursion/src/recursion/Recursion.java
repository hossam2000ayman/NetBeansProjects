/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author hp
 */
public class Recursion {

    public static int factorial(int n){
        if(n == 0){
            return 0;
        }else{
            return n*factorial(n-1);
        }
    }
    public static int summation(int x,int s){
        
        
        if(x == 25){
             return x;
         }
         else{
             s = s+x;
         }
         return summation(x-1,s);
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int sumf = 0;
        for(int i=0;i<=7;i+=2){
        sumf = sumf+ factorial(i);
    }
     int sums = summation(25,0);
        
        double finaldiv = (double)sums/sumf;
        
        System.out.println(finaldiv);
        // TODO code application logic here
    }
    
}
