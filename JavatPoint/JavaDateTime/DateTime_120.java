
// Java Simple Date Format -8
// ApplyPattern()

// Important import statements

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime_120 {
    // Main method
    public static void main(String[] args) {
        // creating an object of the class SimpleDateFormat
        SimpleDateFormat sdf= new SimpleDateFormat();

        // Initializing the Calendar object 
        Calendar clndr=Calendar.getInstance();


        System.out.println("Initial Timings: "+ clndr.getTime());


        // Using the arg pattern
        String ar="dd/MM/yyyy HH:mm Z";

        // Using the Method applyPattern() to set the date to arg format

        sdf.applyPattern(ar);

        // For the current time and date
        String currDate=sdf.format(clndr.getTime());
        System.out.println("The Current Date is : "+ currDate);

        // Printing the pattern used 
        System.out.println("The Pattern applied is: "+ sdf.toPattern());


    }
}