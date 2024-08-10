
// java.sql.Date Example: void toLocalDate()

// Important import statement
import java.util.*;
import java.time.*;


public class DateTime_91 {
      // Main method 
    public static void main(String[] args) {
    //   Getting the instance of LocalDateTime
    LocalDateTime dtm=LocalDateTime.now();
    // Getting the LocalDate representation of the LocalDateTime
    // Using the toLocalDate() method
    System.out.println("This date is :"+ dtm.toLocalDate());
    
    }
}
