
// Import the package
import java.sql.*;

  // Java Database Connectivity 

/*
 * 1. import --> java.sql
 * 2. load and register the driver --> com.mysql.jdbc.Driver
 * 3. Create connection --> COnnection
 * 4. Create a statement -->Statement
 *
 * 5. Execute the query --> 
 * 6. Process the results -->
 * 7. Close
 */


/**
 * JDBC_1
 */


public class App {
 

   public static void main (String[] args)   {
       // Load and register the driver
       try {
         Class.forName("com.mysql.cj.jdbc.Driver");
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
        System.out.println(e);
      } 

       //Create Connection
       String url= "jdbc:mysql://localhost:3306/sara";;
       String uname="root";
       String pass=" ";

       Connection con;
       Statement st;
      try {
         con = DriverManager.getConnection(url,uname,pass);
         st=con.createStatement();
          // Execute the query
       String query="select name from student where rollno=3";
       // st.executeQuery(query);


       // Store the result
       ResultSet rs=st.executeQuery(query);
       // has the power to store the chunk of data in tabular structure


       rs.next(); // to fetch the value we need to move the pointer to one step ahead as it will be pointing to the prev value in reality
       String name=rs.getString("name");

       System.out.println(name);


       st.close();
       con.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

     

      



   }
}

