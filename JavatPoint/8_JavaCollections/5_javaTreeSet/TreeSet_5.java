
// Java TreeSet Example 4
// Here we perform various NavigableSet operations

import java.util.TreeSet;

public class TreeSet_5 {
    public static void main(String[] args) {
        TreeSet<String> set= new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println("Initial set: "+ set);

        System.out.println("Reverse Set: "+ set.descendingSet());
        // it will give us our set in the descending order

        System.out.println("Head Set: "+ set.headSet("C", true));
        // it will give elements which are less than or equal to . it includes the value if the boolean is true 

        System.out.println("SubSet: "+ set.subSet("A", false,"E",true));
        // it will give us a range of sub string

        System.out.println("TailSet: "+ set.tailSet("C", false));
        // it will give us the elements greater than our specified element or equal too if it is true 
        

    }
}
