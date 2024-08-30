
// Java Hashmap -3
// Java HashMap Example to add() elements

import java.util.HashMap;
import java.util.Map;

public class JavaMap_9 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<Integer,String>();

        System.out.println("Initial list of elements" + hm);


        hm.put(10, "Sachin");
        hm.put(7, "Mahi");
        hm.put(18, "Virat");

        System.out.println("After invoking put() method ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());    
        }

        hm.putIfAbsent(45, "Rohit");
        System.out.println("After invoking putIfAbsent() method ");
        for (Map.Entry m  : hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());

        }

        HashMap<Integer,String> map= new HashMap<Integer,String>();

        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }




    }
}
