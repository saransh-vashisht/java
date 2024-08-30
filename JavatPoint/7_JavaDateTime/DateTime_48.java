
// Java ZoneOffset Example : ofHours()
// Example - 2

import java.time.ZoneOffset;

public class DateTime_48 {
    public static void main(String[] args) {
        ZoneOffset zone=ZoneOffset.ofHours(5);
        System.out.println(zone);
        // Here we have done the zone offset of 5 hours from the utc time zone thus resulting the + 5:00 time zone

        ZoneOffset zone1= ZoneOffset.ofHours(-6);
        System.out.println(zone1);
        

    }
}
