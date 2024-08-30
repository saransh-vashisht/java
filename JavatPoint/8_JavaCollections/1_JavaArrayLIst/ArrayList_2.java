
// Iterating ArrayList using Iterator 

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>(); //Creating arraylist
        list.add("Mango"); //Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        // Traversing list through iterator
        Iterator itr=list.iterator(); // getting the iterator
        while (itr.hasNext()) { //checks if the iterator has the elements 
            System.out.println(itr.next()); //printing the element and move to next

        }
    }
}
