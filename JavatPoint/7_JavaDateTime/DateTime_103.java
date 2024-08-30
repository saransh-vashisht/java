
// Java TimeZone class Example:setID()
// Timezone example 6


// Import important statement
import java.util.TimeZone;

public class DateTime_103 {
    // Main Method
    public static void main(String[] args) {
        // Creating an object of the class TimeZone
        TimeZone tz=TimeZone.getDefault();

        // Setting the time zone ID
        tz.setID("GMT +07:01");

        // CHecking for the time zone ID
        System.out.println("The Time Zone ID  is: "+tz.getID());

    }
}
