
// Java YearMonth Example:format()
// Example -->2



import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class DateTime_57 {
    public static void main(String[] args) {
        YearMonth ym=YearMonth.now();
        String s=ym.format(DateTimeFormatter.ofPattern("MM/yyyy"));;
        System.out.println(s);

        String s1="05/2024";
        YearMonth y1=YearMonth.parse(s1, DateTimeFormatter.ofPattern("MM/yyyy"));
        System.out.println(y1);


    }
}
