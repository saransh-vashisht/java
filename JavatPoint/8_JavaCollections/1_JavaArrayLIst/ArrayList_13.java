import java.util.ArrayList;

// Java ArrayList Example : Book
class Book{
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
}

public class ArrayList_13 {
    public static void main(String[] args) {
        // Creating list of Books
       ArrayList<Book> list= new ArrayList<Book>();

        // Creating books 
        Book b1= new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);

        Book b2= new Book(102, "Data Communication and Networking", "Forouzan", "Mc Graw Hill", 4);

        Book b3= new Book(103, "Operating System", "Galvin", "Wiley", 6);

        // Adding books to list 
        list.add(b1);
        list.add(b2);
        list.add(b3);

        // Traversing list
        for (Book book : list) {
            System.out.println(book.id+" "+ book.name+" "+book.author+" "+book.publisher+" "+book.quantity);
            
        }


        
    }
}
