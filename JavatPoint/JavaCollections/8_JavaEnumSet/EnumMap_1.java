
// Java EnumMap Example 

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public class EnumMap_1 {
    // Creates an enum
    public enum Days{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    };
    public static void main(String[] args) {
        // create and populate enum map 
        EnumMap<Days,String> map= new EnumMap<Days,String>(Days.class); 
        map.put(Days.MONDAY, "1");
        map.put(Days.TUESDAY, "2");
        map.put(Days.WEDNESDAY, "3");
        map.put(Days.THURSDAY, "4");
        map.put(Days.FRIDAY, "5");
        map.put(Days.SATURDAY, "6");
        map.put(Days.SUNDAY, "7");

        // print the map 
        for (Map.Entry<Days, String> m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
