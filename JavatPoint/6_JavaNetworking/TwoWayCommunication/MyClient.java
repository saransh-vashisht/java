package TwoWayCommunication;

import java.net.*;
import java.io.*;

public class MyClient {
    public static void main(String[] args) {
        Socket s = null;
        DataInputStream din=null;
        DataOutputStream dout=null;
        BufferedReader br= null;

        try {
            // Connect to the server at localhost on port 3333
            s= new Socket("localhost", 3333);

            // Create input and output stream
            din= new DataInputStream(s.getInputStream());
            dout= new DataOutputStream(s.getOutputStream());
            br= new BufferedReader(new InputStreamReader(System.in));

            String str ="", str2="";

            // Communicate with the server until "stop" is sent
            while (!str.equals("stop")) {
                str=br.readLine();
                dout.writeUTF(str);
                dout.flush();
                str2=din.readUTF();
                System.out.println("Server says"+ str2);

            }

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                if (din!=null) din.close();
                if (dout!=null) dout.close();
                if (br!=null) br.close();
                if (s!=null) s.close();
            } catch (IOException e) {
                System.out.println(e);
                
            }
        }

    }
}
