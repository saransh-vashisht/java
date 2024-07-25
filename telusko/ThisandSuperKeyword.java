

// every class in java extends to the object class and they have different methods too 
// so when we say super in A we are basically calling a constructor of object class
// here multiple inheritence is happening
class A{
    public char[] marks;
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }

}

class B extends A{
    public B(){
        super();
        // super(5);
        // above can be used to call both the default constructor of B and the parametrized constructor of A
        System.out.println("in B");
    }
    public B(int n){
        this();
        //if we use the this method it will execute the constructor for the same class so our default constructor and the parametrized one will be executed
        // super(n);
        // super means the call the constructor of the super class the default one that is present...
        //if we want to call the parametrized constructor of parent i.e A then we will pass the variable with it and specifically type super i.e. explicitly mentioning it there

        System.out.println("in B int");
    }
}

// every constructor in java has a method and that method is super()
// even if you don't mention it is there thus super will be called everywhere


public class ThisandSuperKeyword {
    public static void main(String[] args) {
        B obj= new B(5);
        
    }
}
