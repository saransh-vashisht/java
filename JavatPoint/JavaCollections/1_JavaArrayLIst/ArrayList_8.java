
// Java ArrayList Serialization and Deserialization Example

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayList_8 {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();
        al.add("Nami");
        al.add("Boa");
        al.add("Vivi");

        try {
            //Serialization
            FileOutputStream fos= new FileOutputStream("file");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();
            // Deserialization
            FileInputStream fs= new FileInputStream("file");
            ObjectInputStream ois= new ObjectInputStream(fs);
            ArrayList list= (ArrayList)ois.readObject();
            System.out.println(list);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
