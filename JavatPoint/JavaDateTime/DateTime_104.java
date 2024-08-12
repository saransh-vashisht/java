import java.text.DateFormat;
import java.util.Date;

public class DateTime_104 {
    public static void main(String[] args) {
        Date currentDate= new Date();
        System.out.println("Current Date: "+ currentDate);
        String dateToStr=DateFormat.getInstance().format(currentDate);
        // returns date/time formatter with short formatting style for date and time 
        // Format method will convert given Date object into string
        
        System.out.println("Date Format using getInstance(): "+dateToStr);

    }
}
