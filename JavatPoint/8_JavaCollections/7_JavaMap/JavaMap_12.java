
// Java HashMap -6
// Java HashMap Example : Book

import java.util.HashMap;
import java.util.Map;





public class JavaMap_12 {
    public static void main(String[] args) {
        // Creatung map of Books 
        Map<Integer,Book> map= new HashMap<Integer,Book>();

        // Creating Book
        Book b1= new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2= new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3= new Book(103, "Operating System", "Galvin", "Wiley", 6);

        // Adding Books to map 
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        //Traversing map
        for (Map.Entry<Integer,Book> m : map.entrySet()) {
            int key=m.getKey();
            Book b= m.getValue();
            System.out.println(key+" Details: ");
           System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);

        } 
    }
}
