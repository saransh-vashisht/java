
// LocalDateExample 3

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime_4 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2017, 1, 13);
        LocalDateTime datetime=date.atTime(1,50,9);
        System.out.println(datetime);
        // we can use the .atTime method to set the time on the date with it and making it the DateTime value 
        

    }
}
