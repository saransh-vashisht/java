
// Java 8 Comparator Example 2
// nullsFirst() and nullsLast() method 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student6{
    int rollno;
    String name;
    int age;
    
    public Student6(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}

public class JavaCollections_13 {
    public static void main(String[] args) {
        ArrayList<Student6> al= new ArrayList<Student6>();
        al.add(new Student6(101, "Virat", 35));
        al.add(new Student6(106, "Rohit", 37));
        al.add(new Student6(105, null, 32));
        Comparator<Student6> cm1= Comparator.comparing(Student6::getName,Comparator.nullsFirst(String::compareTo));
        Collections.sort(al,cm1);
        System.out.println("Considers null to be less than not-null");
        for (Student6 st : al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        // nullsLast method
        Comparator<Student6> cm2= Comparator.comparing(Student6::getName,Comparator.nullsLast(String::compareTo));
        Collections.sort(al,cm2);
        System.out.println("Considers null to be greater than non-null");
        for (Student6 st : al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }


    }
}
