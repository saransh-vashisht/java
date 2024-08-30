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

// Import the package
import java.sql.*;
 /**
  * JDBC_1
  */
 public class JDBC_1 {
 
    public static void main (String[] args) throws Exception {
        // Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver"); 

        //Create Connection
        String url="jdbc:mysql://localhost:3306//aliens";
        String uname="root";
        String pass="";

        Connection con= DriverManager.getConnection(url, uname, pass);

        // Create a Statement
        Statement st=con.createStatement();

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



    }
 }