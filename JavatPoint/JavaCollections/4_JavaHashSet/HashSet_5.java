
// Java HashSet Example : Book

import java.util.HashSet;





public class HashSet_5 {
    public static void main(String[] args) {
        HashSet<Book> set= new HashSet<Book>();
        // Creating Books
        Book b1= new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2= new Book(102, "Data Communication & Networks", "Forouzan", "Mc Graw Hill", 6);
        Book b3= new Book(103, "Operating System", "Galvin", "Wiley", 6);
        

        // Adding books to the HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);

        // Traversing HashSet
        for (Book book : set) {
            System.out.println(book.id+" " + book.name+" "+book.author+" "+book.publisher+" "+book.quantity);

        }
    }
}
