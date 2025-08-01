import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String connectionString = System.getenv("AZURE_SQL_CONNECTIONSTRING");
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setURL(connectionString);
        try (Connection connection = ds.getConnection()) {
            System.out.println("Connected successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
