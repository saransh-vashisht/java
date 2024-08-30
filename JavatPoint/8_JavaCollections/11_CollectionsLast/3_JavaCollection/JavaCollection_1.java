import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * JavaCollection_1
 */
public class JavaCollection_1 {

    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        // Inserts the specified element in this collection 
        set.add(2);
        set.add(5);
        System.out.println("Initial Collection: "+ set);
        // It adds all the elements of the speicidied collection in the invoking collection.
        Collections.addAll(set, 11,12,13,14,15);
        System.out.println("Final Collection: "+ set);
        // Returns the total size of the collection
        int size=set.size();
        System.out.println("Size of the Collection: "+ size);
        // It returns a Boolean value true if this queue contains the specified element.
        Boolean val=set.contains(5);
        if (val) {
            System.out.println("5 is present in the collection");
        } else {
            System.out.println("5 is not present in the collection");
        }

        // It removes all the elements automatically from this collection. 
        set.clear();
        System.out.println("Elements in collection : "+ set);
        
        

    }
    
}