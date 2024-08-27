
// Sorting in collections
// Example to sort string objects

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class JavaCollections_4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Viru");
        al.add("Sachin");
        al.add("Zaheer");
        al.add("Bhajji");

        Collections.sort(al);
        Iterator itr=al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
}
