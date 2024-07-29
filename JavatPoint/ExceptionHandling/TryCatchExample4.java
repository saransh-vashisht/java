
// resolving the exception in the catch block


public class TryCatchExample4 {
    public static void main(String[] args) {
        int i=50;
        int j=0;
        int data;
        try{

            data=i/j; //may throw exception
        }
        catch(Exception e){ //handling the exception
            //resolving the exception in catch block
            System.out.println(i/(j+2));
        }
    }
}
