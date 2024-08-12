
// Java DateFormat Example: String to Date

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateTime_106 {
    public static void main (String[] args) throws Exception {
     
            Date d=DateFormat.getDateInstance().parse("31 March,2015");
            System.out.println("Date is: "+ d);
    

        
    }
}
