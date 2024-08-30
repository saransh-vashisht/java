//Case 1: When an exception does not occur


public class TestFinallyBlock {
    public static void main(String[] args) {
        try {
            //below code do not throw any exception
            int data =25/5;
            System.out.println(data);
        } catch (NullPointerException e) {
            // catch won't be executed
            System.out.println(e);
            
        }

        //executed regardless of exception occurred or not
        finally{
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }
}
