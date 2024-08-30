
// User-Defined class objects in Java ArrayList

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollno;
    String name;
    int age;
    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    
}

public class ArrayList_7 {
    public static void main(String[] args) {
        // Creating user -defined class objects
        Student s1= new Student(101, "Boa", 23);
        Student s2= new Student(102, "Robin", 21);
        Student s3= new Student(103, "Nami", 25);

        // Creating arrayList

        ArrayList<Student> al= new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        // Getting iterator
        Iterator itr= al.iterator();

        // Traversing elements of ArrayList object
        while (itr.hasNext()) {
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
            
        }

    }
}
