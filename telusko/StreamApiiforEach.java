import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApiiforEach {
    public static void main(String[] args) {
       List<Integer> nums= Arrays.asList(4,5,7,2,6,3); 
        // instead of using the nums.add method and adding the values one by one we can instead use the arrays.asList method which allows us to add all the values at once


        int sum=0;
        for (int n : nums) {
            if (n%2==0) {
                n=n*2;
                sum=sum+n;

            }
            // so here we are first getting the even values and then doin the doubling of the values and adding them into the sum variable to get the sum of doubled up even values

        }

        // we can shorten by using the stream API

        // here it will go the each value individually and will fetch it accordingly

        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));

        // }

        // here the array itself will gives you the value and the array will go into the n

        // for (int n : nums) {
        //     System.out.println(n);

        // }

        // we have better method which is known as the forEach method

        // nums.forEach(n -> System.out.println(n));


        // here it is the inherited method in the list and it will give one value of each instance and then we can do whatever we want to do to the value

        // Consumer<Integer> con= new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);

        //     }
        // };


        // Consumer is a functional interface so we can also use the lambda expression


        // Consumer<Integer> con= n -> System.out.println(n);

        // so now the consumer con object is referencing to the n->System.out.println(n);
        // therefore we will use it to give us the results without initiating the con object in the forEach method




        nums.forEach(n->System.out.println(n));
        // now this consumer method is giving us all the values 

        // this for eachmethod takes the consumer object as the input 





    }
}
