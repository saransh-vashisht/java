
// java.sql.Date Example: void setTime()


// important import statements
import java.util.Calendar;
import java.util.Date;
// java.sql.Date Example: void setTime()

public class DateTime_90 {
    // main method
    public static void main(String[] args) {
        // A date object is created with the specified time.
        Date d= new Date();
        System.out.println("Initial date is:"+ d); 
        // setting the time for 1000000 milliseconds after 01 January,1970,00:00:00 GMT.
        d.setTime(1000000);
        // Printing the time 
        System.out.println("Date after the setting the time is: "+ d);

    }
}
