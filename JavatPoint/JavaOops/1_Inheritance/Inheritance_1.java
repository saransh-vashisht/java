/**
 * Inheritance_1
 */
// Syntax of java inheritance
// class Subclass-name extends Superclass-name{
//     // methods and fields 
// }

// The extends keyword indicates that you are making a new class that derives from the existing class. 
// The meaning of "Extends" is to increase the functionality

// In the terminology of Java, a class which is inherited is called a parent or superclass , and the new class is called child or subclass

// example of inheritance

class Employee{
    float salary=40000;

}

class Programmer extends Employee{
    int bonus=1000;
}

public class Inheritance_1 {
public static void main(String[] args) {
    Programmer p= new Programmer();
    System.out.println("Programmer salary is: "+ p.salary);
    System.out.println("Bonus of Programmer is: "+ p.bonus);

}
    
}

// In this example Programmer object can access the field of own class as well as of Employee class i.e. code reusability
