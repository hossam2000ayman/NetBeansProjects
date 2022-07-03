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
public class Link {
//double linked list 
    private String name;
    private String phonenumber;
    public Link next;
    public Link previous;

    public Link(String name,String phonenumber) { //call // private
        this.phonenumber = phonenumber;
        this.name = name;
        previous = null;
        next = null;
    }

    public Link(Link previous,String name , String phonenumber, Link next) { //pointer //values
        this.previous = previous;
        this.next = next;
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String Contact() { //important in getvalue
        return "your name is "+name+ "   your phonenumber is "+phonenumber;
    }

}
