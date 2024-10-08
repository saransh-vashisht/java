
// Stack Push Pop Example

import java.util.EmptyStackException;
import java.util.Stack;

public class JavaStack_2 {

    // Performing push operation
    static void pushelmnt(Stack stk,int x){
        // invoking push() method
        stk.push(new Integer(x));
        System.out.println("push -> "+ x);
        // prints modified stack
        System.out.println("stack: "+ stk);

    }

    // Performing pop operation 
    static void popelmnt(Stack stk){
        System.out.print("pop-> ");
        // invoking pop method
        Integer x=(Integer)stk.pop();
        System.out.println(x);
        // Prints modified stack
        System.out.println("stack: "+ stk);
    }

    public static void main(String[] args) {
        // Creating an object of Stack class 
        Stack<Integer> stk= new Stack<Integer>();
        System.out.println("Stack: "+stk);

        // Pushing elements into the stack 
        pushelmnt(stk,20);
        pushelmnt(stk, 13);
        pushelmnt(stk, 89); 
        pushelmnt(stk, 90);
        pushelmnt(stk, 11);
        pushelmnt(stk, 45);
        pushelmnt(stk, 18);

        // popping elements from the stack
        popelmnt(stk);
        popelmnt(stk);

        // throws exception if the stack is empty
        try {
            popelmnt(stk);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }

    }
}
