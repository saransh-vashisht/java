
// Example of Properties class to get all the system properties 

// By System.getProperties() method we can get all the properties of the system.

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaProperties_2 {
    public static void main(String[] args) {
        Properties p= System.getProperties();
        Set set=p.entrySet();
        Iterator itr=set.iterator();
        while (itr.hasNext()) {
           Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" = "+entry.getValue());

        }
    }
}
