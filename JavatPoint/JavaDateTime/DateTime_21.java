
//Instant


import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime_21 {
    public static void main(String[] args) {
        // Purane jamane me hum isse istemal krte the and ye time milliseconds me deta tha 
        // aur ye january1,1970 UTC 12 midnight bje se ye difference ko milliseconds me dega



        long currentTimeMillis=System.currentTimeMillis();
        System.out.println(currentTimeMillis);


        Instant now=Instant.now();
        System.out.println(now);
        // ye hume time ko nanoseconds tk dega
        // Z is UTC 
        // it is in epoch 
        ZonedDateTime zoneDateTime= now.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println(zoneDateTime);
        // we can get the zoned date time in it 
        


    }
}
