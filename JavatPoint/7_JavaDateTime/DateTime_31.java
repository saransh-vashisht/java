
// Java OffsetTime Class Example: getHour()


import java.time.OffsetTime;
import java.time.ZoneOffset;

public class DateTime_31 {
    public static void main(String[] args) {
        OffsetTime offset=OffsetTime.now();
        int h=offset.getHour();
        System.out.println(h+" hour");
        int m=offset.getMinute();
        System.out.println(m+" minutes");
        int k=offset.getSecond();
        System.out.println(k+" seconds");
        int l=offset.getNano();
        System.out.println(l+" nanoseconds");
        ZoneOffset j=offset.getOffset();
        System.out.println(j+" Zone-Offset");
    }
}

