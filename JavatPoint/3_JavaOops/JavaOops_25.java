
// Java This Keyword --> 1
/*There can be a lot of usage of Java this keyword . In java, this is a reference variable that refers to the current object  */
// Java this keyword Usage 

// 1. this: to refer current class instance variable 

/*
 * The this keyword can be used to refer current class instance variable 
 * If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity
 * 
 */


//  Understanding the problem without the this keyword
class Student25{
    int rollno;
    String name;
    float fee;
    Student25(int rollno,String name,float fee){
        rollno=rollno;
        name=name;
        fee=fee;
        // here the parameters(formal arguments) and instance variables are same which is creating the ambiguity 

    }
    void display(){
        System.out.println(rollno+" "+ name+" "+ fee);
    }
}

public class JavaOops_25 {
    public static void main(String[] args) {
        Student25 s1= new Student25(111, "ankit", 5000f);
        Student25 s2= new Student25(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}
