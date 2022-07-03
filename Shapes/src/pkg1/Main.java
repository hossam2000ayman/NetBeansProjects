/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
import java.util.Scanner;
/**
 *
 * @author hp
 */



//Someday a student gets a hard assignment.
//
//This assignment is:
//To calculate an area of triangle, square and circle.
//
//So he thinks to make a program that can give it the parameters 
//and this program calculates the shape area.
//
//Then he needs you to create a project that u give him 1 for triangle, 2 for square, 3 for circle then enter his parameters depend on his pick.
//
//Hint: Triangle Area = 0.5*b*h , Square Area = l 2 , Circle Area = pi r 2

public class Main {
    
    public static double Triangle_area(double b, double h){
      
        double area = 1/2*b*h;     
        return area;
}
    public static double Square_area(double l){
       double area = Math.pow(l, 2); //l^2
        return area;
    }
    
    public static double Circle_area(double PI ,double r){
        double area = PI*Math.pow(r, 2);
        return area;
    } 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("enter your want rule 1 = triangle , 2 = square , 3 = circle");
        
        Scanner Hossam  = new Scanner(System.in);
        
        int law = Hossam.nextInt();
        //switch takes value in casting integer not double okay ...
        switch(law){
            case 1:
              System.out.println(Triangle_area(30,20));
                break;
            case 2 :
                 System.out.println(Square_area(5));
                break;
            case 3 :
                System.out.println(Circle_area(3.14,30));
                break;
            default:
                System.exit(0);
        }
           
        
    }

   
    
}
