
// Java Comparator Example - 2
// Java Comparator Example (Generic)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student4{
    int rollno;
    String name;
    int age;
    public Student4(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    
}

class AgeComparator1 implements Comparator<Student4>{
public int compare(Student4 s1, Student4 s2){
    return s1.age-s2.age;
}
}

class NameComparator1 implements Comparator<Student4>{
    public int compare(Student4 s1,Student4 s2){
        return s1.name.compareTo(s2.name);
    }
}




public class JavaCollections_11 {
    public static void main(String[] args) {
        ArrayList<Student4> al= new ArrayList<Student4>();

        al.add(new Student4(101, "Virat", 35));
        al.add(new Student4(106, "Rohit", 37));
        al.add(new Student4(105, "Suryakumar", 32));

        System.out.println("Sorting by name");

        Collections.sort(al,new NameComparator1());
        
        for (Student4 st : al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);

        }

        System.out.println("Sorting by age");
        Collections.sort(al, new AgeComparator1());

        for (Student4 st : al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}
