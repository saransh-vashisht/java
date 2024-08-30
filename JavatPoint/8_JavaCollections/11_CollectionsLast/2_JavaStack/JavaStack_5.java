
// Java Stack Size Example 

import java.util.Stack;

public class JavaStack_5 {
    public static void main(String[] args) {
        Stack stk= new Stack<>();
        stk.push(22);
        stk.push(33);
        stk.push(44);
        stk.push(55);
        stk.push(66);
        // Checks if the stack is empty or not 
        boolean rslt=stk.empty();
        System.out.println("Is the Stack empty or not? "+ rslt);
        // Find the size of the Stack
        int x=stk.size();
        System.out.println("The size of the Stack is : "+x);
        
    }
}
