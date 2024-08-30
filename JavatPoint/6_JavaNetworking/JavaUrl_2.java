import java.net.URL;

public class JavaUrl_2 {
    public static void main(String[] args) {
        try {
            URL url= new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
            System.out.println("Protocol: "+ url.getProtocol());
            System.out.println("Host Name: "+ url.getHost());
            System.out.println("Port Number: "+ url.getPort());
            System.out.println("Query String: "+ url.getQuery());
            System.out.println("Path: "+ url.getQuery());
            System.out.println("File: "+ url.getFile());


        } catch (Exception e) {
           System.out.println(e);
           
        }
    }
}
