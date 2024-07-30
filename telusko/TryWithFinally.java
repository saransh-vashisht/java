import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithFinally {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // if we have the try block and we don't want to mention the catch block then we will use the finally statement instead of it

        // 
        int i=0;
        int j=0;

        try{
            j=18/i;
           
        }
        // if we have some statement that we want to be executed instead of we find exception or not we will use it finally block and it will be executed irrespective of the exception
        catch(Exception e){
            System.out.println("Something went wrong.");
        } 
        finally{
            System.out.println("Bye");
        }

        // above is the use of finally with the try catch

        // now we will see the try finally block that need to be executed 
        int num=0;
        BufferedReader br=null;
        try{
            // InputStreamReader in = new InputStreamReader(System.in);
            // now we need only object so we will shorten these lines
        //    br= new BufferedReader(in);

            br= new BufferedReader(new InputStreamReader(System.in));
            num=Integer.parseInt( br.readLine());

            // now we are getting an error bcz we are not handling the exception and we are just implementing the try block 
            
        }
        finally{
            // whenever we want to close the connection ,resource always use finally block 
            br.close();
            System.out.println("Bye");
        }

        // now in updated version of java we have gotten a much better advantage which is known as the try with resources instead of try finally


        try(BufferedReader br1= new BufferedReader(new InputStreamReader(System.in))){
            num= Integer.parseInt(br1.readLine());
            System.out.println(num);
        }
        // now here we do not have need to close the bufferedreader and we can close it automatically 
        // try with finally helps bcz we know wht resources we are closing
         
    }
}
