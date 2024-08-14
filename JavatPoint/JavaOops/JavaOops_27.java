
// Java This keyword -->3
/*
 * If the local variable(formal argument) and instance variables are different , there is no need to use this keyword in the following program
 * 
 * Program where this keyword is not required 
 */

 class Student27{
    int rollno;
    String name;
    float fee;
    Student27(int r,String n,float f){
        rollno=r;
        name=n;
        fee=f;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}

 }

public class JavaOops_27 {
    public static void main(String[] args) {
       Student27 s1= new Student27(111, "ankit", 5000f);
       Student27 s2= new Student27(112, "sumit", 6000f);
       s1.display();
       s2.display(); 
    }
}

/*
 * It is better approach to use meaningful names for variables. So we use same name for instance variables and parameters in real time, and always use this keyword.

 */
