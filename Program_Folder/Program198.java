import java.sql.*;

public class Program198 {

    // Custom exception for invalid database configuration
    static class DatabaseConfigurationException extends Exception {
        public DatabaseConfigurationException(String message) {
            super(message);
        }
    }

    // Method to connect to database with given credentials and driver path
    static void connectToDatabase(String driver, String url, String username, String password)
            throws DatabaseConfigurationException {
        Connection connection = null;
        try {
            // Load driver
            Class.forName(driver);

            // Try connecting
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Database connection established successfully!");

        } catch (ClassNotFoundException e) {
            throw new DatabaseConfigurationException("Database Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            throw new DatabaseConfigurationException("Failed to connect to Database: " + e.getMessage());
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
        // Example credentials — modify as needed
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "root";

        try {
            connectToDatabase(driver, url, username, password);
        } 
        catch (DatabaseConfigurationException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        }
    }
}
