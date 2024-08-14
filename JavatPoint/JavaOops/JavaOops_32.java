
// Java This Keyword --> 8
// this: to pass as an argument in the method

// The this keyword can also be passed as an argument in the method . It is mainly used in the event handling

class Oops_32{
    // method m takes an object of type S2 as a parameter
    void m(Oops_32 obj){
        System.out.println("method is invoked ");

    }

    //Method p calls method m with the current instance(this) as an argument 
    void p(){
        m(this);
        // this method calls the method m and passes this as an argument

        // this refers to the current instance of the class(i.e. the object on which the method p is invoked)
        // so when p() is called it effectively becomes m(this) where this is the instance of oops_32 that invoked p()
    }
}
public class JavaOops_32 {
    public static void main(String[] args) {
        // Create an instance of the S2 class
        Oops_32 s1= new Oops_32();

        // Call method p on the instance s1
        s1.p();
    }
}


/* Application
 *  In event handling (or) in a situation where we have to provide the reference of a class to another one . It is used to reuse the one object in many methods
 * 
 */
