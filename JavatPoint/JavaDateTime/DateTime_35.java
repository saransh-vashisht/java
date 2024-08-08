
// Java Clock class Example: getZone()
// ClockExample1.java


import java.time.Clock;

public class DateTime_35 {
    public static void main(String[] args) {
        Clock c=Clock.systemDefaultZone();
        // it gives us the system default time zone of our clock

        System.out.println(c);
        System.out.println(c.getZone());
        // get zone will give us the zone of the clock


    }

}
