// Month Day Example1 

import java.time.LocalDate;
import java.time.MonthDay;

public class DateTime_25 {
    public static void main(String[] args) {
        MonthDay month= MonthDay.now();
        System.out.println(month);
        LocalDate date=month.atYear(1994);
        System.out.println(date);

    }
}
