
// Constructor -3 
// Java Parameterized Constructor
/*
 * A constructor which a specific number of parameters is called parametrized constructor 
 * It is used to provide the distinct values to different objects however it can be used to provide the same values also
 * 
 */

// Java Program to demonstrate the use of the parametrized constructor

class Student13{
    int id;
    String name;
    // creating a parametrized constructor 
    Student13(int i,String nString){
        id=i;
        name=nString;
    }

    // method to display the values 
    void display(){
        System.out.println(id+" "+ name);
    }
}
public class JavaOops_13 {
    public static void main(String[] args) {
        // creating object and passing values 
        Student13 s1= new Student13(111, "Saransh");
        Student13 s2= new Student13(222, "Perry");
        // calling methods to display the values of the object 
        s1.display();
        s2.display();
        
    }
}
