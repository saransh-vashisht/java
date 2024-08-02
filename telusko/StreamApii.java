import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApii {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);

        Stream<Integer> s1= nums.stream();
        // so we can use the stream to do things we want to do and it will also not change the original stream values present

        // Stream is basically an interface
        // .stream() method will return us with the stream object and to use this we can use the stream reference


        // s1.forEach(n->System.out.println(n));

        // here above we are printing the list with the help of the stream API

        // but if we  try to do some other operation on result

        // s1.forEach(n->System.out.println(n));

        // thus we cannot use the operation on the stream more than once


        //  we use the stream because it helps us in working with various methods at once 

        Stream<Integer> s2=s1.filter(n-> n%2==0);
        // here we are using s1.filter because it is giving us a new stream 
        // we can use the filter method to filter the values using our own logic that we want to 


        // s2.forEach(n->System.out.println(n));

        Stream<Integer> s3= s2.map(n->n*2);

        // here if we are using the map method  to double the value
        //  we can perform some operations on whatever value we get

        // s3.forEach(n->System.out.println(n));

        // there are some methods which will not give us the new stream but the last output

        // here we can use the reduce function to give us the result and it will give us the final value and not the result stream

       int results= s3.reduce(0,(c,e)-> c+e);

        System.out.println(results);


        // In the big data we can use it to get the use of this filter map reduce methods

        // the filter method is used to help us in filtering the values 

        // the map method is used to do the processing on the data 

        //  reduce method is used to make a graph out of it 

        //  and then we will print the result

//         The reduce method takes two arguments: an identity value and a BinaryOperator.

// Identity Value: 0 in this case. This is the starting value for the reduction. It's also the value that would be returned if the stream is empty.

// BinaryOperator: (c, e) -> c + e. This is a lambda expression that takes two parameters and returns their sum. Here, c is the accumulated value (initially 0), and e is the current element from the stream.


// Here are some examples of other reductions:

// Finding Sum:

// int sum = stream.reduce(0, Integer::sum);


// Finding Product:
// int product = stream.reduce(1, (a, b) -> a * b);


// Concatenating Strings:

// String concatenated = stream.reduce("", (a, b) -> a + b);

// The reduce method provides a powerful way to perform complex aggregations in a concise and readable manner.


// so by using the stream and filter ,map reduce methods we have done the same thing which we will do using the for loop and solving the problem of choosing even number and doubling them and adding the all values up 


List<Integer> nums1= Arrays.asList(4,5,7,3,2,6);

int result= nums1.stream()
                 .filter(n->n%2==0)
                 .map(n->n*2)
                 .reduce(0,(c,e)->c+e);


// here we have used the steam , map, reduce and filter all together to get us the results we wanted to be there 
// and it is much simpler than for loop and also than defining the values individually and giving the new stream every time


// the filter function needs an object of a predicate 

// Predicate  is an function interface of java.util.function and has an method called test and it returns the boolean value 

// if from a stream for a particular value  is true then it will go ahead and if false then gives us the false value



     
     
System.out.println(result);






















         





    }
}
