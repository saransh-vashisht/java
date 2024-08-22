
// Java TreeSet Example : 2
// Traversing elements in the descending order

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_2 {
    public static void main(String[] args) {
        TreeSet<String> set= new TreeSet<String>();
        set.add("Ravi");
        set.add("Vjay");
        set.add("Ajay");
        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=set.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }


        System.out.println("\n Traversing element through NavigableSet in descending order");
        NavigableSet<String> navSet= set.descendingSet();
        for (String element : navSet) {
            System.out.println(element);
            
        }
    }
}
