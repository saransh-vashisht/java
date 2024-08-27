
import java.io.FileReader;
import java.util.Properties;

/**
 * JavaProperties_1
 */
public class JavaProperties_1 {
public static void main(String[] args) throws Exception {
    FileReader reader= new FileReader("db.properties");

    Properties p= new Properties();
    p.load(reader);
    System.out.println(p.getProperty("user"));
    System.out.println(p.getProperty("password"));

    // If we change the value of the properties file , you don't need to recompile the java class which means there is no maintenance problem
    
    
}
    
}