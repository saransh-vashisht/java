
//Java MonthDay Class Example: get()

import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class DateTime_27 {
    public static void main(String[] args) {
        MonthDay month=MonthDay.now();
       long n=month.get(ChronoField.MONTH_OF_YEAR);
    //    we can use the get method to get any value we want through this by using the ChronoField in it..
    // It will give us the month in the numerical format
       System.out.println(n); 

    }
}
