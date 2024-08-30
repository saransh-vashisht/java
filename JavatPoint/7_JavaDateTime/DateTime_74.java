
// Java Instant Example: minus()
// Instant Example 3


import java.time.Duration;
import java.time.Instant;

public class DateTime_74 {
    public static void main(String[] args) {
        Instant instant=Instant.parse("2017-02-03T11:25:30.00Z");
        instant=instant.minus(Duration.ofDays(125));
        System.out.println(instant);

    }
}
