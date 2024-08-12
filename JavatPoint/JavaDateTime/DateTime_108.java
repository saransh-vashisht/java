
// Java DateFormat Example: getDateInstance(int style)

// Import Important Statements
import java.text.DateFormat;
import java.util.Date;

public class DateTime_108 {
    // Main method
    public static void main(String[] args) {
        // Creating an object of the class Date
        Date d= new Date();

        // getting the instance by invoking the getDateInstance(int) method
        // here default locale is used 
        DateFormat dFormat=DateFormat.getDateInstance(DateFormat.SHORT);
        String str=dFormat.format(d);
        System.out.println(str);
        
        

    }
}
