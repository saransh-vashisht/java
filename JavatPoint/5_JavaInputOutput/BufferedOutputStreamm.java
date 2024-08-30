import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamm {

    public static void main(String[] args) throws Exception {
        FileOutputStream fout= new FileOutputStream("testout3.txt");
        BufferedOutputStream bout= new BufferedOutputStream(fout);
        String s= "Welcome to Comic-con";
        byte b[]= s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
        

    }
}
