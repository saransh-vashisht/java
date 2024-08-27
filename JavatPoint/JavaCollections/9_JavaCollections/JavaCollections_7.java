
// Sorting in Collections
// Example to sort user defined class objects

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    public String name;

    public Student(String name) {
        this.name = name;
    }
    
    public int compareTo(Student person){
        return name.compareTo(person.name);
    }
}

public class JavaCollections_7 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("Saransh"));
        al.add(new Student("Sachin"));
        al.add(new Student("Gautam"));
        al.add(new Student("Ishan"));

        Collections.sort(al);
        for (Student student : al) {
            System.out.println(student.name);
        }
    }
}
