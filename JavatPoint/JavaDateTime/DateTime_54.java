
// Java Year Example:isLeap()
// Example -4


import java.time.Year;

public class DateTime_54 {
    public static void main(String[] args) {
        Year year=Year.of(2016);
        System.out.println(year.isLeap());
        Year year1=Year.of(2001);
        System.out.println(year1.isLeap());
    }
}
