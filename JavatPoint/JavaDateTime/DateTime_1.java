// LocalDate -->Represent a date without time zone 

import java.time.LocalDate;
// It's now in java.time package earlier it was in java.util package
import java.time.Month;


public class DateTime_1{
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        System.out.println(now);
        // gives us the current system date using system clock

        LocalDate customDate=LocalDate.of(1990, 2, 7);
        // To get us the customDate we use the .of() method to set it in the year-month-day format

        int dayOfMonth = now.getDayOfMonth();
        // It gives us the day of the month of the current date
      Month month=  now.getMonth();
    //   It gives us the month of the current date
       int Year= now.getYear();
    //    it gives us the year of the current date
        int month1= now.getMonthValue();
        // to avoid using the month class we can use the getMonthValue to get the result in the form of the int
        // but it gives us the month number instead of the month name



       System.out.println(dayOfMonth);
       System.out.println(month);
       System.out.println(Year);
       System.out.println(month1);


       LocalDate today=LocalDate.now();
       System.out.println(today);
       LocalDate yesterday= today.minusDays(1);
       System.out.println(yesterday);
    //    we can use the localdate method of the object of .minusDays() to get us the days to be subtracted from the current date

        LocalDate pastDate=today.minusMonths(100);
        System.out.println(pastDate);
        // we can also subtract the months in the localdate

        LocalDate date1= today.minusWeeks(53);
        // we can subtract the weeks in the local date 
        System.out.println(date1);

        LocalDate date2=today.minusYears(22);
        System.out.println(date2);
        // we can subtract the number of years from our current date

        if (today.isAfter(yesterday)) {
            System.out.println("Han bhai");
            // ifAfter method tells us that the output is after the yesterday --> if it is then it returns true and if it is not then it returns false value 
            
            
        }

       



    }
}