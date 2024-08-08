
// ZoneID Example1

import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime_43 {
    public static void main(String[] args) {
        ZoneId zoneid1=ZoneId.of("Asia/Kolkata");
        ZoneId zoneid2=ZoneId.of("Asia/Tokyo");
        System.out.println(zoneid1);
        System.out.println(zoneid2);
        LocalTime id1=LocalTime.now(zoneid1);
        LocalTime id2=LocalTime.now(zoneid2);
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id1.isBefore(id2));
        

    }
}
