
// Java Comparator Example - 1
// Java Comparator Example (Non - generic)

import java.util.*;

class Student3{
    int rollno;
    String name;
    int age;
    public Student3(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    
}


class AgeComparator implements Comparator{
public int compare(Object o1,Object o2){
    Student3 s1=(Student3) o1;
    Student3 s2= (Student3) o2;

    // return s1.age-s2.age;
    if (s1.age==s2.age) {
        return 0;
    } else if(s1.age>s2.age) {
        return 1;
    } else{
        return -1;
    }
}
}

class NameComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Student3 s1=(Student3) o1;
        Student3 s2=(Student3) o2;

        return s1.name.compareTo(s2.name);
    }
}


public class JavaCollections_10 {
    public static void main(String[] args) {
       ArrayList al = new ArrayList();
       al.add(new Student3(101, "Virat", 35));
       al.add(new Student3(106, "Rohit", 37));
       al.add(new Student3(105, "Hardik", 29));

       System.out.println("Sorting by Name");

       Collections.sort(al, new NameComparator());

       Iterator itr= al.iterator();
       while (itr.hasNext()) {
        Student3 st = (Student3) itr.next();
        System.out.println(st.rollno+" "+st.name+" "+st.age); 
        
       }

       System.out.println("Sorting by age");

       Collections.sort(al, new AgeComparator());
       Iterator itr2=al.iterator();
       while (itr2.hasNext()) {
        Student3 st=(Student3)itr2.next();
        System.out.println(st.rollno+" "+st.name+" "+st.age);
       }
    }
}
