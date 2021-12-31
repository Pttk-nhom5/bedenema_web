package DAO;

import javax.servlet.http.HttpServlet;
import java.sql.*;

public class DAO {
    public String sql;
    public Statement st;
    public ResultSet rs;
    String jdbcUrl = "jdbc:mariadb://localhost:3306/bedenema_db";
    String username = "root";
    String password ="";
//    String jdbcUrl = "jdbc:mariadb://192.168.10.10:3306/bedenema_db";
//    String username = "homestead";
//    String password = "secret";
    Connection conn;


    public DAO() {

    }

    public void connect() throws SQLException {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
