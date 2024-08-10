
// java.sql.Date Example: void toInstant()

// importing main methods

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateTime_92 {
    // main method
    public static void main(String[] args) {
        // Creating an object of Calendar
        // by invoking the getInstance method 
        Calendar cln=Calendar.getInstance();
        // Setting the Month 
        // The months begin with 0 0 means January
        cln.set(Calendar.MONTH, 7);
        //Setting date 
        cln.set(Calendar.DATE, 12);
        // Setting year
        cln.set(Calendar.YEAR, 2021);
        // Creating an object of the class Date
        // with the mentioned time 
        Date d=cln.getTime();
        Instant instt=d.toInstant();
        System.out.println("The original Date is: "+ d.toString());
        System.out.println("The instant is: "+ instt);

    }
}
