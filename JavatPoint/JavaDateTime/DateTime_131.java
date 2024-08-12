
// Get Current Date: java.sql.Date -->9

// Sql date can print the current date but does not print the time 
//the date instance is generally used to save the current date in the database

import java.sql.Date;

public class DateTime_131 {
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();

        // creating a new object of the class Date 
        Date date= new Date(millis);
        System.out.println(date);
        
    }
}
