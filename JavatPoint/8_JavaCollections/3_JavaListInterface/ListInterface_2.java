
/*
 * Java List Example 
 * Example of List where we are using the ArrayList class as the implementation.
 */

import java.util.ArrayList;
import java.util.List;

public class ListInterface_2 {
    public static void main(String[] args) {
        // Creating a List
        List<String> list= new ArrayList<String>();

        // Adding elements in the List 
        list.add("Virat Kohli");
        list.add("Joe Root");
        list.add("Steve Smith");
        list.add("Kane Williamson");

        // Iterating the List elements using for-each loop
        for (String fruString : list) {
            System.out.print(fruString+" ");

        }
    }
}
