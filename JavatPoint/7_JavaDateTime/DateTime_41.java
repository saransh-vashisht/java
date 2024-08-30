
// Java ZonedDateTime class Example: minus()


import java.time.Period;
import java.time.ZonedDateTime;

public class DateTime_41 {
    public static void main(String[] args) {
        ZonedDateTime zone=ZonedDateTime.now();
        ZonedDateTime m=zone.minus(Period.ofDays(126));
        System.out.println(m);
        // zoned date time gives us the period of time at which we need to print our output 

    }
}
