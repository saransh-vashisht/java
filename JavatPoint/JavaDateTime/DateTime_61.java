
// Java Period Example: addTo()
// Example --> 1

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class DateTime_61 {
    public static void main(String[] args) {
        Period period=Period.ofDays(24);
        System.out.println(period);
        Period period2=Period.ofMonths(6);
        System.out.println(period2);
        Period period3=Period.ofYears(15);
        System.out.println(period3);
        Period period4=Period.ofWeeks(23);
        System.out.println(period4);

        Temporal temp=period.addTo(LocalDate.now());
        // using this function we have added the number of days  of 24 to our current local date 


        System.out.println(temp);
    }
}
