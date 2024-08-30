import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet_1
 * Example of HashSet
 */
public class HashSet_1 {
    public static void main(String[] args) {
        // Creating HashSet and adding elements
        HashSet<String> set= new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        Iterator<String> i= set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
            
        }
    }
    
}