
// Iterating ArrayList using For-each loop 

import java.util.ArrayList;

public class ArrayList_3 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>(); //creating arraylist
        list.add("Mango"); //Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        // Traversing list through for each loop 
        for (String fruString : list) {
            System.out.println(fruString);
            
        }
    }
}
