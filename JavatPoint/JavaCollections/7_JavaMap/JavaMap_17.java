
// Linked HashMap Example -5 
// Access Order Example

import java.util.LinkedHashMap;

public class JavaMap_17 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>(16,0.75f,true);

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map); //Output: {1=A, 2=B, 3=C}

        map.get(2); // Access Key 2

        System.out.println(map); // Output: {1=A, 3=C, 2=B} -> Key 2 is moved to the end bcz it is accessed and the map is ordered based on the most recently accessed entries.

    }
}
