
// Java This() Keyword --> 7

/*
 * Real Usage of this() constructor call
 *  
 * The this() constructor call should be used to reuse the constructor from the constructor.
 * It maintains the chain b/w the constructors i.e. it is used for constructor chaining
 * 
 */

//  Actual use of this keyword

class Student31{
    int rollno;
    String name,course;
    float fee;
    public Student31(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
       
    }
    Student31(int rollno,String name,String course,float fee){
        this(rollno, name, course);
        // call to this must be the first statement in the constructor
        // if it is not the first statement then it will give us the compile time error
        
        this.fee=fee;
    }

    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}

    
}

public class JavaOops_31 {
    public static void main(String[] args) {
        Student31 s1= new Student31(111, "Sara", "java");
        Student31 s2= new Student31(112,"Ansh","java",6000f);
        s1.display();
        s2.display();

    }
}
