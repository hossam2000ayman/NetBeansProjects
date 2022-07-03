/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excep;

/**
 *
 * @author hp
 */
public class Excep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        try { 
//		int[] numbers = { 1, 2, 3 }; 
//		for (int i = 0; i <= 3; i++)       	System.out.println(numbers[i]); 
//		} 
//	catch (Exception e) {
//		System.out.println(e.toString());
//		} 

       try{
           int x = 4;
           int y = 0;
           int z = x/y;
           System.out.print(z);
       } catch(ArithmeticException AE){
           System.out.println("cannot divide by zero");
           
       }
       
       try{
           int []arr = new int[100];
           int i = arr[100];
       }catch(ArrayIndexOutOfBoundsException AIOBE){
           System.out.println("Array Index Exceeding");
       }
       
       try{
           int []arx = new int[-6];
           System.out.println("zaz");
       }catch(NegativeArraySizeException NAI){
           System.out.println("array size cannot be negative");
       }
        
       try{
           String str = null;
           int val = str.length();
           
       }catch(NullPointerException NPE){
       
           System.out.println("string has null characters");
    }
       
       try{
          String val = "1o";
          int myval = Integer.parseInt(val);
       }catch(NumberFormatException NFE){
           System.out.println("cannot convert letter to integer");
       }
       
       
          String vall = "1o";
          int myvall  = vall.length();
       System.out.println("1o ===>"+myvall);
    
       try{
           System.out.println("1");
           int v = 10/0;
          String s = null;
          int ss = s.length();
          System.out.println(ss);
       }catch(ArithmeticException e){
           System.out.println("2");
       }catch(Exception e){
           System.out.println("3");
       }
    

    }
    
    
    
}
