
// Java This Keyword --> 6
// Calling parameterized constructor from default constructor 

class Oops_29{
 Oops_29(){
    this(5);
    // here we have called the parametrized constructor from the default constructor
    
    System.out.println("Hello Konoha");

 }

 Oops_29(int x){
    System.out.println(x);

 }
}

public class JavaOops_30 {
    public static void main(String[] args) {
        Oops_29 a= new Oops_29();
    }
}
