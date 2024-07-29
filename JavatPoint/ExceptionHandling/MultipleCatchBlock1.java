public class MultipleCatchBlock1 {
    public static void main(String[] args) {
        try {
            int a[]= new int[5];
            a[5]=30/0;
            // there are multiple exception in it but only one is executed  
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Arithmetic Exception occur");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofBoundsException Occurs");
        } catch(Exception e){
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
