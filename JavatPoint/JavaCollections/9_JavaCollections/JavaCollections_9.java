
// Java Comparable example - 2
// Java Comparable Example : reverse order

import java.util.ArrayList;
import java.util.Collections;

class Student2 implements Comparable<Student2>{
int rollno;
String name;
int age;
public Student2(int rollno, String name, int age) {
    this.rollno = rollno;
    this.name = name;
    this.age = age;
}

public int compareTo(Student2 st){
    // if (this.age==st.age) {
    //     return 0;
    // } else if(this.age<st.age){
    //     return 1;
    // } else{
    //     return -1;
    // }

    return st.age-this.age;
}
}

public class JavaCollections_9 {
    public static void main(String[] args) {
        ArrayList<Student2> al = new ArrayList<Student2>();
        al.add(new Student2(101, "Virat", 35));
        al.add(new Student2(106, "Rohit", 37));
        al.add(new Student2(105, "Hardik", 29));

        Collections.sort(al);
        for (Student2 st : al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
