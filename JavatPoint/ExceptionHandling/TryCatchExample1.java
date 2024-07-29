public class TryCatchExample1 {
    public static void main(String[] args) {
        // int data = 50/0; // may throw exception

        try {
            int data =50/0;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("rest of the code");
        //here we have the exception arithmetic
    }
}
