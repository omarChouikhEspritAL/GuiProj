package Utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    public static DataSource data;
    private Connection con;
    private final String url = "jdbc:mysql://localhost:3306/JourneyWiseAdventuresBD";
    private final String user = "root";
    private final String pwd = "";

    private DataSource() {
        try {
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println(con);
            System.out.println("Connexion établie");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static DataSource getInstance() {
        if (data == null) {
            data = new DataSource();
        }
        return data;
    }

    public Connection getCon() {
        return con;
    }
}
