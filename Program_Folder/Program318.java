import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program318 {
    // ==== Configure these for your database ====
    // Example for MySQL:
    //   DB_URL format: jdbc:mysql://<host>:<port>/<database>?<params>
    private static final String URL  = "jdbc:mysql://localhost:3306/php_demo?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1234@Kaku";

    // Table to create
    private static final String TABLE_NAME = "sample_users";

    // MySQL-compatible DDL
    private static final String CREATE_TABLE_SQL =
        "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " ("
      + "  id INT NOT NULL AUTO_INCREMENT,"
      + "  name VARCHAR(255) NOT NULL,"
      + "  email VARCHAR(255) UNIQUE,"
      + "  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,"
      + "  PRIMARY KEY (id)"
      + ")";

    // --- If you use PostgreSQL, use this DDL instead ---
    // private static final String CREATE_TABLE_SQL =
    //     "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " ("
    //   + "  id SERIAL PRIMARY KEY,"
    //   + "  name VARCHAR(255) NOT NULL,"
    //   + "  email VARCHAR(255) UNIQUE,"
    //   + "  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
    //   + ")";

    public static void main(String[] args) {
        // Optional: allow overrides via args: url user pass table
        // e.g. java Program318 jdbc:mysql://localhost:3306/testdb root password my_table
        String url   = (args.length > 0) ? args[0] : URL;
        String user  = (args.length > 1) ? args[1] : USER;
        String pass  = (args.length > 2) ? args[2] : PASS;
        String table = (args.length > 3) ? args[3] : TABLE_NAME;

        String ddl = CREATE_TABLE_SQL.replace(TABLE_NAME, table);

        System.out.println("Connecting to DB: " + url);
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(ddl);
            System.out.println("Table '" + table + "' is ready (created if it did not exist).");

        } catch (SQLException e) {
            System.err.println("Error creating table: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
