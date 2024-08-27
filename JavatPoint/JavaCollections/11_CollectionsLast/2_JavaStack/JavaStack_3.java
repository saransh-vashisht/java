
// Java Stack Peek Method Example 

import java.util.Stack;

public class JavaStack_3 {
    public static void main(String[] args) {
    Stack<String> stk= new Stack<>();
    // pushing element into Stack 
    stk.push("Apple");
    stk.push("Grapes");
    stk.push("Mango");
    stk.push("Orange");
    System.out.println("Stack: "+stk); 
    // Access element from the top of the stack
    String fruits=stk.peek();
    // prints stack
    System.out.println("Element at top: "+ fruits);
    
    }
}
