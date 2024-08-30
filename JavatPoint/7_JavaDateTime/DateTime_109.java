
// Java DateFormat Example: getDateInstance(int style,Locale local)

// GetDateInstanceExample1.java

// Important Statements

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTime_109 {
    // Main methods
    public static void main(String[] args) {
        // locale is French here
        Locale Icl=Locale.FRENCH;

        // Creating an object of the class Date
        Date d= new Date();

        // Getting the instance by invoking the getDateInstance(int,Locale) method
        DateFormat dFormat=DateFormat.getDateInstance(DateFormat.SHORT,Icl);

        String str=dFormat.format(d);
        System.out.println(str);
        

        
    }
}
