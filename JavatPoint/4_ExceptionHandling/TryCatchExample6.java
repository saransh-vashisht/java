// we will try to execute the different exception in different catch block

public class TryCatchExample6 {
    public static void main(String[] args) {
        try {
            int data=50/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println(e);
            // this catch block will not work bcz we are using arrayoutofbound exception and our code has the arithmetic exception
            


        }
        System.out.println("rest of the code");


    }
}
