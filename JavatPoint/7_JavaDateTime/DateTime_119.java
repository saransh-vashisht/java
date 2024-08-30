
// Java Simple DateFormat - 7
// parse()

// Important import statements

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime_119 {
    // main method
    public static void main(String[] args) {
        // creating an object of the class SimpleDateFormat
        SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yy");

        try {
            // Getting the instance of the class Calendar
            Calendar clndr= Calendar.getInstance();
            clndr.setTime(sdf.parse("11/12/21"));
            System.out.println("Initial Timing is: "+ clndr.getTime());

        } catch (Exception e) {
           System.out.println(e);
           
        }

    }
}
