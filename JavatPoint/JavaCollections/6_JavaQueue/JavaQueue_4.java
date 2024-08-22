
// Java ArrayDeque Example:  offerFirst() and pollLast() 

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaQueue_4 {
    public static void main(String[] args) {
        Deque<String> deque= new ArrayDeque<String>();
        deque.offer("Izuku");
        deque.offer("Sara");
        // add element
        deque.add("Ansh");
        // add element and return true upon success
        deque.offerFirst("Froppy");
        // adds to the first position
        System.out.println("After offerFirst Traversal...");
        for (String s : deque) {
            System.out.println(s);

        }

        // deque.poll();
       // deque.pollFirst(); // it is same as poll
    //    both will remove the first element in the queue

    deque.pollLast();
    // it will remove the element from the last of the queue
    System.out.println("After pollLast() Traversal...");
        for (String s : deque) {
            System.out.println(s);

        }

    deque.offerLast("Saransh");

    }
}
