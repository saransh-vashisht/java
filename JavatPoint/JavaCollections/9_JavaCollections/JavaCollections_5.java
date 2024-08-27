
// Sorting in collections - 2
// Example to sort string objects in reverse order 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class JavaCollections_5 {
    public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();        
    al.add("Virat");
    al.add("Rohit");
    al.add("Dhawan");
    al.add("Mahi");

    Collections.sort(al,Collections.reverseOrder());
    Iterator i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
