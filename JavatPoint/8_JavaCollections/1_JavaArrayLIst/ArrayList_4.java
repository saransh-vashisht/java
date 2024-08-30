
// Get and Set ArrayList
// The get() method returns the element at the specified index
// the Set() method changes the element

import java.util.ArrayList;

public class ArrayList_4 {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        // Accessing the element
        System.out.println("Returning element: "+ al.get(1) ); 

        // changing the element
        al.set(1, "Dates");

        // Traversing list
        for (String fruString : al) {
            System.out.println(fruString);
            
        }
    }
}
