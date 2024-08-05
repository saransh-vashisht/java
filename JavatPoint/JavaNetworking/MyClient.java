
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s= new Socket("localhost",6666);
            DataOutputStream dout= new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();

        } catch (UnknownHostException e) {
           System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}
