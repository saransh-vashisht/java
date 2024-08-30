
// Java Simple DateFormat Example -6
// toPattern()

// important import statements

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime_118 {
    // main method
    public static void main(String[] args) {
        // creating an object of the class SimpleDateFormat
        SimpleDateFormat sdf= new SimpleDateFormat();

        // Initializing the Calendar object 
        Calendar clndr=Calendar.getInstance();

        // getting the Current date
        String currDate=sdf.format(clndr.getTime());

        System.out.println("Current Date: "+ currDate);

        // Using the toPattern() method
        // Displaying the Date Pattern

        System.out.println("The Date Pattern is: "+sdf.toPattern());
        // toPattern will give us the pattern in which our date is 
        

    }
}
