import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class DateTime_30 {
    public static void main(String[] args) {
        OffsetTime offset=OffsetTime.now();
        System.out.println(offset);
        int h= offset.get(ChronoField.HOUR_OF_DAY);
        System.out.println(h);
        int m=offset.get(ChronoField.MINUTE_OF_DAY);
        // No of minute of the entire day
        System.out.println(m);
        int s=offset.get(ChronoField.SECOND_OF_DAY);
        // No of second of the entire day
        System.out.println(s);

        OffsetTime CustomOffset=OffsetTime.of(5, 30, 18, 333, ZoneOffset.of("+05:30"));
        // here we have defined the custom offset time
        System.out.println(CustomOffset);


    }
}
