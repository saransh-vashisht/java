import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet_1
 * Java TreeSet Example 1
 */
public class TreeSet_1 {
public static void main(String[] args) {
    // Creating and adding elements
    TreeSet<String> tSet= new TreeSet<String>();
    tSet.add("Virat");
    tSet.add("AllMight");
    tSet.add("Kacchan");
    tSet.add("Midoriya");

    // Traversing elements
    Iterator<String> itr = tSet.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
        // the output is arranged in the ascending order 
        
    }


}
    
}