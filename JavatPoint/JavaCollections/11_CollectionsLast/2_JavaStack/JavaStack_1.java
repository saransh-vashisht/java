import java.util.Stack;

/**
 * JavaStack_1
 * Stack Empty Method Example
 */

public class JavaStack_1 {
public static void main(String[] args) {
    // Creating an instance of Stack class
    Stack<Integer> stk= new Stack<>();
    // Checking stack is empty or not 
    boolean result =stk.empty();
    System.out.println("Is the stack empty? "+result);

    // pushing elements into stack 
    stk.push(78);
    stk.push(113);
    stk.push(90);
    stk.push(120);

    // Prints elements of the stack 
    System.out.println("Elements in Stack: "+ stk);
    result=stk.empty();
    System.out.println("Is the stack empty? "+ result);
    

}
    
}