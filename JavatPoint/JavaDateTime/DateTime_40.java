
// Java ZonedDateTime class Example: getZone()


import java.time.ZonedDateTime;

public class DateTime_40 {
    public static void main(String[] args) {
        ZonedDateTime zone=ZonedDateTime.now();
        System.out.println(zone.getZone());
        // it will give us the current time zone of our system

    }
}
