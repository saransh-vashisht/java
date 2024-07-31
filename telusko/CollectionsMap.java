import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {
    public static void main(String[] args) {
       Map<String,Integer> students = new HashMap<>();

       students.put("Navin", 56);
       students.put("Harsh", 23);
       students.put("Sushil", 67);
       students.put("Kiran", 92);

       System.out.println(students);
        


        // map itself is an interface and it has the key value pairs as the K and V
        // K and V can be replaced with the datatypes like int , float , string
        // so the type of class we will be working with will be Hashmap

        
    }
}
