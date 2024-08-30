import java.time.Clock;
import java.time.Duration;

public class DateTime_37 {
    public static void main(String[] args) {
        Clock c=Clock.systemUTC();
        System.out.println(c.instant());
        // to get the value of the time we use the instant method which gives us the instant of the given time period 
        
        Duration d=Duration.ofHours(5);
        Clock clock=Clock.offset(c, d);
        System.out.println(clock.instant());

    }
}
