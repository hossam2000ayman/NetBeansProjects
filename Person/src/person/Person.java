/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author hp
 */
public class Person {

    private String name;
    public Person(String n){
        name = n;
    }
    @Override
    public String toString(){
        return "the name is "+name;
    }
    
    public boolean samename(Person otherperson){
        if(this.name.equals(otherperson.getName())) {
            return true;
        }
        return this.name.equals(otherperson.getName());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student("ahmed",1234);
        Student s2 = new Student("mohamed",1234);
        System.out.println(s1.samename(s2));
        System.out.println(s1.equals(s2));
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
