
// LinkedHashMap - 1
// Java LinkedHashMap Example 

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaMap_13 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();

        hm.put(100, "Rohit");
        hm.put(101, "Virat");
        hm.put(102, "Rahul");

        for (Map.Entry<Integer,String> mEntry : hm.entrySet()) {
            System.out.println(mEntry.getKey()+" "+mEntry.getValue());    
        }
    }
}
