
// Java Period Example:plus()
// Period Example 4

import java.time.Period;

public class DateTime_64{
    public static void main(String[] args) {
        Period period1=Period.ofMonths(5);
        Period period2=period1.plus(Period.ofMonths(2));
        System.out.println(period2);

    }
}