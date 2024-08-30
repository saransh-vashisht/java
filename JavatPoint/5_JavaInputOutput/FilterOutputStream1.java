import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream1 {
    public static void main(String[] args) {
        File data= new File("filteroutputtestout.txt");

        FileOutputStream file=null;
        try {
            file = new FileOutputStream(data);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        FilterOutputStream filter= new FilterOutputStream(file);

        String s= "Welcome to Konoha";
        byte b[]= s.getBytes();
        try {
            filter.write(b);
            filter.flush();
            filter.close();
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        };
       
        

        System.out.println("Success");

        // gets the data through functuons using the binary array and then store it in the readable format
        
        
    }
}
