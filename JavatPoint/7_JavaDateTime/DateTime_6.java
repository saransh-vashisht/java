import java.time.LocalDate;

public class DateTime_6 {
    // String to LocalDate in java8
    public static void main(String[] args) {
        // Example 1
        String dlnStr= "2011-09-01";
        LocalDate d1= LocalDate.parse(dlnStr);
        // parse method is used to convert the local date in the string to the localDate format
        System.out.println("String to LocalDate: "+ d1);
        // Example 2
        String dlnStr2="2015-11-20";
        LocalDate d2= LocalDate.parse(dlnStr2);
        System.out.println("String to LocalDate: "+ d2);

    }
}
