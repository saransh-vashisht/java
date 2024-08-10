
// Java Year Example: atDay()
// Example - 2


import java.time.LocalDate;
import java.time.Year;

public class DateTime_52 {
    public static void main(String[] args) {
        Year y= Year.of(2017);
        LocalDate l=y.atDay(137);
        // we can get the date of any specified year using the year method 
        System.out.println(y);
        System.out.println(l);

    }
}
