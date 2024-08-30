import java.io.IOException;

// Declare Exception
// In case we declare the exception, if exception does not occur, the code will be executed fine.
// In case we declare the exception and the exception occurs, it will be thrown at runtime because throws does not handle the exception.
// Let's see examples for both the scenario.

// A) If exception does not occur



class MIB{
    void method() throws IOException{
        System.out.println("device operation performed");
    }
}


public class TestThrows3 {
    public static void main(String[] args) throws IOException { //declare exception
        MIB m= new MIB();
        m.method();
        System.out.println("normal flow...");
    }
    
}
