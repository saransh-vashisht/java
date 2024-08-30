
/*
 *  List Interface -3
 * LinkedList
 * LinkedList implements the Collection Interface.
 * It uses a doubly linked list internally to store the elements. It maintains the insertion order and is not synchronized. 
 * In LinkedList, the manipulation is fast because no shifting is required 
 * 
 */

import java.util.Iterator;
import java.util.LinkedList;

public class Collections_3 {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Luffy");
        al.add("Zoro");
        al.add("Sanji");
        al.add("Nami");

        Iterator<String> itr=al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
}
