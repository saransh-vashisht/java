
// Constructor -4 
// Constructor overloading in Java

// A constructor in java is just like a method but without a return type . It can also be overloaded like java methods. 


// Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task . They are differentiated by the compiler by the number of parameters in the list and their types 

// Java Program to overload constructors

class Student14{
    int id;
    String name;
    int age;
    // Creating two arg constructors
    Student14(int i, String n){
        id=i;
        name=n;

    }

    // Creating three arg constructors 
    Student14(int i,String n, int a){
        id=i;
        name=n;
        age=a;

    }
    // so now we have two constructors through which we can initialize our object
    

    void display(){
        System.out.println(id+" "+name+" "+ age);

    }
}

public class JavaOops_14 {
    public static void main(String[] args) {
        Student14 s1= new Student14(111, "Karan");
        Student14 s2= new Student14(222, "Aryan", 25);
        s1.display();
        s2.display();   
    }
}
