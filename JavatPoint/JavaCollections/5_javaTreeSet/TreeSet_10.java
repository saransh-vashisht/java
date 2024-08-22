
// TreeSet Example
// The floor(E e) method is part of the NavigableSet interface, implemented by classes like TreeSet. This method is used to find the largest element in the set that is less than or equal to the specified element.

import java.util.TreeSet;

public class TreeSet_10 {
    public static void main(String[] args) {
        TreeSet<Integer> set= new TreeSet<>();

        // Adding elements to the TreeSet
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);


        // Example usages of floor() method 
        System.out.println("Floor of 25: "+ set.floor(25));
        System.out.println("Floor of 30: "+ set.floor(30));
        System.out.println("Floor of 5: "+ set.floor(5));
        
    }
}
