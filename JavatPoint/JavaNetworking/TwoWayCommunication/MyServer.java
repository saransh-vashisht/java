package TwoWayCommunication;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {

        ServerSocket ss= null;
        Socket s= null;
        DataInputStream din=null;
        DataOutputStream dout=null;
        BufferedReader br= null;


        
        try {
            // Create a ServerSocket listening on port 3333
            ss= new ServerSocket(3333);

            // Wait for a client to connect
            s=ss.accept();

            // Create Input and Output Stream
            din= new DataInputStream(s.getInputStream());
            dout= new DataOutputStream(s.getOutputStream());
            br= new BufferedReader(new InputStreamReader(System.in));

            String str="", str2="";

            // Communicate with the client until stop is received
            while (!str.equals("stop")) {
                str=din.readUTF();
                System.out.println("client says: "+ str);
                str2= br.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }

        } catch (IOException e) {
        //   Handle any exception that occurs
          System.out.println(e);
        }finally{
           try {
            if (din!=null) din.close();
            if (dout!=null) dout.close();
            if (br!=null) br.close();
            if (s!=null) s.close();
            if (ss!=null) ss.close();
           } catch (Exception e) {
            System.out.println(e);
            
           }
        }
        
    }
}
