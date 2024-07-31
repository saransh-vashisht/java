import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream1 {
    public static void main(String[] args) {
        FileOutputStream file=null;
        try {
            file = new FileOutputStream("testout5.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        DataOutputStream data= new DataOutputStream(file);
        try {
            data.writeInt(65);
            data.writeBoolean(true);
            data.writeByte(100);
            data.writeShort(30000);
            data.writeInt(123456789);
            data.writeLong(9876543210L);
            data.writeFloat(12.34f);
            data.writeDouble(56.78);
            data.writeChar('A');
            data.writeUTF("Hello, DataOutputStream!");
            data.flush();
            data.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Success...");
        
    }
}
