
// Java DateFormat Example: getTimeInstance(int style,Locale locale)

// GetTimeInstance Example 1

// Important statements

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTime_107 {
    // Main method
    public static void main(String[] args) {
        // locale is French here 
        Locale Icl=Locale.FRENCH;

        // creating an object of the class Date
        Date d= new Date();

        // getting the instance by invoking the getTimeInstance(int,Locale) method 
        DateFormat dFormat=DateFormat.getTimeInstance(DateFormat.SHORT,Icl);
         String str=dFormat.format(d);
         System.out.println(str);
         System.out.println(dFormat);
         

    }
}
