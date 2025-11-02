// Program317.java
import java.sql.*;

public class Program317 {
    private static final String URL  = "jdbc:mysql://localhost:3306/php_demo?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1234@Kaku";

    public static void main(String[] args) {
        // Optional pre-JDBC-4.0 explicit load:
        // Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            System.out.println("Connected!");
            try (Statement st = conn.createStatement();
                 ResultSet rs = st.executeQuery("SELECT NOW() AS server_time")) {
                if (rs.next()) System.out.println("Server time: " + rs.getString("server_time"));
            }
        } catch (SQLException e) {
            System.err.println("Connection failed. SQLState=" + e.getSQLState() + ", Code=" + e.getErrorCode());
            e.printStackTrace();
        }
    }
}
