
// Java Stack Search Method Example 

import java.util.Stack;

public class JavaStack_4 {
    public static void main(String[] args) {
        Stack<String> stk= new Stack<>();
        // Pushing elements into Stack
        stk.push("Mac Book");
        stk.push("HP");
        stk.push("DELL");
        stk.push("Asus");
        System.out.println("Stack: "+ stk);
        // Search an element 
        int location = stk.search("HP");
        System.out.println("Location of HP: "+ location);


    }
}
