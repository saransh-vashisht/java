// Object and Class Example  --> 1
// Main within the class



/**
 * JavaOops_1
 * Java Program to illustrate ho to define a class and fields
 * Defining a Student class
 */
public class JavaOops_1 {

    // Defining fields
    int id; //field or data member or instance variable
    String name;
    // Creating main method inside the Student class


    public static void main(String[] args) {
        // Creating an object or instance
        JavaOops_1 s1= new JavaOops_1(); //creating an object of student
        System.out.println(s1.id);
        // accessing member through refrence variable 
        System.out.println(s1.name);

    }
}
