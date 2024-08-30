
// Java LocalTime Example: plusHours() and plusMinutes()



import java.time.LocalTime;

public class DateTime_12 {
    public static void main(String[] args) {
        LocalTime time1= LocalTime.of(10, 43, 12);
        System.out.println(time1);
        LocalTime time2=time1.plusHours(4);
        LocalTime time3=time2.plusMinutes(18);
        System.out.println(time3);

    }
}
