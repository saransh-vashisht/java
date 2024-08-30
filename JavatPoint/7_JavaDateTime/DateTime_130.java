
// Get Current Date & Time --> 8
// java.util.Date
// Second Method to print the output

// Important import statements

import java.util.Date;

public class DateTime_130 {
    //main method
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();

        // Creating a new object of the class Date
        Date date= new Date(millis);
        System.out.println(date);
        
    }
}
