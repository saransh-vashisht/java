
// Java YearMonth Example : minus()
// Java Example 5


import java.time.Period;
import java.time.YearMonth;

public class DateTime_60 {
    public static void main(String[] args) {
        YearMonth ym1=YearMonth.now();
        YearMonth ym2=ym1.minus(Period.ofYears(2));
        System.out.println(ym2);

    }
}
