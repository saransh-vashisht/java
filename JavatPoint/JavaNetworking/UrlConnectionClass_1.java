import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class UrlConnectionClass_1 {
    public static void main(String[] args) {
        try {
            URL url= new URL("http://www.javatpoint.com/java-tutorial");
            URLConnection urlcon= url.openConnection();
            // using the openConnection method for the url class
            InputStream stream= urlcon.getInputStream();
            int i;
            while ((i=stream.read())!=-1) {
                System.out.print((char)i);

                
            }
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
}
