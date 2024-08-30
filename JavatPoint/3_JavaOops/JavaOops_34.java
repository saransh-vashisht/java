
// Java This Keyword --> 10
// this keyword can be used to return current class instance 

// We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive)

// Syntax of this that can be returned as a statement

/*
return_type method_name(){
 return this;
}

 */

// Example of this keyword that you return as a statement from the method 
class Oops_34{
    Oops_34 getOops_34(){
        return this;
    }

    void msg(){System.out.println("Hello Java");}

}
public class JavaOops_34 {
    public static void main(String[] args) {
        // Method CHaining
        new Oops_34().getOops_34().msg();

        // new Oops_34() : Creates a new instance of Oops_34.
        //   .getOops_34() : Calls the getOops_34() method on the newly created instance. This method returns the same instance ('this') , so you still have access to the instance of Oops_34.
        // .msg() --> Calls the msg() method on the returned instance. Since getOops_34() returned the same instance, the msg() method is called on it , which prints "Hello Java".
    } 
}
