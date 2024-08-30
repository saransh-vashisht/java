
// LocalDateExample1 


import java.time.LocalDate;

public class DateTime_2 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalDate yesterday=date.minusDays(1);
        // substracts the day in it 
        LocalDate tommorow=date.plusDays(2);
        // adds the days to the current date
        System.out.println("Today date:"+ date);
        System.out.println("Yesterday date: "+ yesterday);
        System.out.println("Tommorrow date: "+ tommorow);

    }
}
