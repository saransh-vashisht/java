// Zoned Date Time

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateTime_20 {
    public static void main(String[] args) {
        // It is same as normal date time but it has the zone included in itself 
        // UTC--> Universal Time Coordinated 
        // UTC time is standard time zone
        // all other time zones are around this utc time zone
        // each zone is represented by zoneID

        ZonedDateTime now= ZonedDateTime.now();
        System.out.println(now);
        // it will also give us zones of our time and name of it 
       Set<String> getAvailableZoneIds= ZoneId.getAvailableZoneIds();
    
    //    getAvailableZoneIds.forEach(System.out::println);
    //    will give us all the available time zones as output

    ZonedDateTime newYorkTime=ZonedDateTime.of(2000, 12, 1, 2, 30, 30, 30, ZoneId.of("America/New_York"));
    // we can have the custom zoned date time
    System.out.println(newYorkTime);


    // In the Zoned Date time id we can also give the zoned date time to be used 
    ZonedDateTime indiaTime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
    System.out.println("Current time in India: "+ indiaTime);

    ZonedDateTime newYorkTime1=ZonedDateTime.now(ZoneId.of("America/New_York"));

    System.out.println("Current time in New York: "+ newYorkTime1);
    // above we got the time in India and New york

    // we can also get the zone like any other value 
    ZoneId zone=now.getZone();
    System.out.println(zone);

    // we can also use parse in similar way



       

    }
}
