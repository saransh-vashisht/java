
// TreeSet Example 3

// Example to retrieve and remove the highest and lowest value 


import java.util.TreeSet;

public class TreeSet_4 {
    public static void main(String[] args) {
        TreeSet<Integer> set= new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("The Given TreeSet is: "+set);
        System.out.println("Lowest Value: "+ set.pollFirst());
        // PollFirst method gives us the smallest value and also removes it from the TreeSet
        System.out.println("The Given TreeSet is: "+set);
        System.out.println("Highest Value: "+ set.pollLast());
        // PollLast Method gives us the highest value and also removes it from the tree set
        
        System.out.println("The Given TreeSet is: "+set);


    }
}
