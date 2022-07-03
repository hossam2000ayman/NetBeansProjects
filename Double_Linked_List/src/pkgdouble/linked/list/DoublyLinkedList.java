/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdouble.linked.list;

/**
 *
 * @author hp
 */
public class DoublyLinkedList {

    private Link head;
    private Link current;
    private Link tail;
    private int size;

    public DoublyLinkedList() { 
        head = null;//initial
        size = 0;
    }

    public boolean isEmpty() {
        return head == null; //true(is empty) , false (not )
    }

    public void insert(String name , String phonenumber) {
        if (head == null) {//create new head
            head = new Link(null,name , phonenumber, null);
        } else {                 //prev //name //phonenumber  //next
            Link newLink = new Link(null,name , phonenumber, head);
            head.previous = newLink;
            head = newLink;
        }
        size++; //increment size linked list (strorage inc.)
    }

    public void append(String name , String phonenumber) {
        if (head == null) {
            head = new Link(null,name , phonenumber, null);
        } else {
            Link current = head;
            while (current.next != null) { //tail
                current = current.next;
            }                   //prev
            Link newLink = new Link(current,name , phonenumber, null);
           current.next = newLink;
        }
     
    }
    public void clear(){// cut the head  rest of node  refer to null 
        head.next = null;
        size = 0;
        current= tail = head = new Link(null,"","",null);
    }
    
    public void initial_position(){
        current = head; //first node
    }
    
    public void final_position(){
        current = tail; //final node
    }
   
    public void my_position(){
        Link searcher = head;
        for(int i=0;searcher!=current;i++){
            searcher = searcher.next;
        }
    }
    
    public void move_to_position(int pos){
        if((pos<0)||(pos>size)){ //if the position selected is outside the range 
            return; //do nothing
        }
        Link transfer = head;
        for(int i=0;i<=pos;i++){
            transfer = transfer.next;
        }
        current = transfer;
    }
    
    public void next(){
        if(current!=tail){
            current = current.next;
        }
    }   
    public void prev(){
           if(current!=head){
               current = current.previous;
           }
    }   
    
    public String delete(String name , String phonenumber){
        String n = current.next.Contact();
        String p = current.next.Contact();
        if(current.next==tail){
            tail = current;
        }
      current.next = current.next.next;
        size--;
        return "delete name : "+n+" "+"with phone number is : "+p;
    }

    public int size() {
        return size;
    }

    public void getvalue() {
        Link current = head;
        while (current != null) {
            System.out.println(current.Contact()+" ");
            current = current.next;
        }
    }
}

