
// Java Comparable vs Comparator
// Java Comparator Example 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student8{
    int rollno;
    String name;
    int age;
    public Student8(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    
}

class AgeComparator5 implements Comparator<Student8>{
    public int compare(Student8 s1,Student8 s2){
        return s1.age-s2.age;
    }
}

class NameComparator5 implements Comparator<Student8>{
    public int compare(Student8 s1,Student8 s2){
        return s1.name.compareTo(s2.name);
    }
}

// Java Program to demonstrate the use of Java Comparator 
public class JavaCollections_15 {
    public static void main(String[] args) {
        // Creating a list of students
        ArrayList<Student8> al= new ArrayList<Student8>();
        al.add(new Student8(101, "Virat", 35));
        al.add(new Student8(106, "Rohit", 37));
        al.add(new Student8(105, "Suryakumar", 32));

        System.out.println("Sorting by Name");
        // Using NameComparator to sort the elements
        Collections.sort(al, new NameComparator5());
        // Traversing the list of elements
        for (Student8 st : al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("Sorting by Age");
        // Using AgeComparator to sort the elements 
        Collections.sort(al, new AgeComparator5());
        // Traversing the list again 
        for (Student8 st : al) {
            System.out.println(st.rollno+" "+ st.name+" "+st.age);
        }
    }
}
