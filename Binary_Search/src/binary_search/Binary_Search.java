/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Binary_Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={5,6,4,35,35,6,55,5,4,3,34,26,6,7,3567,535,754,6,3,354,567,5,3,57,64,6,345,356,746,35,254,45,38745,6354};
        
        Arrays.sort(arr);
        
        int max = arr[32];
        int min = arr[0];
        
        Scanner hossam = new Scanner(System.in);
        System.out.println("enter you number search");
        int target = hossam.nextInt();
       while(min<max){
         int mid = (max+min)/2;
           if(mid>target){
               max = mid-1;
           }
           
           else if(mid<target){
               min = mid+1;
           }
           else if(mid==target){
               System.out.println("your target number is "+target);
               break;
           }
          
           
           
       }
        
    }
    
}
