import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayList_16 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Spliterator<String> spliterator=list.spliterator();

        // Iterate using Spliterator
        spliterator.forEachRemaining(System.out::println);
    }
}
