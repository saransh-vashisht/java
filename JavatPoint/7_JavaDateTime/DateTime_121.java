
// Java Simple Date Format -9
// format()

// Important import statements

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime_121 {
    // main method
    public static void main(String[] args) {
        // creating an object of the class SimpleDateFormat
        SimpleDateFormat sdf= new SimpleDateFormat();

        // Initializing calendar Object
        Calendar clndr=Calendar.getInstance();

        System.out.println("The actual date is: "+ clndr.getTime());

        // use the format() method for the current time and date 
        String currDate=sdf.format(clndr.getTime());
        System.out.println("The Formatted date is: "+ currDate);
        // sdf.format(clndr.getTime()) formats the Date object into a string according to the default format of SimpleDateFormat. The result is a string representation of the date and time, formatted according to the default locale and format settings.

        //Note:
/*If you need specific date formats (e.g., "dd/MM/yyyy" or "yyyy-MM-dd"), you should provide a pattern when creating the SimpleDateFormat instance. For example:


SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
This would format the date as "day/month/year hour:minute
".
*/

    }
}
