
// Comparator vs Comparable 
// Java Comparable Example 

// Java Program to demonstrate th use of comparable interface.
// Creating a class which implements Comparable interface

import java.util.ArrayList;
import java.util.Collections;

class Student7 implements Comparable<Student7>{
    int rollno;
    String name;
    int age;
    public Student7(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    
    public int compareTo(Student7 st){
        return this.age-st.age;
    }

}

// Creating a test class to sort the elements
public class JavaCollections_14 {
    public static void main(String[] args) {
        ArrayList<Student7> al = new ArrayList<Student7>();
        al.add(new Student7(101, "Virat", 35));
        al.add(new Student7(106, "Rohit", 37));
        al.add(new Student7(105, "Suryakumar", 32));

        Collections.sort(al);
        for (Student7 st : al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
