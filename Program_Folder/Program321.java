import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program321 {
    // ==== Database Configuration ====
    private static final String URL  = "jdbc:mysql://localhost:3306/php_demo?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1234@Kaku";

    // Table name (must exist)
    private static final String TABLE_NAME = "sample_users";

    // SQL to delete a row based on name
    private static final String DELETE_SQL =
        "DELETE FROM " + TABLE_NAME + " WHERE name = ?";

    public static void main(String[] args) {
        // Optional command-line argument:
        // java Program321 "Alice Johnson"
        String name = (args.length > 0) ? args[0] : "Kartik Sahu";

        System.out.println("Connecting to database...");
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(DELETE_SQL)) {

            // Set parameter for the prepared statement
            pstmt.setString(1, name);

            // Execute delete query
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("✅ Successfully deleted " + rowsDeleted + " row(s) for user: " + name);
            } else {
                System.out.println("⚠️ No user found with name: " + name);
            }

        } catch (SQLException e) {
            System.err.println("❌ Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
