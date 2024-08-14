
/*
 * Can we execute a program w/o main() method?
 * No, one of the ways was the static block ,but it was possible till JDK 1.6. Since JDK 1.7,it is not possible to execute a Java class w/o the main method 
 * 
 */


public class JavaOops_24 {
    static{
        System.out.println("static block is invoked");
        System.exit(0);
        
    }
}
