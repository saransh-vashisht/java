
// inserting the value in the table

import java.sql.*;

public class JDBC_3 {
    



    public static void main(String[] args)  {
        String url="jdbc:mysql://localhost:3306/sara";
        String uname="root";
        String pass="";
        String query="insert into student values(4,'Suryakumar')";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Connection con;
        try {
            con = DriverManager.getConnection(url, uname, pass);
            Statement st=con.createStatement();

            int count=st.executeUpdate(query);
    
            System.out.println(count+" row/s affected");
    
    
            st.close();
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

      




        // DDl,DML,DQL
        // DDL - Data definition language - it is when we want to change the structure of the language 
        //  DML- Data Manipulation table - it is used when we want to change the value of the table --> inserting new valye , updating value and deleting value 
        // executeUpdate it will be used in dml and give us value that we have gotten the rows we have using affected in int 

        // DQL - data query language it is used to fetch the data from the sql 

        // Executequery is used for the dql bcz it returns the object of the result set 

        // TCL - transaction control language  -- to grant permission and to revoke the permission




       

       
    }
}


