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
public interface LIST { //make interface for repeat it in more than linked list so making double linked list but we make single linked lit in this example
    public void clear();
    public void insert( int item);
    public void append(int item);
    public void next();
    public void prev();
    public int remove();
    public void movetostart();
    public void movetoend();
    public void currpos(int pos);
    public int lenght();
    public void movetopos(int pos);
    public int getvalue();
}
