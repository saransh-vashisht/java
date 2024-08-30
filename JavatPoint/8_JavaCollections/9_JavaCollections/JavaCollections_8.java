
// Java Comparable Interface - 1
// Java Comparable Example 

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
int rollno;
String name;
int age;
public Student1(int rollno, String name, int age) {
    this.rollno = rollno;
    this.name = name;
    this.age = age;
}
public int compareTo(Student1 st){
    // // first way to implement the compareTo method
    // if (age==st.age) {
    //     return 0; // zero , if the current object is equal to the specified object
    // } else if(age>st.age) {
    //     return 1; // positive integer , if the current object is greater than the specified object
    // } else{
    //     return -1; //negative integer , if the current object is less than the specified object 
    // }

    // Second way to implement it 
    //return Integer.compare(this.age, st.age);
    // Integer.compare(int x, int y): This method returns:
    // 0 if x == y
    // A negative number if x < y
    // A positive number if x > y

    //third way to implement it 
    return this.age-st.age;
    /*
     * This method subtracts the age of the other student (st.age) from the current student's age (this.age).
     If the result is:
     0: Both ages are the same.
     Positive: The current student is older.
     Negative: The current student is younger.


     Using subtraction works well for integer comparisons but can cause issues with integer overflow when comparing very large numbers. In most practical cases, this is fine, but if you're dealing with large integers, the Integer.compare() method is safer.
     */

     


}
}

public class JavaCollections_8 {
    public static void main(String[] args) {
        ArrayList<Student1> al= new ArrayList<Student1>();
        al.add(new Student1(101, "Virat", 35));
        al.add(new Student1(106, "Rohit", 37));
        al.add(new Student1(105, "Hardik", 29));

        Collections.sort(al);
        for (Student1 st : al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
