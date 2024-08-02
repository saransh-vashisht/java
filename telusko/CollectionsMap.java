import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CollectionsMap {
    public static void main(String[] args) {
       Map<String,Integer> students = new HashMap<>();

       students.put("Navin", 56);
       students.put("Harsh", 23);
       students.put("Sushil", 67);
       students.put("Kiran", 92);
       students.put("Harsh", 45);

    //    the put method is used to add value to our map with key value pair
    // the key is unique and cannot be repeated 
    //and the values can be repeated
    //the key is like the list and the value is like the list


    System.out.println(students.keySet());
    // the keyset will give us all the key values in our map collection

    for (String nameString : students.keySet()) {
        System.out.println(nameString+ " : "+ students.get(nameString));

    }


    System.out.println(students.values());


       System.out.println(students);
        


        // map itself is an interface and it has the key value pairs as the K and V
        // K and V can be replaced with the datatypes like int , float , string
        // so the type of class we will be working with will be Hashmap



        // HashTable here
        Map<String,Integer> students1= new Hashtable<>();

        students1.put("Navin", 56);
        students1.put("Harsh", 23);
        students1.put("Sushil", 67);
        students1.put("Kiran", 92);
        students1.put("Harsh", 45);

        // hashtable is synchronized 
        // if we have multiple threads working then its better to use the hashmap 
        //


        System.out.println(students1);


        
    }
}
