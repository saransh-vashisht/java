
import java.sql.*;

public class JDBC_5 {
    public static void main(String[] args) throws Exception {
        // whenever we will instantiate this object we will get the static block and whenever we will create the new ovject using new Pqr instance block will be created 

        // Pqr obj= new Pqr();

        // Now if we only want to call the static block
        // we can load the class
        Class.forName("Pqr");
        // here we are just intiating the object 

        Class.forName("Pqr").newInstance();
        // here we will instantiate the object and also we will create the new object


        //  we will use the class.forName to load the class in the jdbc 

        Class.forName("com.mysql.jdbc.Driver");

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        // above both lines are same 
        // class.forname will call the static block and the method registerDriver will register the driver 
        


    }
}

class Pqr{
    // Static block
    static{
        System.out.println("in Static");

    }

    // Instance block
    {
        System.out.println("In instance ");
    }
}
