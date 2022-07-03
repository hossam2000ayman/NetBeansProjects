/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.sort;


public class BubbleSort {
//bubble sort work on --> swap all the elements of array until it sorted 
    public static void main(String[] args) {

        int arr[] = {25,9,20,11,21,49,3,31};
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){ //must make arr.length - 1 because of refering in array completely not surplus by 1 (lead to array index out of boundaries)
                     //9   <  //25
                if(arr[j+1]<arr[j]){ // swap
                                 //9
                    int temp = arr[j+1];
                      //9      //25                  
                    arr[j+1] =arr[j];
                    //25    //9
                    arr[j]=temp;
                }//else not make any thing put them as it 
         
            }
          
        }
                 for(int x:arr){
            System.out.print(x+" ");
        }
    } 
    
}
