package JDBCFiles;

import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) {
        /*
            import package
            load and register
            create connection
            create statement
            process the result
            close
         */

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String user = "postgres";
        String pass = "0000";

        try {
            // Load and register the PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            // Create a connection to the database
            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("Connected to PostgreSQL database");

            // It's a good practice to close resources like Connection when done
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            // Handle exceptions
            e.getMessage();
        }
    }
}
