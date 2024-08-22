
// Java TreeSet Example 
// The ceiling(E e) method is part of the NavigableSet interface in Java, which is implemented by classes like TreeSet. This method is used to find the smallest element in the set that is greater than or equal to the specified element.

import java.util.TreeSet;

public class TreeSet_9 {
    public static void main(String[] args) {
        TreeSet<Integer> set= new TreeSet<>();

        // Adding elements to the TreeSet 
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // Example usages of ceiling() method 
        System.out.println("Cieling of 25: "+ set.ceiling(25));
        System.out.println("Ceiling of 30: "+ set.ceiling(30));
        System.out.println("Ceiling of 55: "+set.ceiling(55));
        // it gives null because there is no element in the set greater than or equal to 55
        

    }
}
