/**
 * LinkedList_1
 * LinkedList Example
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String[] args) {
        
        LinkedList<String> al= new LinkedList<String>();
        al.add("Sakura");
        al.add("Sarada");
        al.add("Naruto");
        al.add("Boruto");

        Iterator<String> itr= al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
            
        }
    }
    
}