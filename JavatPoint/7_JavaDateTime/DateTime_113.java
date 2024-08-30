
// Java SimpleDateFormat Example:Date to String
// Jave SimpleDateFormat Example -1

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTime_113 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
        String strDate=formatter.format(date);
        System.out.println(strDate);
        

    }
}
