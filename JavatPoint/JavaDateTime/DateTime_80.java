
// Java DayOfWeek Example:minus()
// Java DayOfWeek Example -4


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime_80 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2017, Month.JANUARY, 31);
        DayOfWeek day=DayOfWeek.from(date);
        System.out.println(day);

        day=day.minus(3);
        System.out.println(day.getValue());

    }
}
