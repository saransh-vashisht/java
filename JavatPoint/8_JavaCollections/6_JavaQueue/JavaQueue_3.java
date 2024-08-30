
// Java ArrayDeque Example 

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaQueue_3 {
    public static void main(String[] args) {
        // Creating Deque and adding elements
        Deque<String> deque= new ArrayDeque<String>();
        deque.add("Izuku");
        deque.add("Kachan");
        deque.add("AllMight");
        // Traversing elements
        for (String str : deque) {
            System.out.println(str);
            
        }
    }
}
