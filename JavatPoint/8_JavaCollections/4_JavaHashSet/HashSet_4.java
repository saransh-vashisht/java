
// Java HashSet from another Collection

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_4 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("Ravi Dahiya");
        list.add("Bajran Punia");
        list.add("Sakshi Malik");
        System.out.println("Our list is : "+ list);

        HashSet<String> set= new HashSet<String>(list);
        set.add("Yogeshwar Dutt");
        Iterator<String> itr= set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
