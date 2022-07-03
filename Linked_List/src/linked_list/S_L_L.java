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
public class S_L_L implements LIST {

    //any node must have
    private Link head;
    private Link tail;
    private Link current;
    private int size;

//    //other nodes
    private Link x1;
//    private Link x2;

    public S_L_L() {                                //create a node with pointer only
        head = tail = current = new Link(null);  //call the link with pointer only
        size = 0;
    }

    @Override
    public void clear() { //cut the head therefore the other nodes were cut 
        head.setPointer(null);
        size = 0;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(int item) {
        current.setPointer(new Link(item,current.getPointer()));
        
        if(current == tail){
            tail = current.getPointer();
        }
        size++;

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public S_L_L(int size){ //make a constructor to call to empty constructor
        this(); //2enoh yeb2a leh size
    }

    @Override
    public void append(int item) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //value , pointer
        tail = tail.setPointer(new Link(item, x1));
        size++;
    }

    @Override
    public void next() {
        if (current != tail) {
            current.getPointer();
        }
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prev() {
        if (current == head) {
            return;
        }
        Link aa = head; //to identify the previous of current by start from head and go until reach before current 
        while (aa.getPointer() != current) {
            aa = aa.getPointer();
        }
        aa = current;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int remove() {
        int item = current.getPointer().getValue();
   
        if(current.getPointer() == tail){
            tail = current;
        }
        
        //if i want to delete a node for the middle
        
        current.setPointer(current.getPointer().getPointer());
        size--;
        return item;
    }

   
    @Override
    public void movetostart() {

        current = head;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movetoend() {
        current = tail;
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lenght() {
        return size;
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movetopos(int pos) {

        if (pos < 0 || pos > size) {
            return;
        }
        Link aa = head;
        for (int i = 0; i <= pos; i++) {
            aa = aa.getPointer();
        }
        current = aa;
    }

    @Override
    public int getvalue() {
        if(current.getPointer()==null){
            return -1;
        }else{
            return current.getPointer().getValue();
        }
    }

    @Override
    public void currpos(int pos) {
    
        Link aa = head;
        for(int i=0; aa!=current;i++){
            aa=aa.getPointer();
        }
    }
}
