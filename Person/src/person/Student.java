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
public class Student extends Person {
    private int student_number;
    public Student(String newName , int sn){
        super(newName);
        this.student_number = sn;
    }

    /**
     * @return the student_number
     */
    public int getStudent_number() {
        return student_number;
    }

    /**
     * @param student_number the student_number to set
     */
    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }
    @Override
    public String toString(){
        return "the name is"+super.getName()+"/n"+"student number is"+student_number;
    }
    
    public boolean equals(Object otherobject){
        return ((Student) otherobject).getStudent_number()==student_number;
    }
}
