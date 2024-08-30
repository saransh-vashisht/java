
// Java ArrayList Example of retainAll() method 

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_11 {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();
        al.add("Nami");
        al.add("Robin");
        al.add("Vivi");

        ArrayList<String> al2= new ArrayList<String>();
        al2.add("Emma");
        al2.add("Shinobu");
        al.retainAll(al2);
        System.out.println("Iterating the elements after retaining the elements of al2");
        Iterator itr= al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
}
