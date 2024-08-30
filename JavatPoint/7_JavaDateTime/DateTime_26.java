
// Java MonthDay Class Example: isValidYear()

import java.time.MonthDay;

public class DateTime_26 {
    public static void main(String[] args) {
        MonthDay month=MonthDay.now();
        boolean b=month.isValidYear(2012);
        // It will check if the present date that is 8 august will be valid in the year 2012 or not 
        //  and it is mainly used to check the dates like the 29th feb and it is bcz the 29 feb is present only in leap year and in other yr it will not be valid

        System.out.println(b);

    }
}
