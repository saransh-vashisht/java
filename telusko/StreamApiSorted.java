import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiSorted {
    public static void main(String[] args) {

        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        Stream<Integer> sortedValues= nums.stream()
                                          .filter(n->n%2==0)
                                          .sorted();

// so we can use the sorted method to sort our result but we cannot use reduce as it gives us one final result value to be present there

        sortedValues.forEach(n->System.out.println(n));

        // if want to work with multiple threads at a time then we can use the parallel stream method that need to be used in it 

        Stream<Integer> sortedValues1= nums.parallelStream()
        .filter(n->n%2==0);


    }
}
