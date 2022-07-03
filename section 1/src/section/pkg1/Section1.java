/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section.pkg1;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Section1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner hossam = new Scanner (System.in);
        int arr[]= new int [10000];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (hossam.hasNextInt()&&(i<9999)){   //to let him make numbers of input 
            arr[i] = hossam.nextInt();
            i++;
        }
        
        for(int j= 0;j<i;j++){//to get the output of his entry(input)
            if(arr[j]>max){
                max = arr[j];
                
            }
            else if(arr[j]<min){
                min = arr[j];
            }
        }//take all of the array and get the maximum value and minimum value in one value
        Arrays.sort(arr);
        for(int j = 0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
        System.out.println("the max is : "+max);
        System.out.println("the min is : "+min);
    }
    
}
