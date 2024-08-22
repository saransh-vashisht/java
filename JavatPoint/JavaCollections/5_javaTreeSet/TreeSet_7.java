
// Java TreeSet Example : Book
/*
 * The elements in TreeSet must be of a Comparable type. String and Wrapper class are Comparable by default. To add user-defined objects in TreeSet, you need to implement the Comparable Interface
 * 
 */

import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book>{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    
    // Implementing the abstract method 
    public int compareTo(Book b){
        // if (id>b.id) {
        //     return 1;   
        // } else if (id<b.id) {
        //     return -1;
        // } else{
        //     return 0;
        // }

        return this.id - b.id; 
        //Compare books by id in ascending order
        
    }
}

public class TreeSet_7 {
    public static void main(String[] args) {
        Set<Book> set= new TreeSet<Book>();
        // Creating Books 
        Book b1= new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2= new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3= new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);


        // Adding books to TreeSet
        set.add(b1);
        set.add(b2);
        set.add(b3);

        // Traversing TreeSet
        for (Book book : set) {
            System.out.println(book.id+" "+book.name+" "+book.author+" "+book.publisher+" "+book.quantity);

        }
    }
}
