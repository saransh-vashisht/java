
    
// DAO--> Data Acess Object
//  we are inserting the values from our side to the database


import java.sql.*;



public class JDBC_7 {


    public static void main(String[] args) throws Exception  {

        StudentDAO dao= new StudentDAO();
        Student s2= new Student();
        s2.rollno=14;
        s2.name="Suryakumar Yadav";
        dao.connect();
        dao.addStudent(s2);

        



       

       
    }
}

class StudentDAO{

    Connection con=null;
    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sara", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Student getStudent(int rollno){
        Student s= new Student();
        s.rollno=rollno;
        try {
            String query="select name from student1 where rollno="+rollno;
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

    public void addStudent(Student s){
        // when we want to insert in the jdbc we go for the prepared statement 
        String query ="insert into Student1 values (?,?)";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, s.rollno);
            pst.setString(2, s.name);
            pst.executeUpdate();
        } catch (Exception e) {
          System.out.println(e);
        }
       


    }
}


class Student{
    int rollno;
    String name;  
}


