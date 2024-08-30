import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class DateTime_28 {
    public static void main(String[] args) {
        MonthDay month=MonthDay.now();

        ValueRange r1= month.range(ChronoField.MONTH_OF_YEAR);
        System.out.println(r1);
        ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);
        System.out.println(r2);
        // we can get the value of the number of months and the number of days in the given day of month and it will help us in the giving how many is the range and we can store it in the ValueRange object and print the range
        
    }
}
