
// Java Year Example : length()
// Example -3

import java.time.Year;

public class DateTime_53 {
    public static void main(String[] args) {
        Year year=Year.of(2017);
        System.out.println(year.length());
        // we can get the length of the year in number of days through this 
        Year year1 =Year.of(2024);
        System.out.println(year1.length());

    }
}
