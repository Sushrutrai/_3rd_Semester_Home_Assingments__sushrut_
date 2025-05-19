//  2. Write a JDBC program to update the address of the student whose id is 2.
import java.sql.*;
public class JdbcUpdate {
    public static void main(String[] args) {
        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");

            Statement statement=connection.createStatement();
            String sql="Update student set address='Nepal' where id='2'";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
