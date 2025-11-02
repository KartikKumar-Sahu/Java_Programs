import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program319 {
    // ==== Database Configuration ====
    private static final String URL  = "jdbc:mysql://localhost:3306/php_demo?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1234@Kaku";

    // Table name (must already exist)
    private static final String TABLE_NAME = "sample_users";

    // SQL to insert a new row
    private static final String INSERT_SQL =
        "INSERT INTO " + TABLE_NAME + " (name, email) VALUES (?, ?)";

    public static void main(String[] args) {
        // Optionally take input from command-line arguments:
        // java Program319 "John Doe" "john@example.com"
        String name = (args.length > 0) ? args[0] : "Kartik Sahu";
        String email = (args.length > 1) ? args[1] : "kartik@gmail.com";

        System.out.println("Connecting to database...");
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL)) {

            // Set the parameters for the prepared statement
            pstmt.setString(1, name);
            pstmt.setString(2, email);

            // Execute the insert
            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("✅ A new user was inserted successfully!");
                System.out.println("Name: " + name + " | Email: " + email);
            } else {
                System.out.println("⚠️ No rows inserted.");
            }

        } catch (SQLException e) {
            System.err.println("❌ Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
