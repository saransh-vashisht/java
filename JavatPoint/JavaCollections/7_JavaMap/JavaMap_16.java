
// LinkedHashMap Example - 4
// Java LinkedHashMap Example : Book

import java.util.LinkedHashMap;
import java.util.Map;



public class JavaMap_16 {
    public static void main(String[] args) {

        // Creating map of Book
        LinkedHashMap<Integer,Book> hm = new LinkedHashMap<>();

        // Creating Books 
        Book b1= new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2= new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3= new Book(103, "Operating System", "Galvin", "Wiley", 6);

        // Adding Books to map
        hm.put(2, b2);
        hm.put(1, b1);
        hm.put(3, b3);

        // Traversing map
        for (Map.Entry<Integer,Book> entry : hm.entrySet()) {
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" Details: ");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+ b.quantity);
            
        }



        

    }
}
