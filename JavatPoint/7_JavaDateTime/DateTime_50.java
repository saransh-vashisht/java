
// Java ZoneOffset Example : isSupported()
// Example - 4

import java.time.ZoneOffset;
import java.time.temporal.ChronoField;


public class DateTime_50 {
    public static void main(String[] args) {
        ZoneOffset zone =ZoneOffset.UTC;
        boolean b1=zone.isSupported(ChronoField.OFFSET_SECONDS);
        System.out.println(b1);
        boolean b2=zone.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println(b2);

    }
}


// Breakdown:
// ZoneOffset Creation:

// 
// 
// ZoneOffset zone = ZoneOffset.UTC;
// This creates a ZoneOffset object representing UTC (Universal Coordinated Time) with an offset of +00:00.
// Checking if ChronoField.OFFSET_SECONDS is Supported:


// boolean b1 = zone.isSupported(ChronoField.OFFSET_SECONDS);
// ChronoField.OFFSET_SECONDS is a field that represents the total offset from UTC in seconds (e.g., +3600 for +01:00).
// The isSupported() method checks if the ZoneOffset object supports this field. Since ZoneOffset specifically deals with offsets from UTC, it supports this field.
// The result is stored in b1, which should be true.
// Checking if ChronoField.SECOND_OF_MINUTE is Supported:


// boolean b2 = zone.isSupported(ChronoField.SECOND_OF_MINUTE);
// ChronoField.SECOND_OF_MINUTE represents the second within a minute (0–59).
// The isSupported() method checks if this field is supported by the ZoneOffset object. However, ZoneOffset doesn't deal with specific time components like seconds of a minute; it only deals with the offset in terms of whole hours, minutes, and seconds from UTC.
// Therefore, ZoneOffset does not support this field, and the result stored in b2 will be false.
// Output:
// System.out.println(b1); // Outputs: true
// System.out.println(b2); // Outputs: false
// b1 is true because ZoneOffset supports OFFSET_SECONDS.
// b2 is false because ZoneOffset does not support SECOND_OF_MINUTE.
