
/* 
 * Java LinkedHashSet example ignoring duplicate Elements
 * 
 */

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSet_7 {
    public static void main(String[] args) {
        LinkedHashSet<String> set= new LinkedHashSet<String>();
        set.add("Naruto");
        set.add("Midoriya");
        set.add("Naruto");
        set.add("Yuji");

        Iterator<String> itr= set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
}
