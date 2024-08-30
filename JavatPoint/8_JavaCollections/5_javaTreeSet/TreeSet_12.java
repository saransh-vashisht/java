
// E lower(E e)
//Functionality: The lower(E e) method returns the largest element in the set that is strictly less than the specified element e.

import java.util.TreeSet;

public class TreeSet_12 {
    public static void main(String[] args) {
        TreeSet<Integer> set= new TreeSet<>();

        // Adding elements to the TreeSet
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        // Example usage of lower() method
        System.out.println("Lower than 30: "+ set.lower(30));
        System.out.println("Lower than 15: "+ set.lower(15));
        System.out.println("Lower than 10: "+ set.lower(10));
        

    }
}
