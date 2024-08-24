
// Java HashMap - 4
// Java HashMap() example to remove() elements

import java.util.HashMap;

public class JavaMap_10 {
    public static void main(String[] args) {
     HashMap<Integer,String> map= new HashMap<Integer,String>();   

     map.put(100, "Virat");
     map.put(101, "Rohit");
     map.put(102, "Dhawan");
     map.put(103, "Mahi");
     map.put(104, "Shami");

     System.out.println("Initial list of elements: "+ map);
    //  Key - based removal 
    map.remove(100);
    System.out.println("Updated list of elements: "+ map);

    // Value- based removal
    map.remove(101);
    System.out.println("Updated list of elements: "+ map);

    // HashMap does not have only removal method to only use the value 

    // Key-value pair based removal
    map.remove(102,"Dhawan");
    System.out.println("Updated list of elements: "+ map);


    }
}
