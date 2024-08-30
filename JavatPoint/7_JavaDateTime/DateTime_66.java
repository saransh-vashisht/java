
// Java Duration Example : get()

// Duration Example1.java

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTime_66 {
    public static void main(String[] args) {
        Duration d=Duration.between(LocalTime.NOON,LocalTime.MAX);
        // LocalTime.NOON represents 12:00:00 PM.
        //LocalTime.MAX represents the latest time of the day, which is 23:59:59.999999999.
        System.out.println(d.get(ChronoUnit.SECONDS));
        // give us the in the form of the seconds


    }
}
