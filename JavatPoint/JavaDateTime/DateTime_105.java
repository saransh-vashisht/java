
// Date Format Example 2

import java.text.DateFormat;
import java.util.Date;

public class DateTime_105 {
    public static void main(String[] args) {
        Date currentDate= new Date();
        System.out.println("Current Date: "+ currentDate);
        String dateToStr=DateFormat.getInstance().format(currentDate);
        // gives us the instance i.e. the datetime format in the shorter form

        System.out.println("Date Format using getInstance(): "+ dateToStr);
        dateToStr=DateFormat.getDateInstance().format(currentDate);
        // gets current date for us 
        System.out.println("Date Format using getDateInstance(): "+ dateToStr);
        dateToStr=DateFormat.getTimeInstance().format(currentDate);
        // returns time for us
        System.out.println("Date Format using getTimeInstance: "+ dateToStr);

        dateToStr=DateFormat.getDateTimeInstance().format(currentDate);
        // It will give us the datetime in the normal instance
        System.out.println("Date Format using getDateTimeInstance(): "+dateToStr);

        dateToStr=DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);
        System.out.println("Date Format using getTimeInstance: "+dateToStr);
        // it will shorten the getTimeInstance to shows us only the hour and minutes in the time 

        dateToStr=DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
        System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+ dateToStr);
        // it will give us the date time format in the medium form and will help us have the medium size 
        // it will be same as the default getTimeInstance() .

        dateToStr=DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);
        System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+ dateToStr);
        // the getTimeInstance with the LONG date format will give us the result to be in longer format which will also include the timezone


        dateToStr= DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentDate);
        System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+ dateToStr);
        // it will give us first date to be in longer format and then the time to be in the shorter format
        








    }
}
