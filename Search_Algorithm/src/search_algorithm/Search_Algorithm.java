/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search_algorithm;
import java.util.Arrays;
/**
 *
 * @author hp
 */
public class Search_Algorithm {

    /**
     * @param args the command line arguments
     */
    
    public static boolean LinearSearch(int arr[],int item){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==item){
                return true;
            }                             // it's complexity in worst case is Order of (n)
        }                               //as it must pass of all array to search of the item  so it take n terms or indexes
        return false;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int linear_arr [] = {5,14,15,3,21,42,27};
        System.out.println(LinearSearch(linear_arr , 21));
        
        
        int Binary_arry [] = {23,34,1,2340,12,64,2,1,40,6,8,9,6,5,38,21,3};
        
        Arrays.sort(Binary_arry);
       
        System.out.println(BinarySearch( Binary_arry,2340,0,Binary_arry.length-1));
                                                            //16
    }
    
    
    public static boolean BinarySearch(int arry[],int item ,int l,int h){
        while(l<=h){
            int mid = (l+h)/2;
            
            if(arry[mid]==item){
                return true;
            }
            
            else if (arry[mid]<item){
                l = mid + 1;
            }
            else if (arry[mid]>item){
                h = mid - 1;
            }
                                                       //it's complexity can be characterized in worst case  ==> Order in (Log n)base of 2
        }                                                
                                                          //if i divided the array into x sub array so it Order in Log n with base x
        return false;
    }                                                      //tb we heya leh log n ====> 3alashan ana b3ady 3ala 2aktar mn 5atwah we ba5taser 2asr3 
                                                                 //bawsal lel solution 2aser3 
    
    
    
}
