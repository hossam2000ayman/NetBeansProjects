/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear_search;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Linear_Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[] = {4,2,1,3,7,3,9,8,11};
        
        
        Scanner s = new Scanner(System.in);
        
        int target = s.nextInt();
       
        
        for(int i=0;i<arr.length;i++){
        if(target == arr[i]){
                System.out.println("target is found");
            }
        }
         
        
        
    }
    
}
