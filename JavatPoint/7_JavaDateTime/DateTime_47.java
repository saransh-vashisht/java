
// Java ZoneOffset Example
// Example 1

import java.time.temporal.Temporal;
import java.time.*;

public class DateTime_47 {
    public static void main(String[] args) {
        ZoneOffset zone=ZoneOffset.UTC;
        System.out.println(zone);
        ZonedDateTime zone1=ZonedDateTime.now();
        System.out.println(zone1);

        Temporal temp=zone.adjustInto(zone1);
        System.out.println(temp);

    }
}
