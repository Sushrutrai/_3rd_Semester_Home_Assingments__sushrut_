
import java.sql.*;
//  1. Write a JDBC program to insert 2 records into a table named student 
//   with fields id, name, and address then display the records using ResultSet.
public class JdbcInsert {
    public static void main(String[] args) throws SQLException{
        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");

            Statement statement=connection.createStatement();

            String sql="INSERT INTO student(name,address) Values('Rajes','Ktm'),('Rakes','Patan')";
            
            if(statement.executeUpdate(sql)>0){
                System.out.println("Data has been inserted.");
            }

            ResultSet result=statement.executeQuery("select* from student");
            while (result.next()) {
                System.out.println("name:"+result.getString("name")+" address: "+result.getString("address"));
            }
            
            connection.close();
            statement.close();
            result.close();
            } catch (SQLException e) {
                System.out.println(e);
        }
    }

}
