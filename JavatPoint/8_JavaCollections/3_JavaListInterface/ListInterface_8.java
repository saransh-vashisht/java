
/*
 * Example of List: Book
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class ListInterface_8 {
    public static void main(String[] args) {
        // Creating a List of Books 
        List<Book> list= new ArrayList<Book>();
        
        //Creating Books 
        Book b1= new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2= new Book(101, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3= new Book(102, "Operating System", "Galvin", "Wiley", 6);

        // Adding Books to list 
        list.add(b1);
        list.add(b2);
        list.add(b3);

        // Traversing books     
        for (Book book : list) {
            System.out.println(book.id+" "+ book.name+" "+book.author+" "+book.publisher+" "+ book.quantity);
            
        }
    }
}
