/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

/**
 *
 * @author hp
 */
public class Link {
    private int value;
    private Link pointer;
    //create node with value and pointer 
    public Link(int v ,Link p){
        value = v;
        pointer = p;
    }
    //create node with pointer only
    public Link(Link p ){
        pointer = p;
    }

    //setters and getters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {  
        this.value = value;
    }

    public Link getPointer() {   //getpointer() == get the node or print it 
        return pointer;
    }

    public Link setPointer(Link pointer) {  //setpointer() == make a new node and loads it on memory 
        this.pointer = pointer;
        return this.pointer;
    }
    
    
}
