
// Java LinkedHashSet Example : Book

import java.util.LinkedHashSet;

public class HashSet_9 {
    public static void main(String[] args) {
       LinkedHashSet<Book> set= new LinkedHashSet<Book>(); 

    //    Creating Books
    Book b1= new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
    Book b2= new Book(102, "Data Communcations & Networking", "Forouzan", "Mc Graw Hill", 4);
    Book b3= new Book(103, "Operating System", "Galvin", "Wiley", 6);

    // Adding Books to hash table 
    set.add(b1);
    set.add(b2);
    set.add(b3);
    // Traversing hashtable 
    for (Book book : set) {
        System.out.println(book.id+" "+ book.name+" "+book.author+" "+book.publisher+" "+book.quantity);
    }
    }
}
