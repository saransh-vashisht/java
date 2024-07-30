class UserDefinedException extends Exception{
     UserDefinedException(String message){

        // calling constructor of parent Exception
        super(message);
    }
}





//class that uses the above MyException
public class TestThrow3 {
    public static void main(String[] args) {
        try {
            //throw an object of user defined exception
            throw new UserDefinedException("this is user defined exception");
        } catch (Exception e) {
            System.out.println("Caught the exception");
            //Print the message from MyException onject
            System.out.println(e.getMessage());
        }
    }
    
}
