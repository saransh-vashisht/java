
// Java EnumSet Example 2 
// allOf() and noneOf()

import java.util.*;

enum days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class EnumSet_2 {
    public static void main(String[] args) {
        Set<days> set1= EnumSet.allOf(days.class);
        System.out.println("Week Days: "+ set1);
        // it will contain all the elements of our enumset


        Set<days> set2= EnumSet.noneOf(days.class);
        System.out.println("Week Days:"+ set2);
        // it will  create an empty enumset of type days 

        Set<days> set3= EnumSet.range(days.MONDAY, days.FRIDAY);
        System.out.println("Week Days: "+ set3);
        

    }
}
