/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author hp
 */
public class Inherit {

    public static class person{
        person(){
            System.out.println("Person's constructor");
        }
    }
    public static class student extends person{
        student(){
            super();
            System.out.println("Student constructor");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s = new student();
        
        
    }
    
}
