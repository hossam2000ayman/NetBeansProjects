/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple_inheritence;

/**
 *
 * @author hp
 */
public class Multiple_inheritence {

    interface one{
        public void calcarea(double l , double w);
    }
    interface two{
        public void calcpermiter(double l, double w);
    }
    
    interface all extends one , two{
        /*.....................*/
    }
  
    public static class square implements one,two {
       @Override
        public void calcarea(double l,double w){
            double area = l*w;
            System.out.println(area);
        }
         

        @Override
        public void calcpermiter(double l, double w) {
        double perimeter = (l+w)*2;
        System.out.println(perimeter);
        }

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       square s = new square();
       s.calcarea(4, 3);
       s.calcpermiter(324, 235);
       
        
    }
    
}
