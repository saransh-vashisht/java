
// Constructor -5
// Java Copy Constructor 
// Java do not have copy constructor however we can copy values from one object to another like copy constructor in C++
// Ways by which we can copy the values of one object into another in Java are:
// 1. By constructor
// 2. By assigning the values of one object into another 
//  3. By clone() method of Object class


// Example to copy the values of one object into another using Java constructor 
// Java Program to initialize the values from one object to another object

class Student15{
    int id;
    String name;
    // constructor to initialize integer and string 
   Student15(int i,String n){
    id=i;
    name=n;
   }
//    constructor to initialize another object 
   Student15(Student15 s){
    id=s.id;
    name=s.name;
   }

   void display(){System.out.println(id+" "+ name);}

}


public class JavaOops_15 {
    public static void main(String[] args) {
        Student15 s1= new Student15(111, "Karan");
        Student15 s2= new Student15(s1);
        // so here we have copied the values of s1 into s2 by making a copy constructor
        
        s1.display();
        s2.display();
    }
}
