import java.time.OffsetDateTime;

public class DateTime_34 {
    public static void main(String[] args) {
        OffsetDateTime offset=OffsetDateTime.now();
        System.out.println(offset);
        
        OffsetDateTime value=offset.plusDays(240);
        System.out.println(value);

    }
}
