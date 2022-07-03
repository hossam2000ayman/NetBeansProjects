/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection.sort;

public class SelectionSort {
//selection sort wok on find the minimum and then swap with first element in the array 
    public static void main(String[] args) {

        int arr[] = {25, 9, 20, 11, 21, 94, 3, 13};
        int min, minindex;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i]; //initially assume that the minimum is the first index of array 
            minindex = i; //with it's index

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                    minindex = j; // save it's index 
                }//i got minimum   ==> take order of (n^2)
            }
                //else make swap //default it make in 3 steps but it can be also in 2 steps
            //int temp = arr[i];
            //arr[i] = min;   min ===> arr[j]
            //arr[minindex] = min;   min ===> j
            //temp = min;
            arr[minindex] = arr[i];
            arr[i] = min; //==> logic that swap take order of (n)
            
            }    //for each loop (print the array)
        for (int res : arr) {
            System.out.println(res + " ");
        }//the loop is end when the all elements of the array are passing through it O(n)

    }

}
