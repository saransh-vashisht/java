
// Queue Interface - 2
/*
 * Priority Queue 
 * 
 * The Priority Queue class implements the Queue interface . 
 * It holds the elements or objects which are to be processed by their priorities. 
 * Priority Queue does not allow the null values to be stored in the queue. 
 * 
 */

import java.util.Iterator;
import java.util.PriorityQueue;

public class Collections_7 {
    public static void main(String[] args) {
        PriorityQueue<String> queue= new PriorityQueue<String>();
        queue.add("Shinobu");
        queue.add("Giyu");
        queue.add("Mitsuri");
        queue.add("Sanemi");
        // The strings "Shinobu", "Giyu", "Mitsuri", and "Sanemi" are added to the queue.
        //  The PriorityQueue will order these strings lexicographically.
        System.out.println("Head: "+ queue.element());
        System.out.println("head: "+ queue.peek());
        //queue.element() and queue.peek() both return the head of the queue without removing it. Since it's a PriorityQueue, the head will be the smallest element lexicographically.
        //The smallest string in lexicographical order among the added elements is "Giyu".

        System.out.println("Iterating the queue elements: ");
        Iterator itr= queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        //This will print all elements in the queue. However, note that the order in which elements are iterated over is not guaranteed to be in the priority order. The PriorityQueue ensures that only the head (minimum element) is at the correct position for removal, but the internal order may vary.

        queue.remove();
        queue.poll();
        //  queue.remove() removes the head of the queue ("Giyu").
        //queue.poll() then removes the next head of the queue ("Mitsuri"), which would have been the new smallest element after "Giyu" was removed.
        System.out.println("after removing two elements: ");

        Iterator<String> itr2= queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());

        }

    }
}
