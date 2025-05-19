import java.sql.*;
//  3. Write a JDBC program to delete the record of the student who lives in Kathmandu. 

public class JdbcDelete {
    public static void main(String[] args){
       try {
        Connection connection=DriverManager.getConnection(null, null, null);
        Statement statement=connection.createStatement();

        String sql="Delete from student where address='Ktm'";
        statement.executeUpdate(sql);
       } catch (Exception e) {
        System.out.println(e);
       }

    }
}
