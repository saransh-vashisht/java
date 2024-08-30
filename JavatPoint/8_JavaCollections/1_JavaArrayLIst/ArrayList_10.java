
// Java ArrayList Example to remove elements

import java.util.ArrayList;

public class ArrayList_10 {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();
        al.add("Nami");
        al.add("Robin");
        al.add("Vivi");
        al.add("Hancock");
        al.add("Megumin");
        al.add("Shinobu");
        System.out.println("An initial list of elements: "+ al);
        // Removing specific element from arraylist
        al.remove("Robin");
        System.out.println("After invoking remove(object) method: "+ al);

        // Removing element based on the specific location
        al.remove(0);
        System.out.println("After invoking remove(index) method"+ al);

        // Creating another arraylist 
        ArrayList<String> al2= new ArrayList<String>();

        al2.add("Nami");
        al2.add("Emma");

        // Adding new elements to the arraylist
        al.addAll(al2);
        System.out.println("Updated List: "+ al);


        // Removing all the new elements from the arraylist
        al.removeAll(al2);
        System.out.println("After invoking removeAll() method: "+ al);

        // Removing elements on the basis of specified condition
        al.removeIf(str->str.contains("Vivi"));
        // above we are using the lambda expression
        System.out.println("After invoking removeIf() method: "+ al);
        // Removing all the elements available in the list
        al.clear();
        System.out.println("After invoking clear() method: "+ al);
    }
}
