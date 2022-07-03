/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion.sort;

/**
 *
 * @autQhor hp
 */
public class InsertionSort {
//in insertion sort we --> insert each element in the correct position from the beginning    
    public static void main(String[] args) {
        int arr[] = {25, 9, 20, 11, 21, 94, 3, 31};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                    //25      //9  25<9 --> swap 
                                           //20!<9   20<25 SWAP and so on  
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    }
            }
        }   
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
