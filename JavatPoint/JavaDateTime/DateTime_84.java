
// Java Month Enum: minus()
// Month Enum Example 3


import java.time.LocalDate;
import java.time.Month;

public class DateTime_84 {
    public static void main(String[] args) {
        Month month=Month.from(LocalDate.now());
        System.out.println(month.minus(2));

    }
}
