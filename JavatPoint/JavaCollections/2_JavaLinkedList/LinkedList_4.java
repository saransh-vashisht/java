
// LinkedList Example to Reverse a list of elements

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_4 {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList<>();
        ll.add("Warner");
        ll.add("Williamson");
        ll.add("Rohit");

        // Traversing the list of array in reverse order 
        Iterator i=ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
            
        }
    }
}
