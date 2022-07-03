/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

/**
 *
 * @author hp
 */
public class SLL implements List {
//Linked list consisit of head  and tails of nodes
    //hal el head gowaha bet3araf el node bya5od value we pointer wala bya5od pointer bs   ----> pointer bs

    private Node head; // N v,n ==> false     N  n==>true
    //ha3rafo mn constructor ely bya5od next bs (bnesba lel head)

    private Node tail; // N v,n ==> false     N  n==>true
    private Node current;  // N v,n ==> false     N  n==>true
    //current byshawer 3ala el previous node
    //current point to the previous node not in current node

//el talata (tail we current we head) ha3arafhom bel pointer bs 
    private int size; //initialization  dah fy el2owel el size bysawe 0

    //n3mel constructor 
    public SLL() {
        //current = head = tail = new Node(19,null);   ==> keda ana hacall 3ala 1st constructor
        current = head = tail = new Node(null); // call 2nd constructor (next only)
        size = 0;
    }

    @Override
    public void clear() {
             //set = edit
        head.setNext(null);  //ma5aletosh yeshawer 3ala 7aga  //cut the head   ==> cut the whole list, mayshawersh 3ala node tany 

        current = head = tail = new Node(null); //whole list where cut and no pointer refered to node
        size = 0;

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(int item) {
        //item  //edit next node => create new node and has pointer to the nexr of the current 
        current.setNext(new Node(item,current.getNext()));
        
        if(current == head){
             current = head.getNext();
        }
        if (current == tail) {
            tail = current.getNext();
        }
        size++;

    }

    public SLL(int size){
        this(); //to previous constructors
    }
    
    
    @Override
    public void append(int item) {  //yezawed value mn wara(fy 2a5er node 3ndk)  

        tail.setNext(new Node(item, null)); // el b3d el tail 2adeef new node 
        //3alashan keda katabt setNext()  msh getNext()--> rag3ly el 3enwan bt3oh(print leh) 
                              //edit 
        tail = tail.setNext(new Node(item, null));
        //tail =tail.getNext();
        size++;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//set next ===> make a new node                             get next ==> get the address only 

    @Override
    public int remove() {
                                     //element
        int item = current.getNext().getItem();
        if (current.getNext() == tail) {
            tail = current;
        }
        
        //if we want to delete  from middle range
        current.setNext(current.getNext().getNext());//setNext mean by select the node  and allocate it with current.next.next
        size--;
        return item;
        
        
    }

    @Override
    public void movetoStart() {  //current = head
        current = head;

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movetoEnd() {
        current = tail;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prev() {
//mfesh pervious 2bl el head
        if (current == head) {
            return;
        }

        Node temp = head;
        while (temp.getNext() != current) { //fy far2 lma 2a2ol temp != current 
            //we temp.getText() != current  ==> el node ely b3deyah lma tewsal lel current to2of 
            temp = temp.getNext();
        }
        current = temp; //==>result
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void next() {
        if (current != tail) { //l2n mfesh 7aga b3d el tail
            current = current.getNext();
        }

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int length() {

        return size;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void currpos() {//3ayz 2awsal lel position ely weselo el current 

        Node temp = head; //el (temp)wa2ef 3nd 2owel node 3ndy

        for (int i = 0; temp != current; i++) {
            temp = temp.getNext();
        }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movetopos(int pos) { //beta5od position mo3ayan we betro7 3ando
//0 go to first node 
        //1 go to seond node 

        if (pos < 0 || pos > size) {
            return; //msh h3mel 7aga
        }
        Node temp = head;

        for (int i = 0; i <= pos; i++) {
            temp = temp.getNext();
        }
        current = temp;
        //4       current wa2ef 3nd 7 fa yro7 le 4 ely howa node 5

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getvalue() {

        if (current.getNext() == null) {
            return -1;
        } else {
            return current.getNext().getItem(); //keda ana ro7t le kman 1 node 
            //lo 2olt current.getNext().getNext().getNext() ==> keda ana ro7t kman 3 nodes 
            //y3ny ana fy node 1 we bshof el el value bt3 node 4 
        }

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
