
// Java Simple Date Format - 10
// toLocalizedPattern()

// Important import statements

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime_122 {
    // Main method
    public static void main(String[] args) {
        // Creating an object of the class SimpleDateFormat
        SimpleDateFormat sdf= new SimpleDateFormat();

        // Initializing Calendar Object
        Calendar clndr= Calendar.getInstance();
        System.out.println("The Date is: "+ sdf.format(clndr.getTime()));

        // Using the format() method for the formatting the Date to String
        System.out.println("The pattern in the DateFormatter is: "+ sdf.toLocalizedPattern());
        // it helps us in getting us the pattern that the format is using 
        


    }
}
