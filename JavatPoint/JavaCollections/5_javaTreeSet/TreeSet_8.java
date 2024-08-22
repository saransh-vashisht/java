
// ClassCast Exception in TreeSet
/* 
 * If we add an object of the class that is not
 * implementing the Comparable interface, the 
 * ClassCast Exception is raised. 
 */

//  Import important statements

import java.util.TreeSet;

class Employee{
    int empId;
    String name;

    // getting the name of the employee
    public String getName() {
        return name;
    }

    // Setting the name of the employee
    public void setName(String name) {
        this.name = name;
    }

    // Setting the employee id of the employee
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Retrieving the employee id of the employee
    public int getEmpId() {
        return empId;
    }
   
 }

public class TreeSet_8 {
    // main method
    public static void main(String[] args) {
        // Creating objects of the class Employee
        Employee obj1= new Employee();
        Employee obj2= new Employee();

        TreeSet<Employee> ts= new TreeSet<Employee>();

        // adding the employee objects to the TreeSet class
        ts.add(obj1);
        ts.add(obj2);

        System.out.println("The Program has been executed successfully.");
    }
}
