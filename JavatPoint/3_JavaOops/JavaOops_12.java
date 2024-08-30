
// Constructor -2
// Default constructor that displays the default values

class Student12{
    int id;
    String name;
    //method to display the value of id and name 
    void display(){
        System.out.println(id+" "+name);

    }
}

public class JavaOops_12 {
    public static void main(String[] args) {
        // creating objects
        Student12 s1= new Student12();
        Student12 s2= new Student12();
        // displaying the value of the object
        s1.display();
        s2.display();
        
    }
}
