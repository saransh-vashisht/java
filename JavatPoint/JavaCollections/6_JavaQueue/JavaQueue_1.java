import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * JavaQueue_1
 * Java Priority Queue
 * 
 */
public class JavaQueue_1 {
public static void main(String[] args) {
    PriorityQueue<String> queue= new PriorityQueue<String>();

    queue.add("Sara");
    queue.add("Ranbir");
    queue.add("Karan");
    queue.add("Ananya");
    queue.add("Tiger");

    System.out.println("head: "+ queue.element());
    // USed to retrieve the head of the queue but does not remove it 
    System.out.println("head: "+ queue.peek());
    // Used to retrieve the head of the queue but does not remove it and returns null if the queue is empty

    System.out.println("Iterating the queue elements: ");

    Iterator<String> itr = queue.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
    }

    System.out.println(queue.remove());
    System.out.println(queue.poll());
    // they both retrieves and remove the head of the queue 
    // second one returns null if the queue is empty 
    System.out.println("After Removing Two Elements: ");
    Iterator<String> itr2= queue.iterator();
    while (itr2.hasNext()) {
        System.out.println(itr2.next());

    }
}
    
}