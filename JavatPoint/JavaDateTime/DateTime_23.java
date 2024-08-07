
// Period
// For the larger duration we  use the period of years and months

import java.time.LocalDate;
import java.time.Period;

public class DateTime_23 {
    public static void main(String[] args) {
       LocalDate now= LocalDate.now();
       LocalDate then= LocalDate.of(1990, 2, 2);
       Period period= Period.between(now, then);
       System.out.println(period);
    //    it gies us the difference

    // we can have period of 
    // period also have the get plus and compare to 
    
    }
}
