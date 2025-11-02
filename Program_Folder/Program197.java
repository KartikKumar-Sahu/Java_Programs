import java.sql.*;

public class Program197 {

    // Custom exception for database connection failure
    static class DatabaseConnectionException extends Exception {
        public DatabaseConnectionException(String message) {
            super(message);
        }
    }

    // Method to connect to the database
    static void connectToDatabase() throws DatabaseConnectionException {
        Connection connection = null;
        try {
            // Example: MySQL database connection
            String url = "jdbc:mysql://localhost:3306/testdb"; // Change DB name if needed
            String username = "root"; // Change username
            String password = "root"; // Change password

            // Register the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Attempt to connect
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Database connected successfully!");

        } catch (ClassNotFoundException e) {
            throw new DatabaseConnectionException("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            throw new DatabaseConnectionException("Failed to connect to database: " + e.getMessage());
        } finally {
            // Close connection if open
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("⚠️ Error closing connection: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        try {
            connectToDatabase();
        } catch (DatabaseConnectionException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        }
    }
}
