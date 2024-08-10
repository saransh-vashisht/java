
// Java Duration Example : isNegative()
// Duration Example 2

import java.time.Duration;
import java.time.LocalTime;

public class DateTime_67 {
    public static void main(String[] args) {
        Duration d1=Duration.between(LocalTime.MAX,LocalTime.NOON);
        // NOON-MAX
        System.out.println(d1.isNegative());
        Duration d2= Duration.between(LocalTime.NOON, LocalTime.MAX);
        // MAX-NOON
        System.out.println(d2.isNegative());

    }
}
