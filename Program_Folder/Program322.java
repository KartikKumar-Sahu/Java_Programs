import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program322 {
    // ==== Database Configuration ====
     private static final String URL  = "jdbc:mysql://localhost:3306/php_demo?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1234@Kaku";

    // Table name
    private static final String TABLE_NAME = "sample_users";

    // SQL query to fetch all rows
    private static final String SELECT_SQL =
        "SELECT id, name, email, created_at FROM " + TABLE_NAME;

    public static void main(String[] args) {
        System.out.println("Connecting to database...");
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_SQL)) {

            System.out.println("✅ Connection successful!");
            System.out.println("\n--- Users in Table ---");

            boolean hasRows = false;
            while (rs.next()) {
                hasRows = true;
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String createdAt = rs.getString("created_at");

                System.out.printf("ID: %-3d | Name: %-20s | Email: %-25s | Created: %s%n",
                        id, name, email, createdAt);
            }

            if (!hasRows) {
                System.out.println("⚠️ No records found in the table.");
            }

        } catch (SQLException e) {
            System.err.println("❌ Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
