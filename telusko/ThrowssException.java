
class AC{
    public void show() throws ClassNotFoundException{
        
       Class.forName("Sara");

       // instead of using the try catch block here then we can use the throws exception name and then it will pass it to its parent class to be handled
        
    }
}


public class ThrowssException {
    public static void main(String[] args) {
       AC obj= new AC();
    //    now to handle it here we will call the method in the try block
    try{
        obj.show();
    }
    catch(ClassNotFoundException e){
        e.printStackTrace();
        // it will give us the entire stack which will tell us about the which method is being called
    }
       
       // if we pass from main to the parent class then it will go to the jvm which will stop the program to stop working

    }
}
