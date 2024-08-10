
// Java DayOfWeek Example : getValue()
// DayOfWeek Example 5

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime_81 {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2021, Month.SEPTEMBER, 13);
        DayOfWeek dayOfWeek=DayOfWeek.from(localDate);
        int val=dayOfWeek.getValue();
        System.out.println("Int value of "+dayOfWeek.name()+" - "+ val);
    }
}
