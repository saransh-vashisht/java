
// Java HashTable Example - 3
// Java Hashtable Example : getOrDefault()

import java.util.Hashtable;

public class JavaMap_25 {
    public static void main(String[] args) {
        Hashtable<Integer,String> map= new Hashtable<Integer,String>();
        map.put(100, "Agni");
        map.put(102, "Jal");
        map.put(101, "Vayu");
        map.put(103, "Prithvi");
        map.put(104, "Akash");

        // Here we specify the if and else statement as arguments of the method 
        System.out.println(map.getOrDefault(101, "Not Found"));
        System.out.println(map.getOrDefault(105, "Not Found"));
        // it will check if the given key has value with it and if it is not then it will give the default value that we have specified
        
    }
}
