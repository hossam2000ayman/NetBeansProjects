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
public class Stack implements StackI {

    private Object []ArrayStack; //array of the stack
    private int top; //dah element //it stand at the top ofthe element which the last input first output
    private int maxsize; //maximum of the array size
    
                 //size
    public Stack(int s){
        ArrayStack = new Object[maxsize]; //lma ba3araf 7aga 3ala  nafsagha bwel array mmkn 23melha keda badal mn for loop we 23rafha 
        maxsize = s;
        top = -1; //no item were added
    }
    
    @Override
    public Object pop() {

       Object res = ArrayStack[top]; //initialized to to print it 
       top--; //delete the value
       return res;
//    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object top() {
        return ArrayStack[top];
    }

    @Override
    public void push(Object i) {
        top++;
        ArrayStack[top] = i;
        //arrangement is important 
        //1 - increase th index with 1
        //2- so we able to assign new value top equal Object (i)

    }

    @Override
    public boolean Isempty() {
    return(top == -1);
    //mean that return true if it has no value in stack and false if the opposite is true
    }

    @Override
    public boolean Isfull() {
    return(top == maxsize-1);
    //if the last input located at the last index so it's full stack
    }
    
}
