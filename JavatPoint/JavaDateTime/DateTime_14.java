import java.time.LocalDateTime;

public class DateTime_14 {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
       LocalDateTime customDateTime= LocalDateTime.of(2017, 5, 17, 6, 40, 20);
       System.out.println(customDateTime);
       LocalDateTime parsedDateTime=LocalDateTime.parse("2023-01-11T14:24:49");
    //    we cannot use any other separator here instead of - for date & : for time
       System.out.println(parsedDateTime);


    }
}
