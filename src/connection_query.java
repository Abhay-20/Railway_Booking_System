import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection_query {
    String url="jdbc:mysql://localhost:3306/railwaybookingdb";
    String username="root";
    String password="";
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(url,username,password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
