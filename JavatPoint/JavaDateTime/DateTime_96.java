
// Java Calendar Class Example:getMaximum()
// Example 4

import java.util.Calendar;

public class DateTime_96 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        int maximum=calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in week: "+ maximum);
        maximum=calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum numbers of weeks in year: "+ maximum);
        
    }
}
