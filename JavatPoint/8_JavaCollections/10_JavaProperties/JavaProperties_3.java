
// Example of Properties Class to create the properties file

import java.io.FileWriter;
import java.util.Properties;

public class JavaProperties_3 {
    public static void main(String[] args)  throws Exception{
        Properties p= new Properties();
        p.setProperty("name", "Virat Kohli");
        p.setProperty("email", "VK@gmail.com");

        p.store(new FileWriter("info.properties"), "Java Properties Example");
    }
}
