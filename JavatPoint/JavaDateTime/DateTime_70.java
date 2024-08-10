
// Java Duration Example:plus()
// java duration example 5

import java.time.Duration;
import java.time.LocalTime;

public class DateTime_70 {
    public static void main(String[] args) {
        Duration d1=Duration.between(LocalTime.NOON,LocalTime.MAX);
        Duration d2=d1.plus(d1);
        System.out.println(d2.getSeconds());

    }
}
