import java.time.ZoneId;

public class DateTime_45 {
    public static void main(String[] args) {
        ZoneId z= ZoneId.systemDefault();
        String s=z.getId();
        // get Id will give us the zone id in the string format
        System.out.println(s);

    }
}
