
import java.io.*;


class TestThroww2{

    //function to check if person is eligible to vote or not
    public static void method() throws FileNotFoundException{
    FileReader file= new FileReader("C:\\Users\\Saransh\\Desktop\\abc.txt");
    BufferedReader fileinput= new BufferedReader(file);

    throw new FileNotFoundException();
    }
}


public class TestThrow2 {
    public static void main(String[] args) {
        try {
         
            TestThroww2 obj = new TestThroww2();
             obj.method();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("rest of the code...");
    }
    
}
