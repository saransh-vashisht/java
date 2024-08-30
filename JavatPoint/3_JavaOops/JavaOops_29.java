
// Java This Keyword --> 5

// This(): to invoke the current class constructor 

/* 
 * The this() constructor call can be used to invoke the current class constructor 
 * It is used to reuse the constructor . It is used for constructor chaining
 * 
 * Calling default constructor from parametrized constructor
 */

 class Oops_29{
    // Default constructor 
    Oops_29(){System.out.println("hello world");}

    // Parametrized constructor 
    Oops_29(int x){
        this(); // calls the default constructor 
        System.out.println(x);

    }
 }

public class JavaOops_29 {
    public static void main(String[] args) {
        // creates and instance of Oops_29 using the parametrized constructor 
        
        Oops_29 aOops_29= new Oops_29(10);
    }
}
