
import java.io.FileOutputStream;

public class FileOutputStream1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout= new FileOutputStream("testout.txt");
            fout.write(65);
            fout.write(48);
            fout.close();
            // here it will first use the file output stream to convert the integer value in decimal to the binary and then use the ascii character encoding to write the character value

            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }

        
        
    }
}
