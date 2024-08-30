
// Date Time formatter

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_24 {
    public static void main(String[] args) {
        // LocalDateTime parse=LocalDateTime.parse("2024-08-07T09:33:56:451");
        // we need to have the set method in it for now 
        LocalDate localDate=LocalDate.now();
        DateTimeFormatter myFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format=localDate.format(myFormatter);
        System.out.println(format);


        String date="25/03/1998";
        // we want this date as the local date 

        // LocalDate.parse(date);
        // it will give us exception we don't use date time formatter

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate parse1 =LocalDate.parse(date,dateTimeFormatter);
        System.out.println(parse1);
        // above this way we can get the localdate


        // datetimeformatter stuff
        // y-year
        // M-month of year
        // d-day of month
        // H-hour of day(0-23)
        // h- hour of am/pm(1-12)
        //m-minute of hour
        //s-second of minute
        //S - fraction of second
        // a- am/pm marker
        // E- day of week 
        // D- day of year
        //F-day of week in month
        //w- week of year
        //W-week of month
        // k-hour of day(1-24)
        // K-hour of am/pm(0-11)
        // z-time zone name
        // Z- time zone offset
        // XXX-offset

        // String dateTimeString="2023-04-24 10:30:45 IST";
        // the mapping can have different interpretation of time zones therefore it is better to use the offset
        String dateTimeString = "2023-04-24 10:30:45 +05:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss XXX");
        ZonedDateTime zonedDateTime=ZonedDateTime.parse(dateTimeString,formatter);
        System.out.println(zonedDateTime);



        

    }
}
