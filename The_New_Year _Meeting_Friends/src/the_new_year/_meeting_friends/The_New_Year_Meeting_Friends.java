/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_new_year._meeting_friends;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author hp
 */

//There are three friend living on the straight line Ox in Lineland. The first friend lives at the point x1, the second friend lives at the point x2, and the third friend lives at the point x3. They plan to celebrate the New Year together, so they need to meet at one point. What is the minimum total distance they have to travel in order to meet at some point and celebrate the New Year?
//
//Input: 3 number x1,x2,x3 as a house number.
//Ex1: 7 1 4
//Output: the minimum total distance they have to travel in order to meet.
//Answer1: 6
//It's guaranteed that the optimal answer is always integer.

public class The_New_Year_Meeting_Friends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner S = new Scanner(System.in);
        
        int arr[] = new int[3];
        System.out.println("enter the first number");
        arr[0] = S.nextInt();
        System.out.println("enter the second number");
        arr[1] = S.nextInt();
        System.out.println("enter the third number");
        arr[2] = S.nextInt();
        
        Arrays.sort(arr);  //ascending
        
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" , ");
        }
            System.out.println("\n"+(arr[2]- arr[1])+(arr[1]-arr[0]));
        
        
    }
    
}
