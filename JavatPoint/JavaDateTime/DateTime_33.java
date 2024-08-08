
// Java OffsetDateTime Class Example: minusDays()

import java.time.OffsetDateTime;

public class DateTime_33 {
    public static void main(String[] args) {
        OffsetDateTime offset=OffsetDateTime.now();
        System.out.println(offset);
        OffsetDateTime value=offset.minusDays(240);
        System.out.println(value);


    }
}
