
// Java Year Example isAfter()

// Example --> 5


import java.time.Year;

public class DateTime_55 {
    public static void main(String[] args) {
        Year y=Year.now();
        Year y1=Year.of(1996);
        boolean b1=y.isAfter(y1);
        System.out.println(b1);

    }
}
