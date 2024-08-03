import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamApiiMap {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);

        Function<Integer,Integer> fun= new Function<Integer,Integer>() {

            @Override
            public Integer apply(Integer n) {
                return n*2;
            }
            
        };

        // we can also shorten it using the lambda function

        Function<Integer,Integer> fun1= n->n*2;

        







        int result= nums.stream()
        .filter(n->n%2==0)
        .map(fun1)
        .reduce(0, (c,e)->c+e);


        // maps take the object of the functional interface Function which takes the two arguments
        // it also have only one method which is known as the apply 



// filter needs an object of a Predicate

System.out.println(result);


// for the reduce method we have the two parameters type and the operation which is binary operator and it is and functional interface which extends the BiFunction and it has the method called apply 
//  we will have two values which are known as the c carry and e element 
// c will start from zero and it will do sum of two digits and move on further ahead 


    }
}
