/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_object;

/**
 *
 * @author hp
 */
public interface StackI {
    public Object pop();    //make more than one data type or idk the datatype of this as it's vary from one to another
       //String   // Integer
    
    public Object top(); //dah method ba print lel stack ely zahera           //make more than one data type or idk the datatype of this as it's vary from one to another
       //String   // Integer
    public void push(Object i);
    public boolean Isempty();
    public boolean Isfull();
}
