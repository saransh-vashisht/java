
// LocalDateExample - 4 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime_5 {
    public static void main(String[] args) {
        // Converting LocalDate to String
        // Example 1
        LocalDate d1=LocalDate.now();
        String d1Str=d1.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date 1 in string: "+ d1Str);
        // Example 2
        LocalDate d2= LocalDate.of(2002, 05, 01);
        String d2Str= d2.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date 2 in string: "+ d2Str);
        // Example 3
        LocalDate d3=LocalDate.of(2016, 11, 01);
        String d3Str=d3.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date 3 in string: "+ d3Str);


    }
}
