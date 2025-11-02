import java.sql.*;
import java.util.Scanner;

public class Program323 {
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row number you want to view: ");
        int rowNumber = scanner.nextInt();

        System.out.println("\nConnecting to database...");
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement(
                     ResultSet.TYPE_SCROLL_INSENSITIVE,  // enables random access
                     ResultSet.CONCUR_READ_ONLY);         // ensures no data changes
             ResultSet rs = stmt.executeQuery(SELECT_SQL)) {

            System.out.println("✅ Connection successful!");

            // Move to the requested row
            if (rs.absolute(rowNumber)) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Timestamp createdAt = rs.getTimestamp("created_at");

                System.out.println("\n--- Row " + rowNumber + " ---");
                System.out.println("ID       : " + id);
                System.out.println("Name     : " + name);
                System.out.println("Email    : " + email);
                System.out.println("Created  : " + createdAt);
            } else {
                System.out.println("⚠️ Invalid row number! No data found for row " + rowNumber + ".");
            }

        } catch (SQLException e) {
            System.err.println("❌ Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
