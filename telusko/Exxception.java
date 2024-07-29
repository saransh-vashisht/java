public class Exxception {
    public static void main(String[] args) {
        
      //  int i=0; //normal statement --> this types of statement is good bcz they have not much chance of going anything wrong

       // int j= 18/i; // this statement is a critical statement bcz it has chances of getting error in the code present
        // like if i is zero it will stop executing bcz of the arithmetic error and then it will stop executing the entire code altogether 
        // this is not good exception which needs to be handled 


        // handling part
        
        // int i =0;
        // int j=0;
        // try
        // {
        //     j=18/i;
        // }
        // catch(Exception e){
        //     System.out.println("Something went wrong");
        // }
        // to handle exception we can use the try catch block and it will not stop the executing of the code and we can try our critical statements in the try block and if they give error we can catch the exception as the exception object and can write some other alternative code that we want if we get the exception



        // to see if what exception we are having in the code


        // try
        // {
        //     j=18/i;
        // }
        // catch(Exception e){
        //     System.out.println("Something went wrong"+ e); // now we can see the error in the exception
        // }



        // now to try different type of exception

        // NOTE - once we get exception in the try block it will directly jump out of it and it will have the further code not executed in the block
        // so to check multiple critical statements it is more important for to use multiple try catch blocks


        int i=2;
        int j=0;
        
        int nums[]= new int[5];
        String str=null;

        // try {
        //     j=18/i;
        //     System.out.println(nums[1]);
        //     System.out.println(nums[5]);

        // } catch (Exception e) {
        //     System.out.println("Something went wrong" + e);
        //     // now here we are getting the index out of bounds error

        // }

        // now here when we are giving error is very anonymous and is giving no knowledge to the user and now to avoid this we will use another method to avoid the anonymous statement

        // to do this we can write the multiple catch blocks

        try {
            j=18/i;
            System.out.println(nums[1]);
            System.out.println(str.length());
            // now it is giving the null pointer exception to be present in it 
            System.out.println(nums[5]);

        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Cannot divide by zero");
            // now here we are handling the arithmetic exception well and also the arithmeticoutofbound exception
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limits");
        } 
        catch(Exception e)
        {
            //if we are not sure what exception it can arise so we can use the generalized exception catch block to catch the exception
            // exception is the parent class of all the lower child classes like the arithmetic exception and the arrayoutofbounds exception

            System.out.println("Something went wrong.."+e);
        }
        // if we put the catch block of the exception on the top then it will get an error bc it can handle everything as other exception is parent class 

        // we should put the parentclass at the end

        // exception heirarchy
        //  arithmetic exception --> runtime exception --> exception --> throwable 

        
   


        
        






        System.out.println(j); 


        System.out.println("Bye");
    }
}
