// LocalDate example 7

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;


public class DateTime_7 {
    public static void main(String[] args) {
        LocalDate d1= LocalDate.now();
        LocalDate d2= LocalDate.of(2018, 12, 30);

        int d3= d1.compareTo(d2);

        System.out.println(d3);

        int year= d1.get(ChronoField.YEAR);
        int month= d1.get(ChronoField.MONTH_OF_YEAR);
        int day= d1.get(ChronoField.DAY_OF_MONTH);

        System.out.println("Year: "+ year);
        System.out.println("Month: "+month);
        System.out.println("Day: "+ day);

        DayOfWeek day3= d1.getDayOfWeek();
        System.out.println(day3);
        // dayofWEEK gives us the day of the week as result 
        // it will give us the value in the form of enum 

        // it gives us which day of the year our date is 

        int day4= d1.getDayOfYear();
        System.out.println(day4);

        // It gives us how many days are in this given month
        int MonthLength=d1.lengthOfMonth();
        System.out.println(MonthLength);

        // It gives us how many days are happened in the whole year in our current date
        int YearLength=d1.lengthOfYear();
        System.out.println(YearLength);

        




    }
}
