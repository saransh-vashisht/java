
/*
 * Remove Element using LinkedHashSet Class
 * 
 */

import java.util.LinkedHashSet;

public class HashSet_8 {
    // main method
    public static void main(String[] args) {
        // Creating an empty LinkedHashSet of string type 
        LinkedHashSet<String> set= new LinkedHashSet<String>();

        // Adding elements to the above Set by invoking add() method
        set.add("Java");
        set.add("Python");
        set.add("JavaScript");
        set.add("GoLang");
        set.add("Swift");

        // Displaying all the elements on the console 
        System.out.println("The hash set is :"+ set);
        /*
         * Removing an element from the above linked Set
         * since the element "GoLang" is present, therefore, the method remove() returns true 
         */
        System.out.println(set.remove("GoLang"));

        // After removing the element 
        System.out.println("After removing the element, the hash set is: "+ set);

        // since the element "TypeScript" is not present,therefore, the method remove() returns false 
        System.out.println(set.remove("TypeScript"));
        



    }
}
