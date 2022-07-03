/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max_._min;
import java.util.Scanner;
/**
 *
 * @author hp
 */

//Muhammad took the task of his friend to discover the largest and smallest number of a set of numbers.
//
//Extracting the largest number and the smallest number from a set of numbers can be considered an easy problem to solve if the number of numbers is small, but what would Mohammed do if the number of those numbers too much, such as 1000 numbers.
//
//That is why we want to help Mohammed make a program that makes it easier for him
//It works for any number of numbers up to 106 

public class Max__Min {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner hossam = new Scanner (System.in);
        
        int arr[] = new int[10000000];
        int min =  Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
       
        int  i = 0;
        
        while(hossam.hasNextInt()&&i<999999){    //has next int mean by the user in integer only that complete the  loop 
                                                //to break the loop use the string or any another data type except integer
            arr[i] = hossam.nextInt();
            //take it and keep it in storage
        }
        for(int x = 0;x>i;x++){   //7ateet i le2enaha teb2a leha 3elaka mn el loop el 2ableha we for loop ka2enaha index 999999
                                           //3alashan may7salsh index out of boundaries
            if(arr[x]>max){
                max = arr[x];
            }
            else if(min<=arr[x]){
               min = arr[x];
            }
        }
        System.out.println("the max is "+max);
        System.out.println("the min is "+min);
        
        
        
 
       
       
    }
    
}
