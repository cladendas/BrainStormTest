import java.sql.*;

public class SQL {

    public static  void insertSQL(String date, String a, String b, String c) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "postgres");

            PreparedStatement ps = connection.prepareStatement("INSERT INTO decision VALUES(?, ?, ?, ?)");
            ps.setString(1, date);
            ps.setString(2, a);
            ps.setString(3, b);
            ps.setString(4, c);
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}