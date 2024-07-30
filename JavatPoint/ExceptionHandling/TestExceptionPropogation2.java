import java.io.IOException;

class TestException2{
    void m() throws IOException{
        throw new java.io.IOException("device error");
//checked exception
    }
    void n() throws IOException{
        m();

    }
    void p(){
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled " + e.getMessage());
        }
    }
}






public class TestExceptionPropogation2 {
    public static void main(String[] args) {
       TestException2 obj= new TestException2();
       obj.p();
       System.out.println("Normal Flow"); 
    }
    
}
