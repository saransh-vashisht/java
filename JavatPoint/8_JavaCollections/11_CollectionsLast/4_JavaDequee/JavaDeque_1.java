import java.util.ArrayDeque;
import java.util.Deque;

/**
 * JavaDeque_1
 */
public class JavaDeque_1 {

    public static void main(String[] args) {
        Deque<Integer> deque= new ArrayDeque<Integer>();
        // Inserts the element..
        deque.add(1);
        deque.add(2);
        deque.add(3);

        System.out.println("Inserting three elements: ");

        for (Integer integer : deque) {
            System.out.println(integer);
        }

        // Removing the element
        deque.pop();
        System.out.println("After popping:");
        for (Integer integer : deque) {
            System.out.println(integer);
        }

        // Removing the specific element
        deque.remove(3);
        System.out.println("Removing the element 3: "+ deque);

    }
}