import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class DateTime_82 {
    public static void main(String[] args) {
        Month month =Month.valueOf("January".toUpperCase());
        System.out.printf("For the month of %s all Sunday are: %n",month);
        LocalDate localDate=Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
        Month mi=localDate.getMonth();

        while (mi==month) {
            System.out.printf("%s%n",localDate);
            localDate=localDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
            mi=localDate.getMonth();

        }

    }
}

/**
 * 
This line of code is constructing a LocalDate object that represents the first Sunday of a specific month in the current year. Let’s break it down step by step:

Step-by-Step Explanation:
Year.now():

This method returns the current year as a Year object. For example, if the current year is 2024, this returns Year.of(2024).
.atMonth(month):

The atMonth(Month month) method of the Year class is used to create a YearMonth object from the current year and the specified month.
month is a Month enum value, which in this case is provided earlier in the code as Month.JANUARY (for example).
This results in a YearMonth object representing January 2024.
.atDay(1):

The atDay(int dayOfMonth) method of the YearMonth class is used to create a LocalDate object from the YearMonth object by specifying the day of the month.
1 represents the first day of the month.
This results in a LocalDate object representing January 1, 2024.
.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)):

The with(TemporalAdjuster adjuster) method of the LocalDate class is used to adjust the current date.
TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY) is a TemporalAdjuster that adjusts the date to the first occurrence of a specific day of the week (in this case, Sunday) in the month.
This means the code adjusts the LocalDate from January 1, 2024, to the first Sunday in January 2024.
Summary:
The code effectively creates a LocalDate representing the first Sunday of the specified month (Month.JANUARY) in the current year.
For instance, if the current year is 2024 and the month is January, this code would produce a LocalDate representing January 7, 2024, because that is the first Sunday in January 2024.
 */
