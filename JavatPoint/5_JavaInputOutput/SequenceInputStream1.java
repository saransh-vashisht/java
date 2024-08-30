import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStream1 {
    public static void main(String[] args) throws Exception {
        FileInputStream input1= new FileInputStream("testout1.txt");
        FileInputStream input2= new FileInputStream("testout3.txt");
        SequenceInputStream inst= new SequenceInputStream(input1,input2);

        int j;
        while ((j=inst.read())!=-1) {
            System.out.print((char)j);

        }
        inst.close();
        input1.close();
        input2.close();


    }
}
