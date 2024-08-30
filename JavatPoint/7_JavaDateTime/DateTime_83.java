
// Java Month enum Example:getValue()
// MonthEnum Example 2


import java.time.LocalDate;
import java.time.Month;

public class DateTime_83 {
    public static void main(String[] args) {
        Month month=Month.from(LocalDate.now());
        System.out.println(month.getValue());
        System.out.println(month.name());

    }
}
