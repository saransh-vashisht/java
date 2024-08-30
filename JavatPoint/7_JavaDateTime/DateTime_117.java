
// Java SimpleDateFormat Example -5
// get2DigitYearStart()

// Import important statements

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime_117 {
    // main method
    public static void main(String[] args) {
        // creating an object of the class SimpleDateFormat
        SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yy");

        try {
            // getting the instance of the class Calendar
            Calendar clndr=Calendar.getInstance();
            clndr.setTime(sdf.parse("11/12/41"));
            System.out.println("Initial Timing is: "+ clndr.getTime());

            // Setting 2020
            // using the set2DigitYear() method
            sdf.set2DigitYearStart(sdf.parse("02/02/2000"));
            System.out.println("The New Timing is: "+ clndr.getTime());

            // Using the method get2DigitYearStart() for checking the start year
            clndr.setTime(sdf.get2DigitYearStart());
            System.out.println("The start year is: "+ clndr.get(Calendar.YEAR));

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
