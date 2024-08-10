
// Java TimeZone class Example: getID()
// Java Timezone example 3

import java.util.TimeZone;

public class DateTime_100 {
    public static void main(String[] args) {
        TimeZone timeZone=TimeZone.getTimeZone("Asia/Kolkata");
        System.out.println("Value of ID is: "+ timeZone.getID());
    }
}
