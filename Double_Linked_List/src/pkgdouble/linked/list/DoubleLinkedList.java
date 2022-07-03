/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdouble.linked.list;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class DoubleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner entry = new Scanner(System.in);

        System.out.println("welcome to our program please enter your name");
        String ui = entry.next();
        System.out.println("nice to meet you " + ui + "now this program is work on make modify on contact name and it's contact number");
        System.out.println("here is instruction of how to use the program as follow by special command "
                + "insert ==> add a new node from front of linked list" + "\n" + "delete ==> remove the next node " + "\n" + "append ==> add new node from behind" + "\n"
                + "initial position ==> move the current to the first node" + "\n" + "final position ==> move the current to the tail" + "\n" + "my position ==> get the current location of current node that user stand on it"
                + "\n" + "get value ==> print the contact name and contact number" + "\n" + "size ==> get the number of index of nodes or storage of linked lists"
                + "\n" + "Is Empty ==> is the linked list is empty node");

        System.out.println("enter your command order");
        String uii = entry.next();
        
       
        switch (uii) {
            
            case "insert":
                System.out.println("enter contact name");
                String name = entry.next();
                System.out.println("enter contact phonenumber");
                String phonenumber = entry.next();
                dll.insert(name, phonenumber);
                dll.getvalue();
        
                break;
        
            case "delete":
                String delete_name = entry.next();
                String delete_phonenumber = entry.next();
                //Link l = new Link(delete_name,delete_phonenumber);
                dll.delete(delete_name, delete_phonenumber);
                System.out.println("the contact successfully deleted");
                dll.getvalue();
  
                break;

            case "append":
                System.out.println("6 contact name");
                String append_name = entry.next();
                System.out.println("enter contact number");
                String append_phonenumber = entry.next();

                dll.append(append_name, append_phonenumber);
                dll.getvalue();
             
                break;
                    
                    
            case "initial position":
                dll.initial_position();
                System.out.print("your position is");
                dll.my_position();
                case"in":
                   

                break;

            case "final position":
                dll.final_position();
                System.out.print("your position is");
                dll.my_position();
               
                    

                break;

            case "my position":

                System.out.println("your position is");
                dll.my_position();
                break;
            case "get value":
                dll.getvalue();
                
                    

                break;

            case "size":

                System.out.println("the size of the array is " + dll.size());
           
                break;
                   
                
                
            case "Is Empty":
                dll.isEmpty();
               
                break;

            default:
                System.out.println("invalid input");
                dll.getvalue();
               System.exit(0);
        
        }
       }
      }
    


