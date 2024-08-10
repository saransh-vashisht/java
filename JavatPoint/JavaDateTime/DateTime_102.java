
// Java TimeZone class:Example:getDefault()

//important import statement
import java.util.TimeZone;

public class DateTime_102 {
    // main method
    public static void main(String[] args) {
        // Invoking the getDefault() Method
        TimeZone zone=TimeZone.getDefault();
        System.out.println("The ID of the default TimeZone is: "+ zone.getID());

    }
}
