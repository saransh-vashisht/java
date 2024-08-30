import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterInputStream1 {
    public static void main(String[] args) {

        File data = new File("filteroutputtestout.txt");
        FileInputStream input=null;
        try {
            input = new FileInputStream(data);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        FilterInputStream filter= new BufferedInputStream(input);
        int k=0;
        try {
            while ((k=filter.read())!=-1) {
                System.out.print((char) k);
                
                
            }
            input.close();
            filter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        

        
    }
}
