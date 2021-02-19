import java.sql.*;

public class TaskConnectToBase {


    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        String url="jdbc:postgresql://localhost:5437/testBaza";
        String username = "user";
        String password = "user12";


        connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        int result = statement.executeUpdate("insert into brands (id,name) values(1,'apple')");

        System.out.println(result);


    }




}
