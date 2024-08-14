
// Object and Class Example --> 3

// 3 Ways to initialize the object
//  By reference variable 
//  By method
//  By constructor 


// Object and class example :Initialization through reference variable 

// Initializing an object means storing data into the object 

class Student3{
    int id;
    String name;
}


public class JavaOops_3 {
    public static void main(String[] args) {
        Student3 s1= new Student3();
        s1.id=101;
        s1.name= "Suneo";
        System.out.println(s1.id+ " "+ s1.name); //printing members with a white space 
        
    }
}
