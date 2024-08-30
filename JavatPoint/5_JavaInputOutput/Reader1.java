import java.io.FileReader;
import java.io.Reader;

public class Reader1 {
    public static void main(String[] args) {
        try {
            Reader reader= new FileReader("output.txt");
            int data= reader.read();
            while (data!=-1) {
                System.out.print((char)data);
                data=reader.read();

            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
