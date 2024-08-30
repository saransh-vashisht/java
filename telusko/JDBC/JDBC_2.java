import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


// printing the entire table 
public class JDBC_2 {
     public static void main(String[] args)  {
       String url="jdbc:mysql://localhost:3306/sara";
       String uname="root";
       String pass="";
       String query="select * from student";

       try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

       Connection con;
    try {
        con = DriverManager.getConnection(url, uname, pass);
        Statement st= con.createStatement();

       ResultSet rs=st.executeQuery(query);

       String userData="";

       while (rs.next()) { // shift the pointer to next row and true if there is another row 
        userData=rs.getInt(1)+" : "+rs.getString(2);
        System.out.println(userData);

        
       }


       rs.close();
       st.close();
       con.close();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

       

       
    }
}
