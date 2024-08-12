
// Get Current Date and Time - 2
// SimpleDateFormat class is also used for formatting date and time 
// it is old approach

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime_124 {
    public static void main(String[] args) {
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date=new Date();
        System.out.println(formatter.format(date));
        
    }
}
