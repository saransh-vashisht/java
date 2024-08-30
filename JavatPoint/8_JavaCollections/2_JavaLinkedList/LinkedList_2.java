
// Linked List Example to add elements

import java.util.LinkedList;

public class LinkedList_2 {
    public static void main(String[] args) {
        LinkedList<String> li= new LinkedList<String>();
        li.add("Vijay Shankar");
        li.add("Hardik Pandya");
        li.add("Amit Mishra");

        System.out.println("After invoking add(E e) method: "+li);

        // Adding an element at the specified position
        li.add(1,"Shreyas Iyer");

        System.out.println("After invoking add(int index,E element) method: "+li);

        LinkedList<String> li2= new LinkedList<String>();

        li2.add("Hanuma Vihari");
        li2.add("Ajinkya Rahane");
        // Adding second list elements to the first list

        li.addAll(li2);

        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+li);

        LinkedList<String> li3= new LinkedList<String>();
        li3.add("Yashasvi Jaiswal");
        li3.add("Shubhman Gill");

        // Adding third list elements to the first list at specified position
        li.addAll(1, li3);

        System.out.println("After Invoking addAll(int index,Collection<? extends E> c) method: "+ li);

        // Adding an element at the first position

        li.addFirst("KL Rahul");
        System.out.println("After invoking addFirst(E e) method: "+ li);

        // Adding an element at the last position
        li.addLast("Rinku Singh");

        System.out.println("After invoking addLast(E e) method: "+ li);
        



    }
}
