import java.io.IOException;

class TestThrowss{
    void m() throws IOException{
        throw new IOException("device error");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try {
            n();
        } catch (Exception e) {
           System.out.println("exception handled");

        }
    }
}




public class TestThrows1 {
    public static void main(String[] args) {
        TestThrowss obj = new TestThrowss();
        obj.p();
        System.out.println("normal flow");
        
    }
    
}
