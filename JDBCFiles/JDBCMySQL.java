package JDBCFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMySQL {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/varshith"; // Database URL
        String user = "root";  // MySQL username
        String pass = "0000";  // MySQL password

        String query = "SELECT sname FROM student WHERE id = 1;"; // SQL Query

        try {
            // Ensure the MySQL JDBC driver is loaded (optional in newer versions)
            //Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing the connection to the database
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to MySQL database");

            // Create a statement and execute the query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Process the result
            if (rs.next()) {
                String name = rs.getString("sname"); // Ensure correct column name
                System.out.println("Student Name: " + name);
            } else {
                System.out.println("No records found.");
            }

            // Close the connection
            con.close();
            System.out.println("Connection Closed");

        } catch (Exception e) {
            // Catching and printing the exception
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace(); // Optionally print the stack trace for debugging
        }
    }
}
