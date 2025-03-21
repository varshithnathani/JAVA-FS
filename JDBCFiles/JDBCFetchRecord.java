package JDBCFiles;

import java.sql.*;
public class JDBCFetchRecord {
    public static void main(String[] args) {

        String url="jdbc:postgresql://localhost:5432/Demo";
        String user="postgres";
        String pass="0000";

        String query = "select * from \"Student\";";

        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                System.out.print(rs.getInt(1)+"-");
                System.out.print(rs.getString(2)+"-");
                System.out.println(rs.getString(3));
            }

            con.close();

        }catch(Exception e){
            e.getMessage();
        }
    }
}
