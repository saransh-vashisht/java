
// List Interface -5
/*
 * Stack
 * The stack is the subclass of Vector . 
 * It implements the last in first out data structure i.e. stack. 
 * The stack contains all the methods of Vector class and also  provides its methods like boolean push(), boolean peak(object o), which define it's properties.
 */

import java.util.Iterator;
import java.util.Stack;

public class Collections_5 {
    public static void main(String[] args) {
     Stack<String> stack= new Stack<String>();
     stack.push("Nico Robin");
     stack.push("Nami");
     stack.push("Vivi");
     stack.push("Boa Hancock");
     stack.push("Luffy");
     stack.pop();
     Iterator<String> itr=stack.iterator();
     while (itr.hasNext()) {
        System.out.println(itr.next());

     }
    }
}
