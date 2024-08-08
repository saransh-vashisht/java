
// Java OffsetDateTime Class Example: getDayOfMonth()
// OffsetDateTimeExample1.java

import java.time.OffsetDateTime;

public class DateTime_32 {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime= OffsetDateTime.now();
        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime.getDayOfMonth());
        System.out.println(offsetDateTime.getDayOfYear());
        System.out.println(offsetDateTime.getDayOfWeek());
        System.out.println(offsetDateTime.toLocalDate());

    }
}
