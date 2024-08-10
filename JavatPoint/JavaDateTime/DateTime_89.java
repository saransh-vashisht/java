
// Java String to java.sql.Date Example


import java.sql.Date;

public class DateTime_89 {
    public static void main(String[] args) {
        String str="2015-03-31";
        Date date=Date.valueOf(str);
        //converting string into sql date
        System.out.println(date);


    }
}
