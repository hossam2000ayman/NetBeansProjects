/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_class;

/**
 *
 * @author hp
 */
public class Inner_Class {

    public static class outer_class{
        int x = 20;
          class  inner_class{
           int y = 10; 
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       new outer_class();
        outer_class.inner_class in = new outer_class().new inner_class();
    }
    
}
