
// Java Vector Example 2

import java.util.Vector;

public class Vector_2 {
    public static void main(String[] args) {
        // Create an empty vector with initial capacity 4
        Vector<String> vec= new Vector<String>(4);
        // Adding Elements to vector
        vec.add("Virat");
        vec.add("Rohit");
        vec.add("Dhawan");
        vec.add("Rahane");

        // Check the size and capacity
        System.out.println("Size is: "+vec.size());
        System.out.println("Default Capacity is: "+ vec.capacity());


        // Display VEctor elements
        System.out.println("Vector element is: "+ vec);
        vec.addElement("Raina");
        vec.addElement("Jadu");
        vec.addElement("Mahi");

        // Again check size and capacity after two insertions
        System.out.println("Size after addition: "+vec.size()); 
        System.out.println("Capacity after addition is: "+vec.capacity());

        // Display Vector elements again
        System.out.println("Elements are: "+ vec);
        // Checking if Tiger is present or not in this vector 
        if (vec.contains("Rohit")) {
            System.out.println("Tiger is present at the index "+vec.indexOf("Rohit"));
        } else {
            System.out.println("Tiger is not present in the list.");
        }

        // Get the first element
        System.out.println("The first cricketer of the vector is = "+vec.firstElement());
        // Get the last element 
        System.out.println("The last cricketer of the vector is = "+vec.lastElement());


    }

}
