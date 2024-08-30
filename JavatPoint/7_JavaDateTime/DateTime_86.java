
// Java Month Enum Example:length()
// Month Enum Example -5


import java.time.LocalDate;
import java.time.Month;

public class DateTime_86 {
    public static void main(String[] args) {
        Month month=Month.from(LocalDate.now());
        System.out.println("Total Number of Days: "+ month.length(true));

    }

}
