public class MultipleCatchBlock5 {
    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayOutOfBoundsException occurs");
        }catch(Exception e){
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }

    //we generate NullPointerException, but didn't provide the corresponding exception type. In such case, the catch block containing the parent exception class Exception will invoked.

    //  if the exception that is happened is not present in the catch blocks then it will goes to the parent catch block
    
}
