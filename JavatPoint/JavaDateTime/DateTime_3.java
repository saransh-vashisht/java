// LocalDate Example2 

import java.time.LocalDate;

public class DateTime_3 {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2017, 1, 13);
        System.out.println(date1.isLeapYear());
        LocalDate date2= LocalDate.of(2016, 9, 23);
        System.out.println(date2.isLeapYear());
        // isLeapYear is used to check if the date of our year is leapyear or not and the .of method is used to set out custom date in the local date method 
        
    }
}
