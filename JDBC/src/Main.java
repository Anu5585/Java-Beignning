import java.sql.*;
public class Main {
    public static void main(String[] args) {
//Step  :loading the drivers

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // ye path h
            System.out.println("Drivers Loaded....");
        } catch (ClassNotFoundException e) {
            System.out.println("Drivers Not Found On ClassPath");
        }

        try {
          Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/anas","root","admin");
            Statement stmt =  con.createStatement();
            String sql = "select * from user";
            ResultSet rs =  stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getInt("id"));
System.out.println(rs.getString("username"));
                System.out.println(rs.getString("password"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
