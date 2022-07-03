/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        
        operation(76);
    }
    
    public static int operation(int x){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first number");
        int value_x = s.nextInt();
        
        
       
        int square_x = x*x;
        String String_square_x = ""+value_x+"";
        
        
        if(String_square_x.equals(square_x)){
            
            System.out.println("This is Automorphic");
        }else{
            System.out.println("This is not Automorphic");
        }
        
        
        
        return 0;
    }
    
}
