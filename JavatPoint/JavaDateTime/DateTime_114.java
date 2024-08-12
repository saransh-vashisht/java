
// Java Simple DateFormat Example 2

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime_114 {
    public static void main(String[] args) {
        Date date= new Date();
        SimpleDateFormat formatter= new SimpleDateFormat("MM/dd/YYYY");
        String strDate=formatter.format(date);
        System.out.println("Date Format with MM/dd/YYYY: "+ strDate);

        formatter= new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate=formatter.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+ strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate=formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy : "+ strDate);
        // it gives us the name of the month with 4 times M

        formatter=new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate=formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy zzzz : "+ strDate);
        // here we are getting the timezone in the full form to get the result

        formatter= new SimpleDateFormat("E,dd MMM yyyy HH:mm:ss z");
        strDate=formatter.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+ strDate);
        // here the E will give us the day of the week to be acquired 

        



    }
}
