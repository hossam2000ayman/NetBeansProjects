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
public class Departement {

    private String department_name;
    private Employee[] employees = new Employee[10];

    private int AddLastIndexOfEmployee = -1;

    public Departement(String departement_name) {
        this.department_name = departement_name;
    }

    /**
     * @return the department_name
     */
    public String getDepartment_name() {
        return department_name;
    }

    /**
     * @param department_name the department_name to set
     */
    public void setDepartment_name(String department_name) {
        this.department_name = this.department_name;
    }

    /**
     * @return the employees
     */
    public void addItem(Employee anEmployee) {
        if (AddLastIndexOfEmployee < employees.length) {
            AddLastIndexOfEmployee++;
            employees[AddLastIndexOfEmployee] = anEmployee;
        }
    }

    public Employee[] getEmployee() {
        Employee[] actualEmployee = new Employee[AddLastIndexOfEmployee + 1];
        for (int i = 0; i < actualEmployee.length; i++) {
            actualEmployee[i] = employees[i];
        }
        return actualEmployee;
    }

    public int getEmployeeCount() {
        return AddLastIndexOfEmployee + 1;
    }

    public Employee getEmployeeByID(int ID) { //search
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getIdentification_number() == (ID)) {
                    return emp;
                }
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i <= AddLastIndexOfEmployee; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        if (AddLastIndexOfEmployee > -1) {
            return getTotalSalary() / getEmployeeCount();
        }
        return 0.0;
    }

    public String toString() {
        return department_name;
    }
}
