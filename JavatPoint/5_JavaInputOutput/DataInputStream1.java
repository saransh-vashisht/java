import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStream1 {
    public static void main(String[] args) {
        InputStream input=null;
        try {
            input = new FileInputStream("testout1.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        DataInputStream inst= new DataInputStream(input);
        int count=0;
        byte[] arr = {};
        try {
            count = input.available();
            arr= new byte[count];
            inst.read(arr);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        
        for(byte bt:arr){
            char k= (char) bt;
            System.out.print(k+"-");
        }
        
    }
}
