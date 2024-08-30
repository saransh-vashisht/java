// Java Enum in Switch Statement
// Java Program to demonstrate the usee of enum
// in switch statement

public class Statement_15 {
    public enum Day{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
    public static void main(String[] args) {
        Day[] DayNow=Day.values();
        for(Day Now:DayNow){
            switch (Now) {
                case Sunday:
                    System.out.println("Sunday");
                    break;
                case Monday:
                    System.out.println("Monday");
                    break;
                case Tuesday:
                    System.out.println("Tuesday");
                    break;
                case Wednesday:
                    System.out.println("Wednesday");
                    break;
                case Thursday:
                    System.out.println("Thursday");
                    break;
                case Friday:
                    System.out.println("Friday");
                    break;
                case Saturday:
                    System.out.println("Saturday");
                    break;
            }
        }

    }
}
