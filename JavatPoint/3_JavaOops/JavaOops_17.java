
// Java Static Keyword --> 1

/*
 * The static keyword in java is used for memory management mainly .
 * We can use it with variables(also known as a class variable ),methods(class method) ,block and nested classes
 * Static keyword belongs to a class then an instance of the class 
 * 
 */


/*
 * Java Static Variable 
 * If we declare any variable as static it is known as a static variable 
 * It is used to refer to the common property of all objects i.e. which is not unique for each object 
 * Example - the company name of employees ,college name of students 
 * Static variable gets memory only once in the class area at the time of class loading 
 * 
 * 
 * Static Variable makes your program memory efficient 
 * 
 * Understanding the problem w/o static variable 
 * class Student{
 * int rollno;
 * String name;
 * String college="ITS";
 * 
 * }
 * 
 * It will be beneficial to make the string college static as it will be repeated same in every student
 * Thus we will get the memory only once for it in static and will be shared by all the objects 
 */


//  Example of static variable 
// Java program to demonstrate the use of static variable

class Student17{
    int rollno; //instance variable 
    String name;
    static String college = "ITS"; //static variable 
    //constructor 
    Student17(int r,String n){
        rollno =r;
        name = n;

    }

    // method to display the values 
    void display(){
        System.out.println(rollno+" "+name+" "+college);

    }


}

// Test class to show the values of the objects

public class JavaOops_17 {
    public static void main(String[] args) {
        Student17 s1= new Student17(111, "Karan");
        Student17 s2= new Student17(222, "Aryan");
        s1.display();
        s2.display();
        // we can change the college of all object by the single line 
        Student17.college="BBDIT";
        s1.display();
        s2.display();
        

    }
}
