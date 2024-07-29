public class Throww {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
            j=18/i;
            // for ex we are dividing here by number smaller than the 18 so we are getting the output as the value but if it is bigger than 18 then the output will be zero which will not be an exception but the issue is that it will have the zero output but what if we want to show it as an error as this value signify nothing
            if (j==0) {
                throw new ArithmeticException("I don't want to print zero"); //to solve this case we can do this where we are trying to create an error 
                // so if our value gets zero it will throw the error automatically 
                //  we can also pass the message we want to give as an argument

                
            }

        }
        catch(ArithmeticException e){
            // System.out.println("Cannot divide by zero");
            j=18/1;
            System.out.println("Thats the default output"+e);
            //  here we are trying to handle the exception
            // but what if we have case of 0 output then it will have no exception but what if we want to call the catch block without the exception to avoid the zero value
             
        }
        catch(Exception e){
            System.out.println("Something went wrong..."+e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
