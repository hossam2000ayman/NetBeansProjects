package singlelinkedlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Node {   // node consist of 2 parts value and pointer to the next node
    private int item;  //value
    private Node next;  //pointer of the next node
                       //tarama el node ely 3ndy bel pointer hat3araf node tanya yeb2a 2a5aleeh no3oh node

    //create a node with item and next
    public Node(int i,Node n){
        item = i;
        next = n;
    }
    
    //create a node with next only (has no value) (fadya betshawer bs)
    public Node(Node n){
        next = n;
    }
    
    
    
    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node next) {  //23mel function le set value dyat we set value 2arag3ha(23melaha get)
                                      //badal ma 23owd 2anady 3ala getNext
                                      //l2en el tare2a dyat hatwafarlena fy 7agat kteera
                                      //23mel set we fy nafs elwa2t 23mel get
        this.next = next;
        return this.next;  
    }

    

}
