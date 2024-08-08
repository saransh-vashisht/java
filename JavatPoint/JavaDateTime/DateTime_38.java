
// Java ZonedDateTime class Example

import java.time.ZonedDateTime;

public class DateTime_38 {
    public static void main(String[] args) {
        ZonedDateTime zone= ZonedDateTime.parse("2016-05-17T08:20:30+05:30");
        System.out.println(zone);
        ZonedDateTime zone1=ZonedDateTime.now();
        System.out.println(zone1);
    }
}
