
// Stack Iteration Example 
// listIterator()

import java.util.ListIterator;
import java.util.Stack;

public class JavaStack_8 {
    public static void main(String[] args) {
        Stack<Integer> stk= new Stack<>();
        stk.push(119);
        stk.push(203);
        stk.push(988);
        ListIterator<Integer> li=stk.listIterator(stk.size());
        System.out.println("Iteration over the Stack from top to bottom: ");
        while (li.hasPrevious()) {
            Integer avg= li.previous();
            System.out.println(avg);
            
            
        }

    }
}
