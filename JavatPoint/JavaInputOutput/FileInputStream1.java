// read single character

import java.io.FileInputStream;

public class FileInputStream1 {
    public static void main(String[] args) {

        try{
        FileInputStream fin= new FileInputStream("Testout.txt");
        int i=fin.read();
        // after executing the code we will be getting the single character read from the file and it will be in the binary form and to see it we will have to convert it into the character form
        
        System.out.println((char)i);
        fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    
}
