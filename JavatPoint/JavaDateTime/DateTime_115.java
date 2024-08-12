
// Java SimpleDateFormat Example : String to Date
// Example - 4

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateTime_115 {

    public static void main(String[] args) {
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date=formatter.parse("31/03/2015");
            System.out.println("Date is: "+date);

        } catch (ParseException e) {
            System.out.println(e);

        }
    }
}
