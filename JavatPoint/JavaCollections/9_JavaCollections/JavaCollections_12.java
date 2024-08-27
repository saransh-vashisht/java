
// Java 8 Comparator Example 
// 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student5{
    int rollno;
    String name;
    int age;

    public Student5(int rollno, String name, int age) {
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

public class JavaCollections_12 {
    public static void main(String[] args) {
        ArrayList<Student5> al= new ArrayList<Student5>();
        al.add(new Student5(101, "Virat", 35));
        al.add(new Student5(106, "Rohit", 37));
        al.add(new Student5(105, "SuryaKumar", 32));


        // Sorting elements on the basis of name 
        Comparator<Student5> cm1= Comparator.comparing(Student5::getName);
        Collections.sort(al,cm1);
        System.out.println("Sorting by Name");
        for (Student5 st : al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        // Sorting elements on the basis of age 
        Comparator<Student5> cm2= Comparator.comparing(Student5::getAge);

        Collections.sort(al,cm2);
        System.out.println("Sorting by Age");
        for (Student5 st : al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
