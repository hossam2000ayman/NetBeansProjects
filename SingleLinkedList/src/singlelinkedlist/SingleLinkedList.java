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
public class SingleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                    //size   //for the constructor of constructor
        SLL s = new SLL(6);
        s.insert(1);  //0
        s.insert(2);   //1
        s.insert(3);//2
        s.insert(4);//3
        s.insert(5);//4                 //0 1 2 3 4 5   ------------------------->  //6 - 0
        s.insert(6);//5                // 1,2,3,4,5,6                               //5 - 1
        s.movetopos(4);                                                             //4 - 2
        s.remove();                                                                 //3 - 3
      System.out.println("the length of single linked list is equal "+s.length());               //2 - 4  (removed)                                          //2 - 4
        s.movetoStart();                                                            //1 - 5
        for (int i=0;i<s.length();i++){
        System.out.println("the items of whole linked list is "+"\n"+s.getvalue());
        s.next(); //and then go to next node
    }
    }    
    }
    

