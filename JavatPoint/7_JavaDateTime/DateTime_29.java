import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class DateTime_29 {
    public static void main(String[] args) {
        MonthDay month=MonthDay.now();
        System.out.println(month);
        MonthDay customMonthDay=MonthDay.of(5, 17);
        System.out.println(customMonthDay);
        int TodayDay=month.getDayOfMonth();
        System.out.println(TodayDay);
        Month currentMonth1=month.getMonth();
        System.out.println(currentMonth1);

        int currentMonthValue=month.getMonthValue();
        System.out.println(currentMonthValue);

        int currentMonthHashcode=month.hashCode();
        System.out.println(currentMonthHashcode);

        System.out.println(month.isAfter(customMonthDay));

        String str= month.toString();
        System.out.println(str);

        Month month3= Month.DECEMBER;
        MonthDay alteredMonth=month.with(month3);
        System.out.println(alteredMonth);
        // here we have altered the month from our current monthdate

        MonthDay alteredDayOfMonth=month.withDayOfMonth(17);
        System.out.println(alteredDayOfMonth);
        // we have altered the day of month from the current monthdate

        MonthDay alteredMonthWithNumericValue= month.withMonth(2);
        System.out.println(alteredMonthWithNumericValue);
        // we have altered the month with the use of the numeric value 
      
        
        // below we have used the datetime formatter
        // first we have used the datetimeformatter to get us the dateMonth in our specified format in the string
        DateTimeFormatter myFormatter=DateTimeFormatter.ofPattern("MM/dd");
        String format =month.format(myFormatter);
        System.out.println(format);

        // now we have used the datetimeformmater to convert the string of any specified format to the monthdate of the actual standard method of storing
        
        String MonthDate="08/03";
        MonthDay monthStringFormatter=MonthDay.parse(MonthDate, myFormatter);
        System.out.println(monthStringFormatter);





    }
}
