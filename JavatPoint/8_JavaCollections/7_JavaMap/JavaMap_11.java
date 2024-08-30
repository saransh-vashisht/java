
// Java HashMap - 5
// Java HashMap example to replace() elements

import java.util.HashMap;
import java.util.Map;

public class JavaMap_11 {
    public static void main(String[] args) {
       HashMap<Integer,String> hm = new HashMap<Integer,String>(); 
       hm.put(100, "Rohit");
       hm.put(101, "Dhawan");
       hm.put(102, "Dhoni");

       System.out.println("Initial list of elements: ");
       for (Map.Entry mEntry : hm.entrySet()) {
        System.out.println(mEntry.getKey()+" "+mEntry.getValue()); 
       }
       System.out.println("Updated list of elements: ");
       hm.replace(102, "Pant");
       for (Map.Entry m : hm.entrySet()) {
        System.out.println(m.getKey()+" "+m.getValue());
       }
       System.out.println("Updated List of elements: ");
       hm.replace(101, "Dhawan", "Shubhman");
       for (Map.Entry m : hm.entrySet()) {
        System.out.println(m.getKey()+" "+m.getValue());
       }
       System.out.println("Updated list of elements: ");
       hm.replaceAll((k,v)->"Cricketer");
       for (Map.Entry m : hm.entrySet()) {
        System.out.println(m.getKey()+" "+m.getValue());
       }

    }
}

// HashSet contains only values whereas HashMap contains an entry(key and value).

