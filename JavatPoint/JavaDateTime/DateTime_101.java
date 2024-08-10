
// Java TimeZone class Example:getDisplayName()
// TimeZoneExample4


import java.util.TimeZone;

public class DateTime_101 {
    public static void main(String[] args) {
        TimeZone zone=TimeZone.getDefault();
        String name=zone.getDisplayName();
        System.out.println("Display name for default time zone: "+ name);

    }
}
