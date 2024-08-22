
/*
 * Converting Array to List
 * We can convert the Array to List by traversing the array and adding the element in list one by one using list.add() method 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface_3 {
    public static void main(String[] args) {
        // Creating Array 
        String[] array= {"Java", "Python","PHP","C++"};
        // System.out.println(array);
        // above we will get the array object and not the elements of the array

        System.out.println("Printing Array: "+Arrays.toString(array));

        // Converting Array to List 
        List<String> list= new ArrayList<String>();
        for (String lang : array) {
            
            list.add(lang);
        }

        System.out.println("Printing List: "+ list);


    }
}
