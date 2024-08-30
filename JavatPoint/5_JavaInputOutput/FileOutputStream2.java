import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream2 {
    public static void main(String[] args) {
        

        try {
            FileOutputStream fout= new FileOutputStream("testout1.txt");

            String s= "Welcome to Javatpoint";
            byte b[]= s.getBytes(); //converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
}
