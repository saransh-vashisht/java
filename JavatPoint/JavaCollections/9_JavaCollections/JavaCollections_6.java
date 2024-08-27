
// Sorting in collections 
// Example to sort Wrapper class objects 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class JavaCollections_6 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.add(Integer.valueOf(201));
        al.add(Integer.valueOf(101));
        al.add(230); //Internally will be converted into objects as Integer.valueOf(230)

        Collections.sort(al);

        Iterator itr= al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
