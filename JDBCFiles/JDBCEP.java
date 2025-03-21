package JDBCFiles;

import java.sql.*;

public class JDBCEP {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String user = "postgres";
        String pass = "0000";

        String query = "SELECT \"Sname\" FROM \"Student\" WHERE \"SID\" = 1;";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to PostgreSQL database");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String name = rs.getString("Sname");
                System.out.println("Student Name: " + name);
            } else {
                System.out.println("No records found.");
            }

            con.close();
            System.out.println("Connection Closed");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
