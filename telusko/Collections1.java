
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;



import java.util.ArrayList;


public class Collections1 {
    public static void main(String[] args) {
        // Collection nums= new
        // Collection  interface belongs to the java.util package
        //  we can't use new collection bcz the collection is the interface
        // we can use anonymous class but it has so many different methods and we will have to define all of them

        // API is library or some feature that you have to use it
        

        // Collection nums= new ArrayList();
        // here we have not specified the datatype



        // Collection<Integer> nums= new ArrayList<Integer>();

        // to store integer numbers we have to use the integer class 
        // the type helps us remove the bugs of the code 
        // if we don't use it and we are using object and then convert the object into integer type through typecasting
        //  but what if we have added string alongside it then we will get the runtime exception
        // when we use type we will get the compile time error

        //  we cannot get the index value using collections
        // but list does have 
        // if we want to add and fetch values then the collection makes sense but if we want to work with indexes we can have list

        List<Integer> nums= new ArrayList<Integer>();
         


        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);
        // List allows the duplicate values 

        // now we get various list specific methods like the get,set and indexof

        System.out.println(nums.indexOf(2));


        System.out.println(nums);
        // WE CAN DIRECTLY print a collection
        

        // now to print value one by one
        for (int n : nums) {
            System.out.println(n);
        }

         System.out.println("Set starts here");
        
        Set<Integer> nums1= new HashSet<Integer>();

        nums1.add(62);
        nums1.add(54);
        nums1.add(82);
        nums1.add(21);
        nums1.add(62);
        // set do not have the duplicate values stored in it 
        // it also have the number values in random order whenever we output and also no index value in it

        // set- it is a collection of unique values

        for (int n : nums1) {
            System.out.println(n);
        }




        // to get all the sorted values we can use the TreeSet instead of the HashSet
        System.out.println("Treesort values below");
        Set<Integer> nums2= new TreeSet<Integer>();
        // we can use collection instead of set

        nums2.add(62);
        nums2.add(54);
        nums2.add(82);
        nums2.add(21);
        nums2.add(62);

        for (int n : nums2) {
            System.out.println(n);

        }


        // collection interface itself extends the iterator class so we will get the iterator method

        Iterator<Integer> values= nums.iterator();

        // to get all the values we will use the loop to iterate over all the elements this will help us in identifying the results
         
        while (values.hasNext()) {
            System.out.println(values.next());
        }

        // below will give us only one value 
        values.next();








        
        

    }
}
