import java.io.IOException;

class MIBB{
    void method() throws IOException{

        throw new IOException("device error");
    }
}



public class TestThrows4 {
    public static void main(String[] args) throws IOException {
        MIBB m= new MIBB();
        m.method();
        System.out.println("normal flow...");
    }
}
// if we do not handle it and throws to the jvm from the main block  and the exception error it will stop all the code to be working

