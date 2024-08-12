
// Java DateFormat Example : getDateTimeInstance(int dateStyle,int timeStyle,Locale locale)

// GetDateTime InstanceExample

// import important statements

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTime_110 {
    // main method
    public static void main(String[] args) {
        //  Locale is French here
        Locale Icl =Locale.FRENCH;
        // Creating an object of the class Date 
        Date d= new Date();
        // getting the instance by invoking the getDateTimeInstance(int,int,locale) method
        DateFormat dFormat=DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, Icl);

        String str= dFormat.format(d);
        System.out.println(str);
        
    }
}
