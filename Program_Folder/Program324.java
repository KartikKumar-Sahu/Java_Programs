import java.sql.*;
import java.util.Scanner;

public class Program324 {
    // ==== Database Configuration ====
    private static final String URL  = "jdbc:mysql://localhost:3306/php_demo?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1234@Kaku";

    // Table name
    private static final String TABLE_NAME = "sample_users";

    // IMPORTANT: Include the primary key and only one base table, no joins
    private static final String SELECT_SQL =
            "SELECT id, name, email, created_at FROM " + TABLE_NAME;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Connecting to database...");
            try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
                 Statement stmt = conn.createStatement(
                         ResultSet.TYPE_SCROLL_SENSITIVE,
                         ResultSet.CONCUR_UPDATABLE);
                 ResultSet rs = stmt.executeQuery(SELECT_SQL)) {

                conn.setAutoCommit(false); // use transactions

                // Show how many rows exist (helps user pick row numbers)
                int totalRows = countRows(rs);
                System.out.println("✅ Connected. Current row count: " + totalRows);

                // ---------- INSERT ----------
                System.out.println("\n--- INSERT NEW ROW ---");
                System.out.print("Enter name to insert: ");
                String insName = sc.nextLine().trim();
                System.out.print("Enter email to insert: ");
                String insEmail = sc.nextLine().trim();

                rs.moveToInsertRow();
                rs.updateString("name", insName);
                rs.updateString("email", insEmail);
                rs.insertRow();
                rs.moveToCurrentRow();
                conn.commit();
                System.out.println("✅ Inserted row: [name=" + insName + ", email=" + insEmail + "]");

                // Refresh the result set view (some drivers may need a requery; here we try simple reposition)
                rs.beforeFirst();
                totalRows = countRows(rs);
                System.out.println("Row count after insert: " + totalRows);

                // ---------- UPDATE ----------
                System.out.println("\n--- UPDATE A ROW ---");
                System.out.print("Enter the row number to update (1.." + totalRows + "): ");
                int updRowNum = readInt(sc);
                if (goToRow(rs, updRowNum)) {
                    int currentId = rs.getInt("id");
                    String oldName = rs.getString("name");
                    String oldEmail = rs.getString("email");

                    System.out.println("Selected Row " + updRowNum + " -> id=" + currentId
                            + ", name=" + oldName + ", email=" + oldEmail);

                    System.out.print("Enter new name (leave blank to keep '" + oldName + "'): ");
                    String newName = sc.nextLine();
                    if (newName.isEmpty()) newName = oldName;

                    System.out.print("Enter new email (leave blank to keep '" + oldEmail + "'): ");
                    String newEmail = sc.nextLine();
                    if (newEmail.isEmpty()) newEmail = oldEmail;

                    rs.updateString("name", newName);
                    rs.updateString("email", newEmail);
                    rs.updateRow();
                    conn.commit();
                    System.out.println("✅ Updated row id=" + currentId + " to [name=" + newName + ", email=" + newEmail + "]");
                } else {
                    System.out.println("⚠️ Invalid row number. Skipping update.");
                }

                // Recount after potential update (not strictly necessary)
                rs.beforeFirst();
                totalRows = countRows(rs);
                System.out.println("Row count after update: " + totalRows);

                // ---------- DELETE ----------
                System.out.println("\n--- DELETE A ROW ---");
                System.out.print("Enter the row number to delete (1.." + totalRows + "): ");
                int delRowNum = readInt(sc);
                if (goToRow(rs, delRowNum)) {
                    int delId = rs.getInt("id");
                    String delName = rs.getString("name");
                    String delEmail = rs.getString("email");

                    System.out.println("About to delete Row " + delRowNum + " -> id=" + delId
                            + ", name=" + delName + ", email=" + delEmail);
                    System.out.print("Type 'YES' to confirm: ");
                    String confirm = sc.nextLine().trim();
                    if ("YES".equalsIgnoreCase(confirm)) {
                        rs.deleteRow();
                        conn.commit();
                        System.out.println("✅ Deleted row id=" + delId);
                    } else {
                        System.out.println("Deletion cancelled.");
                    }
                } else {
                    System.out.println("⚠️ Invalid row number. Skipping delete.");
                }

                // Final count
                rs.beforeFirst();
                totalRows = countRows(rs);
                System.out.println("\nFinal row count: " + totalRows);

            } catch (SQLException e) {
                System.err.println("❌ Database error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private static int countRows(ResultSet rs) throws SQLException {
        int current = rs.getRow();
        rs.last();
        int count = rs.getRow();
        if (current == 0) rs.beforeFirst(); else rs.absolute(current);
        return count;
    }

    private static boolean goToRow(ResultSet rs, int rowNum) throws SQLException {
        if (rowNum <= 0) return false;
        return rs.absolute(rowNum);
    }

    // Read an integer safely; also consume the trailing newline properly
    private static int readInt(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid integer: ");
            }
        }
    }
}
