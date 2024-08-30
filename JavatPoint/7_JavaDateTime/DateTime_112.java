
// Java DateFormat Example: getNumberFormat()
// GetNumberFormat Example

// important import statements

import java.text.DateFormat;
import java.text.NumberFormat;

public class DateTime_112 {
    // main methods
    public static void main(String[] args) {
        // getting the instance by invoking the getTimeInstance() method
        DateFormat dFormat=DateFormat.getTimeInstance(DateFormat.SHORT);

        // Invoking the method getNumberFormat()
        NumberFormat numFormat=dFormat.getNumberFormat();

        System.out.println("The format is: "+ numFormat);
        // returns the instance of NumberFormat for this DateFormat instance
        
    }
}
