
// Java SimpleDateFormat Example -4
// Java Set2DigitYearStart method 

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime_116 {
    // Main method
    public static void main(String[] args) {
        // Creating an object of the class SimpleDateFormat
        SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yy");

        try {
            // getting the instance of the class Calendar
            Calendar clndr=Calendar.getInstance();
            clndr.setTime(sdf.parse("11/12/21"));
            System.out.println("Initial Timing is: "+ clndr.getTime());

            // Setting 2020
            // using the set2DigitYearStart() method
            // it will set the default start point of the date as we want it to be and change the java default date which is set and then it will choose the shorter format to be interpreted automatically starting from it
            

            sdf.set2DigitYearStart(sdf.parse("02/02/2000"));
            clndr.setTime(sdf.parse("02/02/15"));
            System.out.println("The New Timing is: "+ clndr.getTime());

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
