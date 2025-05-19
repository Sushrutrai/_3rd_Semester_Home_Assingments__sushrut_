import java.sql.*;
//  4. Write a JDBC program to insert a record into a table named student using PreparedStatement.
public class PreparedStatementDemo {
    public static void main(String[]args){
     try{
        Connection connection=DriverManager.getConnection(null, null, null);
        PreparedStatement statement=connection.prepareStatement("insert into student (name,address) values(?,?)");

        statement.setString(1, "Nandini");
        statement.setString(2, "Ktm");

        statement.executeUpdate();

        connection.close();
        statement.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
