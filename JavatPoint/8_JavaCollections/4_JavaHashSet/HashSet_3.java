
// Java HashSet Example to remove elements

import java.util.HashSet;

public class HashSet_3 {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<String>();
        set.add("Jassi");
        set.add("Dubey");
        set.add("Yuvi");
        set.add("Viru");
        System.out.println("An initial list of elements: "+ set);

        // Removing specific element from the HashSet
        set.remove("Viru");
        System.out.println("After invoking remove(object) method: "+ set);
        

        HashSet<String> set1= new HashSet<String>();
        set1.add("Chiku");
        set1.add("Mahi");
        set.addAll(set1);
        System.out.println("");

        System.out.println("Updated List: "+ set);

        // Removing all the new elements from the HashSet
        set.removeAll(set1);

        System.out.println("After invoking removeAll() method: "+ set);

        // Removing element on the basis of specified condition
        set.removeIf(str->str.contains("Dubey"));
        System.out.println();
        System.out.println("After invoking removeIf() method: "+ set);

        // Removing all the elements available in the set
        set.clear();
        System.out.println();
        System.out.println("After invoking clear() method: "+ set);


    }
}
