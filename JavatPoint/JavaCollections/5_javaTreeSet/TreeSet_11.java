
// Example of TreeSet
// Functionality: The higher(E e) method returns the smallest element in the set that is strictly greater than the specified element e.

import java.util.TreeSet;

public class TreeSet_11 {
    public static void main(String[] args) {
        TreeSet<Integer> set= new TreeSet<>();

        // Adding elements to the TreeSet
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        // Example usage of higher() method 
        System.out.println("Higher than 20: "+ set.higher(20));
        System.out.println("Higher than 35: "+ set.higher(35));
        System.out.println("Higher than 40: "+ set.higher(40));
        
    }
}
