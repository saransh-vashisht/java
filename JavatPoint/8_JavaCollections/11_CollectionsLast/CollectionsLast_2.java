
// Difference between arraylist and vector - 2
// Example of Java Vector

import java.util.Enumeration;
import java.util.Vector;

public class CollectionsLast_2 {
    public static void main(String[] args) {
        // Creating vector
        Vector<String> v= new Vector<String>();

        // Method of collection
        v.add("Virat"); 

        // method of vector
        v.addElement("Rohit");
        v.addElement("Dhawan");
        // traversing elements using enumeration
        Enumeration ev=v.elements();
        while (ev.hasMoreElements()) {
            System.out.println(ev.nextElement());
        }
    }
}
