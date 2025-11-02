import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program320 {
    // ==== Database Configuration ====
    private static final String URL  = "jdbc:mysql://localhost:3306/php_demo?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1234@Kaku";

    // Table name (must exist)
    private static final String TABLE_NAME = "sample_users";

    // SQL to update a user’s email based on name
    private static final String UPDATE_SQL =
        "UPDATE " + TABLE_NAME + " SET email = ? WHERE name = ?";

    public static void main(String[] args) {
        // Optional command-line parameters:
        // java Program320 "NewEmail@example.com" "Alice Johnson"
        String newEmail = (args.length > 0) ? args[0] : "alice.updated@example.com";
        String name     = (args.length > 1) ? args[1] : "Alice Johnson";

        System.out.println("Connecting to database...");
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(UPDATE_SQL)) {

            // Set parameters for prepared statement
            pstmt.setString(1, newEmail);
            pstmt.setString(2, name);

            // Execute update
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("✅ Successfully updated " + rowsUpdated + " row(s).");
                System.out.println("Name: " + name + " | New Email: " + newEmail);
            } else {
                System.out.println("⚠️ No rows found with the given name: " + name);
            }

        } catch (SQLException e) {
            System.err.println("❌ Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
