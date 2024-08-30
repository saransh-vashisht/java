
// Size and Capacity of an ArrayList

// Size and capacity of an arraylist are the two terms .

import java.util.ArrayList;

public class ArrayList_14 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<Integer>();
        System.out.println("The size of the array is: "+ al.size());


        ArrayList<Integer> al2= new ArrayList<Integer>(10);

        System.out.println("The size of the array is: "+ al2.size());

        // we see that the size is still 0 and the reason behind this is tht the number 10 represents the capacity not the size. The size represents the total number of elements present in the array 
        // As we have not added any element therefore, the size of the arraylist is zero in both programs

        // Capacity represents the total number of elements the array list can contain. Therefore the capacity of an arraylist is always greater than or equal to the size of the arraylist . 


        // When we add an element to the arraylist it checks whether the size of an array has become equal to the capacity or not . If yes , then the capacity of the arraylist is increased. 

        // By default capacity is 10.

        


    }
}
