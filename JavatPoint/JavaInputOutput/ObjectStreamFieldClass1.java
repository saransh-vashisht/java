import java.io.ObjectStreamClass;
import java.util.Calendar;

public class ObjectStreamFieldClass1 {
    public static void main(String[] args) {
        
        // create a new object stream class for Integers
        ObjectStreamClass osc= ObjectStreamClass.lookup(String.class);

        // get the value field from ObjectStreamClass for integers
        System.out.println(""+ osc.getField("value"));
        // it is returning null bcz it is in the protected class of string
        

        //create a new object stream class for Calendar
        ObjectStreamClass osc2= ObjectStreamClass.lookup(Calendar.class);

        // get the class instance for osc2

        System.out.println(""+ osc2.getField("isTimeSet"));
    }
}
