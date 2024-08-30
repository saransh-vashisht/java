
// Java Period Example:minus()
// Java Period Example 3


import java.time.Period;

public class DateTime_63 {
    public static void main(String[] args) {
        Period period1=Period.ofMonths(5);
        Period period2=period1.minus(Period.ofMonths(2));
        System.out.println(period2);

    }
}
