
// Get Current Date & Time: java.util.Calendar --> 10
// The calendar class can be used to get the instance of the Date class
// The getTime() method of the Calendar class returns the instance of java.util.Date
// The Calendar.getInstance() method returns the instance of the Calendar class 

import java.sql.Date;

public class DateTime_132 {
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();

        // Creating a new object of the class Date
        Date date= new Date(millis);
        System.out.println(date);
        
    }
}
