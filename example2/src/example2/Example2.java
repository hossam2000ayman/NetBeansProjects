/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

 /*
 * @author hp
 */
public class Example2 {

    public class Complex{
        public float real;
        public float img;
        
        public Complex add(Complex x){
             Complex c;
             c = new Complex();
             c.real = real+x.real;
             c.img = img+x.img;
            return c;
        }
        
        public Complex subtract(Complex x){
            Complex c;
            c = new Complex();
            c.real = real-x.real;
            c.img = img-x.img;
            return c;
        }
    }
    /**
     * @param args the command line arguments
     */
    public  void main(String[] args) { //remove static
        // TODO code application logic here
      
       
        Complex a,b,c,d;
       a =new Complex();
       b = new Complex();
       c = new Complex();//result subtract
       d = new Complex(); //result of add
       a.real = 2;
       b.real = 1;
       a.img = 4;
       b.img = 2;
       c= a.subtract(b);
       d = a.add(b);
       System.out.println("real component = "+c.real+
               "imaginary component= "+c.img);
       
          System.out.println("real component = "+c.real+
               "imaginary component= "+c.img);
    }
    
}
