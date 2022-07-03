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
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HR App Starts ");

        Employee e1 = new Employee(190417, "Thomus", 3000.0);
        Employee e2 = new Employee(184521, "Carlos", 7000.0);

        Departement dept = new Departement("Education");

        dept.addItem(e1);
        dept.addItem(e2);
        dept.addItem(new Employee(20120 , "Jack",2998.0));

        Employee[] emps = dept.getEmployee();

        for (Employee emp : emps) {

            System.out.println("Emp , " + emp);

        }

        System.out.println("Total :"+dept.getTotalSalary());
        System.out.println("Average : "+dept.getAverageSalary());
        
        System.out.println("Employee searched is "+dept.getEmployeeByID(190417));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        int hos = 3;
        
        switch(hos){
            case 3: case4: case5:
                //System.out.println("3");
          
                System.out.println("6");
                
            case 9:
                System.out.println("9");
                break;
            default:
                System.out.println("X");
        }
    }

}
