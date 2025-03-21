package JDBCFiles;

import java.sql.*;

public class JDBCCURD {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "0000";

        String query = "INSERT INTO \"Student\" VALUES (4, 'John', 50);";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL database");

            Statement stmt = con.createStatement();

            // Use executeUpdate() for INSERT, UPDATE, DELETE
            boolean status = stmt.execute(query);
            System.out.println("Rows affected: " + status);

            con.close();
            System.out.println("Connection Closed");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Print the error message
        }
    }
}
