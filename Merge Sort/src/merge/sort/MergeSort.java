/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge.sort;

/**
 *
 * @author hp
 */
public class MergeSort {
//second step
    public static int merge(int array[],int low ,int mid , int high){
           //make b array as temporarily array to store the result       
        int b[] = new int [array.length];
        
       int right = mid +1; int left = low ;  int arrayk=0;
      
       while(left<=mid && right<=high){ //divided the array into two array and make comparison between them 
                                                          //low          //mid            //hight
           if(array[left]<array[right]){                   //left       //mid  //mid+1    //right                   ------
               b[arrayk]=array[left];                    //{  2    5      8       6    3    10    }                       |
               arrayk++; left++;                                                              //                          |
           }else{                                      //  {  2  ,  5  ,  8  }             {  6  ,  3   ,   10}           | -->> MergeSort()                                
               b[arrayk]=array[right];                //{2, 5}            {8}             {6,3}                 {10}      | divided the array into sub array 
               arrayk++; right++;                     //{2}    {5}         {8}           {6}     {3}           {10} ------
                                                          //(2<5)                           (6!<3)                        |
                                                          //{2,5}         {8}                 {3,6}             {10}      |
                                                        // (2<8) (5<8)      (remain)        (3<10)(6<10)                  |--> Merge()                        
           }                                                     //{2,5,8}                       //{3,6,10}               |sort the array after decompose it 
       }                                                // (2<3) (5!<3)  (5<6) (8<10)                    (remian)         | into array with only 1 index 
                                                      //               {2,3,5,6,8,10}  (finish)                     ------

       while(left <=mid){
           b[arrayk]= array[left];
           arrayk++; left++;
       }
       while(right<=high){
           b[arrayk] = array[right];
           arrayk++; right++;
       }
 
   
   for (int i= 0; i<array.length;i++){
      array[low+i] = b[i];
   System.out.println("your array is "+ array[low+i]);
   }
   
        return 0;
              
   
        
       
    }                                      
    
    
    //first step
   public static void merge_sort(int values[],int left , int right){
        if(left<right){
            int mid = (left+right)/2;
            
            //sort the first half of the values
            merge_sort(values,left,mid); //recursion
            
            //sort the second half of the values
            merge_sort(values,mid+1,right);
            
           merge_sort(values,left,right);
        }
        
    }
   
   
    
    
    public static void main(String[] args) {
    
        int arr[] = {9,6,4,2,1,5,4,8,10,3,7};
   merge_sort(arr,arr[0],arr[arr.length-1]);
   merge(arr,arr[0],arr[(arr[0]+arr[arr.length-1])/2],arr[arr.length-1]);
    }
    
}
