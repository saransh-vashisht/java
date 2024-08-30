
    // DAO--> Data Acess Object

    import java.sql.*;




public class JDBC_6 {

    public static void main(String[] args) throws Exception  {

        StudentDAO dao= new StudentDAO();
       Student s1= dao.getStudent(12);
       
       System.out.println(s1.name);

        



       

       
    }
}

class StudentDAO{
    public Student getStudent(int rollno){
        Student s= new Student();
        s.rollno=rollno;
        try {
            String query="select name from student1 where rollno="+rollno;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sara", "root", "");
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        String name=rs.getString(1);
        s.name=name;
        
        return s;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;

        
    }
}


class Student{
    int rollno;
    String name;  
}


