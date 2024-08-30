
// Gives us the Local Time



import java.time.LocalTime;

public class DateTime_8 {
    public static void main(String[] args) {
        LocalTime now=LocalTime.now();
        // gives us the current local time 
        System.out.println(now);

        // Custom time 
        LocalTime customTime=LocalTime.of(14, 30, 30);
        System.out.println(customTime); 


        // We can have the custom time of only hours and minutes also

        LocalTime customTime1=LocalTime.of(14, 30);
        System.out.println(customTime1);

        // String to Localtime
        String timeINString="15:30:45";
        LocalTime parsedTime= LocalTime.parse(timeINString);
        System.out.println(parsedTime);


        // we can also do minus like in localDate
        LocalTime local=now.minusHours(1);
        System.out.println(local);


        if (now.isAfter(local)) {
            System.out.println("Han Bhai");

        }

        


        
        


    }
}
