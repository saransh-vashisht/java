
// Java Calendar Example: getMinimum()

import java.util.Calendar;

public class DateTime_97 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        int minimum=cal.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum number of days in week: "+ minimum);
        minimum=cal.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum number of weeks in year: "+minimum);

    }
}
