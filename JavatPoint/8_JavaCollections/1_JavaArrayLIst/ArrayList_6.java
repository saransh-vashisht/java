
/*
 * Ways to iterate the elements of the collection in Java
 * 
 * -> By iterator interface
 * -> By for each loop
 * -> By ListIterator Interface
 * -> By for loop 
 * -> By forEach() method 
 * -> By forEachRemaining() method 
 * 
 *
 */

 //Iterating Collection through remaining ways 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_6 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>(); //Creating arraylist
        list.add("Nami");
        list.add("Vivi");
        list.add("Nico Robin");
        list.add("Boa Hancock");

        System.out.println("Traversing list through List Iterator: ");

        // Here ELement iterates in reverse order
        ListIterator<String> list1= list.listIterator(list.size());
        while (list1.hasPrevious()) {
            String str=list1.previous();
            System.out.println(str);

        }

        System.out.println("Traversing list through for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        System.out.println("Traversing list through forEach() : ");
        // The forEach() method ia a new feature , introduced in Java 8

        list.forEach(a->{//here we are using the lambda expression
            System.out.println(a);

            });

            System.out.println("Traversing list through forEachRemaining() method");
            Iterator<String> itr= list.iterator();
            itr.forEachRemaining(a ->{
                System.out.println(a);
                
            });
    }
}
