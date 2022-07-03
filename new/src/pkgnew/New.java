/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

import sun.net.www.content.text.Generic;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class New {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Generic g ;
        
         int x= 10;
          double y = 5;
         
          if(x==2*y){
              int z= 5;
              x =(int) (y+z);
    }
          else{
              System.out.println("not avaliable");
              System.exit(0);
          }
         
          ////////////////////
         
          
          Scanner hossam = new Scanner (System.in);
          int xx = 9;
          System.out.println("enter your number ");
           xx = hossam.nextInt();
          
          switch(xx){
                case(12):
                    System.out.println("you select 12");
          break;
                    case(13):
                        System.out.println("you select 13");
                        break;
          
                        
                    case (14):
                        System.out.println("you select 14");
                        break;
          
                    default:
                        System.out.println("invalid number");
          }
          
                
                      
    }
    
}
