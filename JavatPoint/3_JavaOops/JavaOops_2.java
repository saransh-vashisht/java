
// Object and Class Example --> 2
// Main outside the class

// In real time development we create classes and use it from another class . It is a better approach than using only one class 
//  We can have multiple classes in different java files or single java file 
// If you define multiple classes in a single java source file it is a good idea to save the file name with the class name which has main() method 



// Java Program to demonstrate having the main method in another class


// Creating Student class
class Student{
    int id; String name;
}



// Creating another class TestStudent1 which contains the main method
public class JavaOops_2 {
    public static void main(String[] args) {
        Student s1= new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
        
    }
}
