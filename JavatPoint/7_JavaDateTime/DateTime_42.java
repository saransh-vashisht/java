
// Java ZonedDateTime class Example: plus()


import java.time.Period;
import java.time.ZonedDateTime;

public class DateTime_42 {
    public static void main(String[] args) {
        ZonedDateTime zone=ZonedDateTime.now();
        ZonedDateTime p=zone.plus(Period.ofDays(126));
        System.out.println(p);

    }
}
