
// Java Static -->7

// Java Static Block
/*
 * It is used to initialize the static data member 
 * It is executed before the main method at the time of class loading 
 * 
 */

//  Example of static block

public class JavaOops_23 {
    static{System.out.println("static block is involved");}
    public static void main(String[] args) {
        System.out.println("Hello main");
        // it is here executed before the main method and without initializing any object
    }
}
