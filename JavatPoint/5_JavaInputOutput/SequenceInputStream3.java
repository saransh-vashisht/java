import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStream3 {
    public static void main(String[] args) throws IOException{
        //creating the FileInputStream objects for all the files

        FileInputStream fin = new FileInputStream("testout.txt");
        FileInputStream fin2= new FileInputStream("testout1.txt");
        FileInputStream fin3= new FileInputStream("testout3.txt");
        FileInputStream fin4= new FileInputStream("testout4.txt");

        // creating vector object to all the stream

        Vector<FileInputStream> v= new Vector<>();
        v.add(fin);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);

        // creating enumeration object by calling the elements method
        Enumeration<FileInputStream> e=v.elements();

        // passing the enumeration object in the constructor
        SequenceInputStream bin= new SequenceInputStream(e);
        int i=0;
        while ((i=bin.read())!=-1) {
            System.out.print((char)i);

        }
        bin.close();
        fin.close();
        fin2.close();
        fin3.close();
        fin4.close();
    }
}
