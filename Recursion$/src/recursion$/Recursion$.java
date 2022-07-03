/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion$;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Recursion$ {

    static long fact(long x) {

        if (x == 0) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }

    static int fib(int z) {
        if (z == 1 || z == 2) {
            return 1;
        } else {
            return fib(z - 1) + fib(z - 2);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("enter number in factorial");
         int a = s.nextInt();
        System.out.println(fact(a));
        ///////////////////////////////////////////////////
        System.out.println("enter number in fibbonacci"+"\n");
        int b = s.nextInt();
        int arrFib[] = new int[b + 1]; //to make comparison  between first 2 index 
        arrFib[1] = 1;
        arrFib[2] = 1;
               //start from 3  end to last index of array 
        for (int i = 3; i <= b; i++) {
            arrFib[i] = arrFib[i - 1] + arrFib[i - 2];
        }

        //System.out.println(arrFib[b]);
        
        System.out.println("..............................");
        System.out.println(fib(b));
        
    }

}
