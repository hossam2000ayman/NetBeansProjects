/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author hp
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box box1 = new Box();
        Box box2 = new Box();
        
         box1.width = 23;
         box1.height = 33;
         box1.depth = 45;
        box1.volume();
        
        System.out.println("//////////////////");
        
        box2.width=23.3;
        box2.height = 23.2;
        box2.depth = 21.21312;
        box2.volume();
        
        
    }
    
}
