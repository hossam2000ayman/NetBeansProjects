/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_object;

/**
 *
 * @author hp
 */
public class Stack_Object {
                                      //name     //phonenumber
    public static Stack createDuplicate(Stack a,Stack b){
                                     //size
        Stack resultStack = new Stack(50);
        while(!b.Isempty()){
            int val = (Integer)b.pop(); //convert from object to integer
            String name = (String)a.pop(); //convert from object to String
            for(int i=1;i<=val;i++){ //for the first stack to the last stack add variable name(String)
                
                //   1  2  3  4  5  6  7  8  9 ...
                //  "" ""  "" "" "" "" "" "" ""
                
               resultStack.push(name);
            }
        }
        return resultStack;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack s = new Stack(3);
        s.push(1);
        s.push(2);
        s.push(3);
        
        
        Stack a = new Stack(3);
       
        a.push("omar");
        a.push("mahmoud");
        a.push("serag");
        
        
        Stack r = createDuplicate(a,s);
        while(!r.Isempty()){
            System.out.println(r.pop());
        }
    }
    
    //error
    //??
    
}
