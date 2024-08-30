
// Inserting values dynamically 
//  we use prepared statement for it 

// DAO --> Data Acess object -- pattern for use in the database acess

import java.sql.*;



public class JDBC_4 {
    


    public static void main(String[] args) throws Exception  {
        String url = "jdbc:mysql://localhost:3306/sara";
        String uname="root";
        String pass="";
        int rollno=6;
        String name="Hardik";

        String query="insert into student values (?,?)";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con=DriverManager.getConnection(url, uname, pass);

        PreparedStatement st=con.prepareStatement(query); // prepared statement 
        //  we will use the prepare statement for the dynamic updation

        st.setInt(1, rollno);
        st.setString(2, name);

        //  we do not have to use the query here to be executed 
        int count = st.executeUpdate();

        System.out.println(count+" row/s affected");

        st.close();
        con.close();

        



       

       
    }
}


