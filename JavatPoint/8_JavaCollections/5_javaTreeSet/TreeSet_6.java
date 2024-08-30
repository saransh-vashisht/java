
// Java TreeSet Example : 5
//  In this example we perform various SortedSet operations

import java.util.TreeSet;

public class TreeSet_6 {
    public static void main(String[] args) {
        TreeSet<String> set= new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println("Initial Set: "+ set);

        System.out.println("HeadSet: "+ set.headSet("C"));
        // It gives us the values less than given value 

        System.out.println("SubSet: "+ set.subSet("A", "E"));
        // It gives us the values equal to lower value and less than higher value 


        System.out.println("TailSet: "+ set.tailSet("C"));
        // It is giving us the values equal to and greater than given value
        



    }
}
