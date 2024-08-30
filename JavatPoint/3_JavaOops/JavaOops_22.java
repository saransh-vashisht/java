
// Java static --> 6
// Java Static method 

// Restriction for the static method 
// 1. The static method cannot use the non static data member or call non static methods directly 
// 2. this and super cannot be used in the static context 

class Axs{
    // int a=20;//non static
   

}


public class JavaOops_22 {
    public static void main(String[] args) {
        System.out.println(a);
        // it will give us the compile time error

    }
}

/*
 * Why is the Java main method static? 
 * 
 * It is because the object is not required to call a static method . If it were a non - static method,JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
 * 
 */
