
// Java DateFormat Example: getCalender()
// GetCalendarExample

// import important statements
import java.text.DateFormat;


public class DateTIme_111 {
    // main methods
    public static void main(String[] args) {
    
        // getting the instance
        DateFormat dFormat=DateFormat.getDateTimeInstance();
        // Invoking the method getCalendar()
        System.out.println(dFormat.getCalendar());
        // returns an instance of Calendar for this DateFormat Instance


    }
}
