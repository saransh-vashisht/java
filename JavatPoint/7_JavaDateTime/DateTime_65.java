
// Java Period Example - 5
// Using various Period methods 

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class DateTime_65 {
    public static void main(String[] args) {
        // 1. of(int years,int months ,int days)
        Period period=Period.of(2, 3, 10); //Period of 2 years,3 months and 10 days
        System.out.println("Period: "+ period);

        // 2. getYears(),getMonths(),getDays()
        System.out.println("Years: "+ period.getYears());
        System.out.println("Months: "+period.getMonths());
        System.out.println("Days: "+period.getDays());


        //  3. between(LocalDate startDateInclusive,LocalDate endDateExclusive)
        LocalDate starDate=LocalDate.of(2020, 1, 1);
        LocalDate endDate=LocalDate.now();
        Period periodBetween=Period.between(starDate, endDate);
        System.out.println("Period between dates: "+ periodBetween);


        // 4. isZero()
        Period zeroPeriod=Period.of(0, 0, 0);
        System.out.println("Is the Period zero? "+ zeroPeriod.isZero());

        // 5. addTo(Temporal temporal)
        LocalDate addedDate=(LocalDate) period.addTo(LocalDate.of(2024, 1, 1));
        // so here we have used the localdate as the method for the way to inherit the date bcz the add to method uses the temporal object which can be object of localdate , localdatetime and zoneddatetime as they inherit it 
        // we will type cast it bcz we need to specify the which category of the temporal object we are needed to be used 

        System.out.println("Date after adding period: "+ addedDate);

        // 6. subtractFrom(Temporal temporal)
        LocalDate subtractedDate=(LocalDate) period.subtractFrom(LocalDate.of(2024, 1, 1));
        System.out.println("Date after subtracting period: "+ subtractedDate );

        // 7. minus(TemporalAmbount amountToSUbtract)
        Period minusPeriod=period.minus(Period.of(1, 1, 1)); //Subtract 1 year,1month and 1 day
        System.out.println("Period after subtracting: "+ minusPeriod);

        // 8.plus(TemporalAmount amountToAdd)
        Period plusPeriod=period.plus(Period.of(1, 1, 1));
        System.out.println("Period after adding: "+ plusPeriod);

        // 9. plusDays(long daysToAdd)
        Period plusDays=period.plusDays(10); //Add 10 days
        System.out.println("Period after adding 10 days: "+ plusDays);

        //  10. plusMonths(long monthsToAdd)
        Period plusMonths=period.plusMonths(5); //Add 5 months
        System.out.println("Period after adding 5 months: "+ plusMonths);

        //  11. plusYears(long yearsZToAdd)
        Period plusYears=period.plusYears(1); //add 1 year to period
        System.out.println("Period after adding 1 year: "+ plusYears);

        // 12. multipliedBy(int scalar)
        Period multipliedPeriod=period.multipliedBy(2); //multiply period by 2
        System.out.println("Period after multiplication: "+ multipliedPeriod);

        // 13. normalized()
        Period normalizedPeriod=Period.of(1, 25, 10).normalized(); //normalizes months to years
        System.out.println("Normalized period: "+ normalizedPeriod);

        // 14.negated()
        Period negatedPeriod=period.negated(); //Negated the period 
        System.out.println("Negated period: "+ negatedPeriod);
        // it represents the opposite duration of the original period 


        // 15. get(Temporal unit)
        long days=period.get(ChronoUnit.DAYS);
        System.out.println("Days part of the period: "+ days);

        //16. equals(Object obj)
        boolean isEqual=period.equals(Period.of(2, 3, 10)); //checks if the periods are equal 
        System.out.println("Is the period equal to (2 years,3 months,10 days)?"+ isEqual);

        // 17. getChronology()
        IsoChronology chronology=period.getChronology();
        // Gets the chronology(ISO calendar)
        // it gets the chronology associated with it 
        // it is ISO by default and also can be Japanese Gregorian

        System.out.println("Chronology: "+ chronology);

        // 18. getUnits()
        List<TemporalUnit> units=period.getUnits();
        // gets the units of the period(years,months,days)
        System.out.println("Units in period: "+ units);
        // gives us the units which are used in the period like the day month and year
        








    }
}
