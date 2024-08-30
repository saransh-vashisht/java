// Difference between ArrayList and Vector - 1

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * CollectionsLast_1
 */
public class CollectionsLast_1 {
    public static void main(String[] args) {
        //Creating arraylist
        List<String> al= new ArrayList<String>();
        // Adding objects in arraylist
        al.add("Virat");
        al.add("Rohit");
        al.add("Mahi");
        al.add("Dhawan");

        // Traversing elements using iterator 
        Iterator itr =al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}