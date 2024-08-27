import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 * EnumSet_1
 * Java EnumSet Example 
 */

enum days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class EnumSet_1 {
   public static void main(String[] args) {
    Set<days> set= EnumSet.of(days.TUESDAY, days.WEDNESDAY);
    // Traversing elements 
    Iterator<days> iter = set.iterator();
    while(iter.hasNext()){
        System.out.println(iter.next());
    }
   }
    
}