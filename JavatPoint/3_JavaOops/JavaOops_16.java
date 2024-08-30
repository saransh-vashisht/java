
// Constructor - 6
// Java Copy Constructor 

// Copying values without constructor 
//  We can copy the values of one object into another by assigning the objects values to another object.
// In this case there is no need to create the constructor

class Student16{
    int id;
    String name;
    Student16(int i, String n){
        id=i;
        name=n;

    }
    Student16(){}
    void display(){
        System.out.println(id+" "+name);

    }
}

public class JavaOops_16 {
    public static void main(String[] args) {
        Student16 s1= new Student16(111,"Karan");
        Student16 s2= new Student16();
        s2.id=s1.id;
        s2.name=s1.name;
        // here we have copied the values without using the copy constructor 
        
        s1.display();
        s2.display();

    }
}
