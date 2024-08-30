
// List Interface -2

/*
 * ArrayList 
 *  The Arraylist class implements the list interface.
 * It uses a dynamic array to store the duplicate elements of different data types. The ArrayList class maintains the insertion order and is non synchronized. 
 * The elements stored in the ArrayList class can be randomly accessed .
 */

//  ArrayList Example

import java.util.ArrayList;
import java.util.Iterator;

public class Collections_2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>(); //creating arraylist

        list.add("Naruto");
        list.add("Sasuke");
        list.add("Hinata");
        list.add("Sakura");
        list.add("Naruto");

        // Traversing list through iterator 
        Iterator itr=list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }

    }
}
