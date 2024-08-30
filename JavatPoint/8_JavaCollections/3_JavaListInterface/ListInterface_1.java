import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ListInterface_1
 * Creating the List Interface 
 * The ArrayList and LinkedList classes provide the implementation of List Interface 
 * 
 * List vs ArrayList
 * List is an interface whereas ArrayList is the implementation class of List
 * 
 */

public class ListInterface_1 {
public static void main(String[] args) {
    // Creating a List of type String using ArrayList
    List<String> list= new ArrayList<String>();

    // Creating a List of type Integer using ArrayList 
    List<Integer> list1= new ArrayList<Integer>();

    // Creating a List of type Book using ArrayList 
    List<Book> list2= new ArrayList<Book>();

    // Creating a List of type String using LinkedList
    List<String> list3= new LinkedList<String>();

    // We can create the List of any type . 
    //  The ArrayList<T> and LinkedList<T> classes are used to specify the type . Here T denotes the type 
    
}
    
}