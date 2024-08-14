
// Java Static Keyword --> 3
// Program of counter with static variable 
// THe static variable will get memory only once and if any object changes the value of the static variable it will retain the value 


// Java Program to illustrate the use of static variable which is shared with all objects 
class Counter2{
    static int count =0; //will get memory only once and retain its value 
    Counter2(){
        count++;
        //incrementing the value of the static variable 
        System.out.println(count);

    }
}

public class JavaOops_19 {
    public static void main(String[] args) {
        // creating objects 
        Counter2 c1= new Counter2();
        Counter2 c2= new Counter2();
        Counter2 c3= new Counter2();
        Counter2 c4= new Counter2();
    }
}
