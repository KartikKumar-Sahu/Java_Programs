import java.sql.*;
import java.util.Scanner;

public class Program325 {
    // ==== Database Configuration (edit as needed) ====
    private static final String URL  = "jdbc:mysql://localhost:3306/php_demo?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1234@Kaku";

    // Table name
    private static final String TABLE_NAME = "sample_users";

    // SQL (all via PreparedStatement)
    private static final String SQL_SELECT_ALL =
            "SELECT id, name, email, created_at FROM " + TABLE_NAME + " ORDER BY id";
    private static final String SQL_INSERT =
            "INSERT INTO " + TABLE_NAME + " (name, email) VALUES (?, ?)";
    private static final String SQL_UPDATE_BY_ID =
            "UPDATE " + TABLE_NAME + " SET name = ?, email = ? WHERE id = ?";
    private static final String SQL_DELETE_BY_ID =
            "DELETE FROM " + TABLE_NAME + " WHERE id = ?";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             Connection conn = DriverManager.getConnection(URL, USER, PASS)) {

            System.out.println("✅ Connected to database.");
            conn.setAutoCommit(true); // set to false if you want manual transactions

            while (true) {
                printMenu();
                String choice = sc.nextLine().trim();

                switch (choice) {
                    case "1":
                        showAll(conn);
                        break;
                    case "2":
                        insertRow(conn, sc);
                        break;
                    case "3":
                        updateRow(conn, sc);
                        break;
                    case "4":
                        deleteRow(conn, sc);
                        break;
                    case "5":
                        System.out.println("Bye!");
                        return;
                    default:
                        System.out.println("⚠️ Invalid option. Try again.");
                }
                System.out.println(); // spacing
            }
        } catch (SQLException e) {
            System.err.println("❌ Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // ---- Menu ----
    private static void printMenu() {
        System.out.println("\n=== CRUD via PreparedStatement ===");
        System.out.println("1) Show all rows");
        System.out.println("2) Insert a row");
        System.out.println("3) Update a row (by id)");
        System.out.println("4) Delete a row (by id)");
        System.out.println("5) Exit");
        System.out.print("Choose: ");
    }

    // ---- SHOW ----
    private static void showAll(Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(SQL_SELECT_ALL);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n--- Rows in " + TABLE_NAME + " ---");
            boolean has = false;
            while (rs.next()) {
                has = true;
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Timestamp created = rs.getTimestamp("created_at");
                System.out.printf("ID: %-3d | Name: %-20s | Email: %-28s | Created: %s%n",
                        id, name, email, created);
            }
            if (!has) System.out.println("⚠️ No records found.");
        }
    }

    // ---- INSERT ----
    private static void insertRow(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter email: ");
        String email = sc.nextLine().trim();

        try (PreparedStatement ps = conn.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, name);
            ps.setString(2, email);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                try (ResultSet keys = ps.getGeneratedKeys()) {
                    if (keys.next()) {
                        int newId = keys.getInt(1);
                        System.out.println("✅ Inserted row with id=" + newId);
                    } else {
                        System.out.println("✅ Inserted row.");
                    }
                }
            } else {
                System.out.println("⚠️ Insert failed.");
            }
        }
    }

    // ---- UPDATE (by id) ----
    private static void updateRow(Connection conn, Scanner sc) throws SQLException {
        int id = askInt(sc, "Enter id to update: ");
        System.out.print("Enter new name (leave blank to keep existing): ");
        String name = sc.nextLine();
        System.out.print("Enter new email (leave blank to keep existing): ");
        String email = sc.nextLine();

        // If user leaves blank fields, fetch current values first
        String curName = null, curEmail = null;
        try (PreparedStatement get = conn.prepareStatement(
                "SELECT name, email FROM " + TABLE_NAME + " WHERE id = ?")) {
            get.setInt(1, id);
            try (ResultSet rs = get.executeQuery()) {
                if (rs.next()) {
                    curName = rs.getString("name");
                    curEmail = rs.getString("email");
                } else {
                    System.out.println("⚠️ No row with id=" + id);
                    return;
                }
            }
        }
        if (name.isEmpty()) name = curName;
        if (email.isEmpty()) email = curEmail;

        try (PreparedStatement ps = conn.prepareStatement(SQL_UPDATE_BY_ID)) {
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, id);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0
                    ? "✅ Updated id=" + id + " to [name=" + name + ", email=" + email + "]"
                    : "⚠️ Update affected 0 rows.");
        }
    }

    // ---- DELETE (by id) ----
    private static void deleteRow(Connection conn, Scanner sc) throws SQLException {
        int id = askInt(sc, "Enter id to delete: ");
        // Optional confirmation prompt
        System.out.print("Type YES to confirm deletion of id=" + id + ": ");
        String ok = sc.nextLine().trim();
        if (!"YES".equalsIgnoreCase(ok)) {
            System.out.println("Deletion cancelled.");
            return;
        }

        try (PreparedStatement ps = conn.prepareStatement(SQL_DELETE_BY_ID)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0
                    ? "✅ Deleted id=" + id
                    : "⚠️ No row deleted (id may not exist).");
        }
    }

    // ---- Helpers ----
    private static int askInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }
}
