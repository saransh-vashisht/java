
// Java TreeMap Example - 2
// Java TreeMap Example : remove() 

import java.util.Map;
import java.util.TreeMap;

public class JavaMap_19 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<Integer,String>();
        map.put(100, "Sakura");
        map.put(102, "Naruto");
        map.put(101, "Sasuke");
        map.put(103, "Kakashi");

        System.out.println("Before invoking remove() method");
        for (Map.Entry<Integer,String> mEntry : map.entrySet()) {
            System.out.println(mEntry.getKey()+" "+mEntry.getValue());
        }
        map.remove(101);
        System.out.println("After invoking remove() method");
        for (Map.Entry<Integer,String> mEntry : map.entrySet()) {
            System.out.println(mEntry.getKey()+" "+mEntry.getValue());
        }
    }
}
