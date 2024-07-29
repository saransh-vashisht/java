// for custom exception we can inherit from the parent exception class

class SaranshException extends Exception{ // we can also use the runtime exception instead of the normal exception as the parent class
   public SaranshException(String string){
    // the message that we have sent is in the constructor but the exception will go into the catch block
    // so to send the statement to the catch block we can use the statement to the parent class i.e. exception from there i can use it to get the output in the catch block
    super(string);
    // above statement will send the exception to the parent class and it will take care of itself

   } 
}


public class ThrowwCustomException {
    public static void main(String[] args) {
        
        int i=20;
        int j=0;

        try{
            j=18/i;
            if (j==0) {
                throw new SaranshException("I don't want to print zero");
            }
        }
            catch(SaranshException e){
                j=18/1;
                System.out.println("thats the default output"+e);
            }
            catch(Exception e){
                System.out.println("Something went wrong"+e);
            }

            System.out.println(j);
            System.out.println("Bye");
        }
       
    }

