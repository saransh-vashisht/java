
/*
 * List Interface -4
 * 
 * Vector 
 * Vector uses a dynamic array to store the data elements . It is similar to ArrayList . 
 * However, it is synchronized and contains many methods that are not the part of the collections framework
 * 
 * 
 */
// Vector Example

import java.util.Iterator;
import java.util.Vector;

public class Collections_4 {
    public static void main(String[] args) {
        Vector<String> v= new Vector<String>();
        v.add("Naruto");
        v.add("Shikamaru");
        v.add("Sasuke");
        v.add("Hinata");

        Iterator<String> itr= v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
}
