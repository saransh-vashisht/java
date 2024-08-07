// Date Time Example

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_19 {
    public static void main(String[] args) {
        LocalDateTime datetime1=LocalDateTime.of(2017, 1, 14, 10, 34);
        LocalDateTime dateTime2= datetime1.plusDays(120);
        System.out.println(datetime1);
        System.out.println(dateTime2);
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatDateTime=dateTime2.format(format);
        System.out.println("After Formatting:"+ formatDateTime);

    }
}
