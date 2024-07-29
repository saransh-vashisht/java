public class MultipleCatchBlock6 {
    public static void main(String[] args) {
        try {
            int a[]=new int[5];
            a[5]=30/0;
        } catch (Exception e) {
            System.out.println("Common Task Completed");
        } catch(ArithmeticException e){
            System.out.println("task 1 is completed");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("task 2 is completed");
        }
        System.out.println("rest of the code...");
    }
    // we will get the compile time error bcz it will directly go to parent class then it cannot execute the other child classes present
}
