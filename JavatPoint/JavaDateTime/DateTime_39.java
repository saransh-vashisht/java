
// Java ZonedDateTime class Example: of() and withZoneSameInstant()

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime_39 {
    public static void main(String[] args) {
        LocalDateTime Idt=LocalDateTime.of(2017, Month.JANUARY, 19, 15, 26);
        ZoneId india=ZoneId.of("Asia/Kolkata");
        ZonedDateTime zone1=ZonedDateTime.of(Idt,india);
        System.out.println("In India Central Time Zone: "+ zone1);
        ZoneId tokyo=ZoneId.of("Asia/Tokyo");
        ZonedDateTime zone2=zone1.withZoneSameInstant(tokyo);
        // it gives us the instant of the given time zone from our own time zone
        
        System.out.println("In Tokyo Central Time Zone: "+ zone2);

    }
}
