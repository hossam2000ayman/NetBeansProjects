/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.intro;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ExceptionIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner input = new Scanner(System.in);
        
        try{
        System.out.println("Enter your Measure");
        double measure = input.nextDouble();
    
      
        System.out.println("By which");
        
       String choice = input.next();
       
      
           
       
       switch(choice){
           case "cel":
               double celicius = measure;
            measure *= 33.8;
            double fahrenheit = measure;
            System.out.println("Measure from Celicius : " + celicius + "\n" + "Convert to Fahrenheit : " + fahrenheit);
               break;
           case "fahr":
              double fahr = measure;
              measure /= 33.8;
            double cel = measure;
            System.out.println("Measure from Fahrenheit : " + fahr + "\n" + "Convert to Celicius : " + cel);
       break;
       }
       
        }catch(Exception e){
            System.out.println("Error and it's type is "+e);
        }
//            
        
    }

}
