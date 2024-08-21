
// LinkedList example to remove elements

import java.util.LinkedList;

public class LinkedList_3 {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList<String>();

        ll.add("Rohit Sharma");
        ll.add("Yashasvi Jaiswal");
        ll.add("Virat Kohli");
        ll.add("Suryakumar Yadav");
        ll.add("Axar Patel");
        ll.add("Rishabh Pant");
        ll.add("Shivam Dubey");
        ll.add("Hardik Pandya");
        ll.add("Axar Patel");
        ll.add("Suryakumar Yadav");
        ll.add("Jadjea");
        ll.add("Kuldeep Yadav");
        ll.add("Jasprit Bumrah");
        ll.add("Arshdeep");


        System.out.println("Initial list of elements: "+ ll);

        System.out.println(" ");

        // Removing specific element from Linkedlist
        ll.remove("Yashasvi Jaiswal");
        System.out.println("After invoking remove(object) method: "+ ll);

        System.out.println(" ");

        // Removing element on the basis of specific position

        ll.remove(0);

        System.out.println("After invoking remove(index) method: "+ ll);

        System.out.println(" ");

        LinkedList<String> ll2= new LinkedList<String>();

        ll2.add("Mohammad Siraj");
        ll2.add("Sanju Samson");

        // Adding new element to Linkedlist

        ll.addAll(ll2);
        System.out.println("Updated List: "+ ll);
        System.out.println(" ");

        // Removing all the new elements from the Linkedlist
        ll.removeAll(ll2);
        System.out.println("After invoking removeAll() method: "+ ll);
        System.out.println(" ");

        // Removing first element from the list
        ll.removeFirst();
        System.out.println("After invoking removeFirst() method:  "+ ll); 
        System.out.println(" ");

        // Removing last occurrence of element from the list
        ll.removeLast();
        System.out.println("After invoking removeLast() method: "+ll);
        System.out.println(" ");


        // Removing first occurrence of the element from the list
        ll.removeFirstOccurrence("Suryakumar Yadav");
        System.out.println("After invoking removeFirstOccurrence() method: "+ ll);
        System.out.println();

        // Removing last occurrence of the element from the list
        ll.removeLastOccurrence("Axar Patel");
        System.out.println("After invoking removeLastOccurrence() method: "+ ll);
        System.out.println();

        // Removing all the elements available in the list
        ll.clear();
        System.out.println("After invoking clear() method: "+ ll);
        z









    }
}
