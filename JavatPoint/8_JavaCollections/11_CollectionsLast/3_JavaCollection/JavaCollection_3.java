
// Java Iterator Example

import java.util.ArrayList;
import java.util.Iterator;

public class JavaCollection_3 {
    public static void main(String[] args) {
        ArrayList<String> cityNames= new ArrayList<String>();

        cityNames.add("Delhi");
        cityNames.add("Mumbai");
        cityNames.add("Kolkata");
        cityNames.add("Chandigarh");
        cityNames.add("Noida");

        // Iterator to iterate the cityNames\
        Iterator itr=cityNames.iterator();

        System.out.println("CityNames Elements: ");

        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}
