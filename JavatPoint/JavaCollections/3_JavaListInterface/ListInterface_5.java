
// Get and Set Elements in List 
/*
 * The get() method returns the element at the given index , whereas the set() method changes or replaces the element.
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class ListInterface_5 {
    public static void main(String[] args) {
        // Creating a List
        List<String> list= new ArrayList<String>();

        // Adding elements in the List 
        list.add("Thorfinn");
        list.add("Askeladd");
        list.add("Thorkell");
        list.add("Ylva");

        // Accessing the elements
        System.out.println("Returning element: "+ list.get(1));
        // Above will return the second element because the index starts from zero

        // Changing the element
        list.set(1, "Thorss");

        // Iterating the List element using for-each loop
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
