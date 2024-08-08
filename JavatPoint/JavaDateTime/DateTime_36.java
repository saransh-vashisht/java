
// Java Clock class Example: systemUTC()

import java.time.Clock;

public class DateTime_36 {
    public static void main(String[] args) {
        Clock c=Clock.systemUTC();
        // systemUTC is used to set the clock to the UTC time zone

        System.out.println(c);

        System.out.println(c.instant());
        // it will give us the instant of the time

    }
}
