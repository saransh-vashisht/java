public class MultipleCatchBlock3 {
    public static void main(String[] args) {
        // only one exception is shown at a time even though we have multiple exception in out try block
        try {
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Arithmetic Exception occurs");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e){
            System.out.println("Parent Exception occurs");

        }

        System.out.println("rest of the code");
    }
}
