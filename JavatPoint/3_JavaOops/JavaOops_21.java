
// Java Static --> 5
// Java Static Method 

// Another Example of a static method that performs a normal calculation 

// Java Program to get the cube of a given number using the static method 

class Calculate{
    static int cube(int x){
        return x*x*x;
    }
}
// Here we have called the static method w/o even initializing the object thus it helps w/o any need for initializing the objects of the class


public class JavaOops_21 {
    public static void main(String[] args) {
        int result=Calculate.cube(5);
        System.out.println(result);

    }
}
