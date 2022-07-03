/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;

/**
 *
 * @author hp
 */
public class Employee {
 
    private int ID;
    private String name;
    private double salary;

    public Employee(int ID , String name , double salary){
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
    /**
     * @return the identification_number
     */
    public int getIdentification_number() {
        return ID;
    }

    /**
     * @param ID the identification_number to set
     */
    public void setIdentification_number(int ID) {
        this.ID = ID;
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

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    @Override
    public String toString(){
        return "name :"+getName()+"  identification_number :"+getIdentification_number()+"  salary : "+getSalary(); 
    }
    
}
