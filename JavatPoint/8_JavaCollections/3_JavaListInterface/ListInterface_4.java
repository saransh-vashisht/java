
// Converting List to Array 
/*
 * We can convert the List to Array by calling the list.toArray() method 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface_4 {
    public static void main(String[] args) {
        List<String> fruitList= new ArrayList<String>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");

        // Converting ArrayList to Array 
        String[] array= fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Printing Array: "+ Arrays.toString(array));
        System.out.println("Printing List: "+ fruitList);

        /*
         *
         * 1.  Purpose: This line converts the ArrayList (fruitList) into an array of String type and stores it in the array variable.

        2. fruitList.toArray(new String[fruitList.size()]):

            toArray(T[] a) Method: The toArray method converts the list into an array. It takes an array of the same type as the list elements as an argument. If the array passed to the method has enough size, the list elements are stored in it; otherwise, a new array is created with the size of the list.

            new String[fruitList.size()]: This creates a new array of type String with a length equal to the size of the list (fruitList.size() returns the number of elements in the list). This array is passed to the toArray() method.

        The toArray() method will either fill this array if its size is sufficient, or create a new array of the required size and return it. In this case, since the size matches, the list elements are copied directly into this array.

        Result: The elements of the fruitList are now stored in the array variable, which is a regular array of type String[]. You can print it or manipulate it like any other array.
         */


      

    }
}
