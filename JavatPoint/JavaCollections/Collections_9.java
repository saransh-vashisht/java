
// Queue Interface - 4

// ArrayDeque

/*
 * ArrayDeque class implements the Deque interface. 
 * It facilitates us to use the Deque. 
 * Unlike queue we can add or delete the elements from both the ends
 * ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions 
 * 
 * 
 */

//  Example

import java.util.ArrayDeque;
import java.util.Deque;

public class Collections_9 {
    public static void main(String[] args) {
        // Creating Deque and adding elements
        Deque<String> deque= new ArrayDeque<String>();
        deque.add("Sarada");
        deque.add("Boruto");
        deque.add("Mitsuki");

        // Traversing elements
        for (String string : deque) {
            System.out.println(string);
            
        }
    }
}
