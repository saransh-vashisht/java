
// Java Static - 4
// Java Static Method 
// If you apply static keyword with any method it is known as static method.
// --> Static method belongs to the class rather than the object of a class 
// --> Static method can be invoked w/o the need for creating an instance of a class 
//  --> Static method can access static data member and can change the value of it 

// Example of Static method

// java program to demonstrate the use of a static method 
class Student20{
    int rollno;
    String name;
    static String college="ITS";
    // static method to change the value of static variable 
    static void change(){
        college="BBDIT";

    }
    // Constructor to initialize the variable
    public Student20(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    
    // method to display values
    void display(){ System.out.println(rollno+" "+ name+" "+college);}



    
}

// Test class to create and display the values of object 
public class JavaOops_20 {
    public static void main(String[] args) {
        Student20.change();//calling change method 

        Student20 s1= new Student20(111, "Nobita");
        Student20 s2= new Student20(222, "Gian");
        Student20 s3= new Student20(333, "Suneo");

        // calling display method 
        s1.display();
        s2.display();
        s3.display();
    }
}
