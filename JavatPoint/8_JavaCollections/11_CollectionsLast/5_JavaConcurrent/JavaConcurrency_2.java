
/*
 * Java Concurrent HashMap Example 2
 * containsValue()
 */

import java.util.concurrent.ConcurrentHashMap;

public class JavaConcurrency_2 {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> mymap= new ConcurrentHashMap<String,Integer>();

        mymap.put("AAA", 10);
        mymap.put("BBB", 15);
        mymap.put("CCC", 25);
        mymap.put("DDD", 255);
        mymap.put("EEE", 30);

        System.out.println("Mappings are: "+ mymap);

        System.out.println("Is 255 present? ::"+ mymap.containsValue(255));


    }
}
