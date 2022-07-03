package post_fix_evaluation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Stack {

    private int[] ArrayStack; //array of the stack
    private int top;//it stand on the top element
    private int maxsize;//maximum capacity    

    public Stack(int s) { //constructor can be call it and use size
        maxsize = s;
        ArrayStack = new int[maxsize]; //make array with indexs of maxsize
        top = -1; //no items are added

    }

    public void push(int i) { //insert
        top++;
    ///top++;  //ArrayStack[top] = i;
        //1- increase element in stack by 1 
        //2- initialized the added element 
        ArrayStack[top] = i;

    }

    public int pop() { //remove
        int res = ArrayStack[top]; //return the value first 
        top--;//then delete it 
        return res;
    }

    public int top() {
        return ArrayStack[top];//print first element in stack
    }

    public boolean IsEmpty() {
        return (top == -1);//if first element does not refer to value
    }

    public boolean IsFull(){
        return(top == maxsize-1); //when top refer to last index of array so it's full
    }
}
