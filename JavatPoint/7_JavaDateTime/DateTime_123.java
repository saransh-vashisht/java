
// Get Current Date And Time - 1
// Using LocalDateTime and the DateTimeFormatter

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_123 {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        System.out.println(dtf.format(now));

    }
}
