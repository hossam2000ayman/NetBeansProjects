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
public interface List {

    public void clear();

    public void insert(int item);
    //add a specific position in list (fy el2awel))

    public void append(int item);
    //add the end of list  (ro7 2elza2 el 3onsor fy el 2a5er)

    public int remove(); //3alashan 23raf eh el 3onsor ely hayetemsa7o

    public void movetoStart();  //2o2of 3nd el head 

    public void movetoEnd();   //ha2of 3nd el tail 2o hat7arak leha 

    public void prev();

    public void next();

    public int length();

    public void currpos();

    public void movetopos(int pos);   //0   1    3    4   7

    public int getvalue();
     
    
}
