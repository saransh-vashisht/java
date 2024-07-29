public class TryCatchExample2 {
    public static void main(String[] args) {
        try{
            int data=50/0; //may throw an exception
            //if exception occurs the remaining statement will not execute


            // System.out.println("rest of the code");
            
            // here if we put all the code in the try block then it will not execute if we get exception
            //thats why put only the critical statement in the try block and rest of the code outside it 
        }
            //handling the exception
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
