import java.io.IOException;

class M{
    void method() throws IOException{
        throw new IOException("device error");
    }
}


public class TestThrows2 {
    public static void main(String[] args) {
        try {
            M m= new M();
            m.method();
        } catch (Exception e) {
            System.out.println("Exception Handled");


        }
        System.out.println("normal flow...");
    }
    
}