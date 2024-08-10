
// Java Month Enum :plus()
// Month Enum Example 4


import java.time.LocalDate;
import java.time.Month;

public class DateTime_85 {
    public static void main(String[] args) {
        Month month=Month.from(LocalDate.now());
        System.out.println(month.plus(2));

    }
}
