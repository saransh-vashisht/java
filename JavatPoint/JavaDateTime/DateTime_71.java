import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTime_71 {
    public static void main(String[] args) {
        // 1. Temporal addTi(Temporal temporal)
        Duration duration=Duration.ofHours(2);
        LocalTime time=LocalTime.of(10, 0);
        LocalTime newTime= (LocalTime)duration.addTo(time);
        System.out.println(newTime);

        // 2.static Duration between(Temporal startInclusive,Temporal endExclusive)
        LocalTime start=LocalTime.of(10,0);
        LocalTime end=LocalTime.of(12,30);
        Duration duration2= Duration.between(start, end);
        System.out.println(duration2);

        //  3. long get(TemporalUnit unit)
        Duration duration3=Duration.ofHours(5);
        long hours=duration3.get(ChronoUnit.HOURS);
        long seconds=duration3.get(ChronoUnit.SECONDS);
        System.out.println("Hours:"+hours);
        System.out.println("Seconds: "+ seconds);
        
    }
}
