// Local Time Example with time zone


import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime_13 {
    public static void main(String[] args) {
        // Zone Id gives us the various time zones
        ZoneId zone1=ZoneId.of("Asia/Kolkata");
        ZoneId zone2=ZoneId.of("Asia/Tokyo");

        // Localtime is now given for the cureent time for the specified time zones

        LocalTime time1= LocalTime.now(zone1);
        System.out.println("India Time Zone: "+ time1);
        LocalTime time2=LocalTime.now(zone2);
        System.out.println("Japan Time Zone"+ time2);
        // here we are calculating number of hours between the two time zones using the chronounit 
        long hours=ChronoUnit.HOURS.between(time1, time2);
        System.out.println("Hours between two time Zone"+ hours);

        // here we are calculating the number of minutes between the two time zones


        long minutes=ChronoUnit.MINUTES.between(time1, time2);
        System.out.println("Minutes between two time zone"+ minutes);

    }
}
