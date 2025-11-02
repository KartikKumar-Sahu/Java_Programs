import java.sql.*;

public class Program199 {

    // Custom exception class for SQL operation failures
    static class QueryExecutionException extends Exception {
        public QueryExecutionException(String message) {
            super(message);
        }
    }

    // Method to execute insert, delete, and update operations
    static void executeSQLQueries() throws QueryExecutionException {
        Connection connection = null;
        Statement statement = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "root");

            statement = connection.createStatement();

            // INSERT operation
            int insertResult = statement.executeUpdate(
                    "INSERT INTO students (id, name, age) VALUES (1, 'John', 22)");
            if (insertResult == 0)
                throw new QueryExecutionException("Insert operation failed!");

            // UPDATE operation
            int updateResult = statement.executeUpdate(
                    "UPDATE students SET age = 23 WHERE id = 1");
            if (updateResult == 0)
                throw new QueryExecutionException("Update operation failed!");

            // DELETE operation
            int deleteResult = statement.executeUpdate(
                    "DELETE FROM students WHERE id = 1");
            if (deleteResult == 0)
                throw new QueryExecutionException("Delete operation failed!");

            System.out.println("✅ All SQL operations executed successfully!");

        } catch (ClassNotFoundException e) {
            throw new QueryExecutionException("Database driver not found: " + e.getMessage());
        } catch (SQLException e) {
            throw new QueryExecutionException("SQL Error: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("⚠️ Error closing resources: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        try {
            executeSQLQueries();
        } catch (QueryExecutionException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        }
    }
}
