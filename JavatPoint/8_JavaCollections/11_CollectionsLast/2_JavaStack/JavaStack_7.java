
// Stack Iteration Example 2
// Using foreach()

import java.util.Stack;

public class JavaStack_7 {
    public static void main(String[] args) {
        // Creating an instance of Stack class 
        Stack<Integer> stk = new Stack<>();

        // pushing elements into stack 
        stk.push(119);
        stk.push(203);
        stk.push(988);
        System.out.println("Iteration over the stack using forEach() Method:  ");
        // Invoking forEach() method for iteration over the stack
        stk.forEach(n-> System.out.println(n));

        stk.forEach(System.out::println);
        // Above both are same
    }
}
