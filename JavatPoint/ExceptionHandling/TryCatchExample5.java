public class TryCatchExample5 {
    public static void main(String[] args) {
        try {
            int data1=50/0; //may throw exception
        } catch (Exception e) {
            // TODO: handle exception
            //generating the exception in catch block
            int data2 =50/0;
            // exception can also happen in the catch block
        }

        System.out.println("rest of the code");

        // enclose exception code within a try block and use catch block only to handle the exceptions.
    }
}
