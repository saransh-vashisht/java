
//  LinkedHashMap Example - 3
// Java LinkedHashMap Example : remove() 

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaMap_15 {
    public static void main(String[] args) {
        Map<Integer,String> map=  new LinkedHashMap<Integer,String>();
        map.put(101, "Geeta");
        map.put(102, "Babita");
        map.put(103, "Vinesh");
        System.out.println("Before invoking remove() method: "+ map);
        map.remove(102);
        System.out.println("After invoking remove() method: "+ map);
        
    }
}
