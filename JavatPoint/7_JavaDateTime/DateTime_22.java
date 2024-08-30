
// Duration --> It is the time difference b/w the two time zones

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTime_22 {
    public static void main(String[] args) throws InterruptedException {
        Instant start= Instant.now();
        Instant end=Instant.now();
       Duration d1= Duration.between(start, end);
    //    we can get duration b/w two instants using .between method 

        // we can have duration of milli ,nano etc and if we do not want to use them we can use the simple micro
        // for that we can use the of and then amount and then quantity we want using the chronounit 

        Duration d2= Duration.of(1,ChronoUnit.MILLIS);
        System.out.println(d1);
        System.out.println(d2);
        // we create duration bcz it has so many methods present in it 


        // Output
        // PT0S --> Period of Time and 0 sec 
        // to increase duration in above two we can do some work between like running large loop

        // PT0.001S ---> Period of Time and 1 millisecond

        // we can change duration to minutes hours etc 
        // we can also compare the two  // IF + ve value then d1 greater than d2
        // If -ve value is less than value in compare function
        // IF 0 then both values are same 


        // LocalDate a=LocalDate.now();
        // LocalDate b=LocalDate.now();
        // Duration duration1=Duration.between(a, b);
        // System.out.println(duration1);
        // it will give us error bcz we have taken no time component in it 

        LocalDateTime a=LocalDateTime.now();
        Thread.sleep(4000);
        LocalDateTime b=LocalDateTime.now();

        Duration duration1=Duration.between(a, b);
        System.out.println(duration1);
        // it will give us no difference in duration
        // but if we use the thread.sleep then we will get the difference 

        // Duration is used when we are using the seconds,minutes,hours 







    }
}
