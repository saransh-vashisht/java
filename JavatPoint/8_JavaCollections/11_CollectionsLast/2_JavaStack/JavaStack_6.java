
// Java Stack Iteration Example 
// using the iterator method 

import java.util.Iterator;
import java.util.Stack;

public class JavaStack_6 {
    public static void main(String[] args) {
        // Creating an object of Stack class
        Stack<String> stk= new Stack<>();
        // pushing elements into stack
        stk.push("BMW");
        stk.push("Audi");
        stk.push("Ferrari");
        stk.push("Bugatti");
        stk.push("Jaguar");

        // Iteration over the stack 
        Iterator itr= stk.iterator();
        while (itr.hasNext()) {
            Object values=itr.next();
            System.out.println(values);

        }
    }
}
