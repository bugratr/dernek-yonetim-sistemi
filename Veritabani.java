import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Veritabani {
    private static Connection conn;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dernek_uye_yonetim_sistemi";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static Connection baglan() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void baglantiyiKapat() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
