import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class TryCatchExample8 {
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw=new PrintWriter("jtp.txt");
            // may throw exception
            pw.println("saved");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("File Saved Successfully");
    }
}
