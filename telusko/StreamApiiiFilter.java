import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamApiiiFilter {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);

        Predicate<Integer> p= new Predicate<Integer>(){

            @Override
            public boolean test(Integer n) {
              
                // based on some condition it will return the value to be true or false in it 
                if (n%2==0) {
                    return true;
                } else {
                    return false;
                }
             

            }};
        // it is an functional interface which has an interface known as the test which will return us a boolean value 
        // if the value of our statement is true then it will go ahead and if not then it will stop

        // so the filter method use the logic of predicate to try to pass the value and also reduce the value in it 

        //  we can also reduce the code by using the lambda expression since it is the functional interface
        
        Predicate<Integer> p1= n-> n%2==0 ;

 

        int result= nums.stream()
                        .filter(p1)
                        .map(n-> n*2)
                        .reduce(0, (c,e)->c+e);


        // filter needs an object of a Predicate

        System.out.println(result);

    }
}
