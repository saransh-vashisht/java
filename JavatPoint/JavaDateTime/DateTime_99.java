
// Java TimeZone class Example: getOffset()
// Example 2

import java.util.Calendar;
import java.util.TimeZone;

public class DateTime_99 {
    public static void main(String[] args) {
        TimeZone zone=TimeZone.getTimeZone("Asia/Kolkata");
        // we get the timezone from the string name 

        System.out.println("The Offset value of TimeZone: "+ zone.getOffset(Calendar.ZONE_OFFSET));
        // we use the offset value of the timezone
        // It gives the offset output in the milliseconds


    }
}
