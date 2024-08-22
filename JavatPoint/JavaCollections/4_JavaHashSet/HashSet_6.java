
/*
 * Java LinkedHashSet Example
 */

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSet_6 {
    public static void main(String[] args) {
        // Creating HashSet and Adding elements
        LinkedHashSet<String> set= new LinkedHashSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Six");
        set.add("Seven");
        set.add("Eight");

        Iterator<String> itr= set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            // The insertion order is maintained in the output
            // we can also use the enchanced for loop for displaying the elements
            
        }
    }
}
