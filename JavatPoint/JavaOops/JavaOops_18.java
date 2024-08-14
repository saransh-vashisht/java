
// Java Static Keyword --> 2

// Program of the counter w/o static variable 

/**
In simple terms, imagine you're in a classroom where every student gets their own notebook when they arrive. Each time a new student enters, they write the number "1" in their notebook to show that they are present.

Now, if five students enter the classroom, each of them will have their own notebook, and each notebook will have the number "1" written in it. Even though five students have entered, each student’s notebook only shows the number "1" because they’re only keeping track of their own presence.

This is similar to how instance variables work in programming. Every time you create a new object (like each student), the object gets its own separate copy of the variable (like the notebook). When you increase the count for one object, it doesn’t affect the count for any other object. So, each object’s count will be "1," just like each student's notebook shows "1."

In contrast, if you wanted all students to keep track of the total number of students in the classroom, you’d need a shared notebook (like a static variable) that everyone updates together.
*/


// Java Program to demonstrate use of an instance variable which gets memory each time when we create an object of the class
class Counter{
    int count=0;//will get memory each time when the instance is created 
    Counter(){
        count++; //incrementing value 
        System.out.println(count);

    }
}

public class JavaOops_18 {
    public static void main(String[] args) {
        // Creating objects 
        Counter c1= new Counter();
        // each object creation will create a new copy of count and then will increment it from 0 to 1 thus showing one in each object creation
        Counter c2= new Counter();
        Counter c3= new Counter();
        // Output 
        // 1 1 1
    }
}

// So, when using instance variables, each object has its own memory space for those variables, and they’re only allocated when the object is created. On the other hand, static variables have a single memory space shared by all instances, and they’re allocated when the class is first used.