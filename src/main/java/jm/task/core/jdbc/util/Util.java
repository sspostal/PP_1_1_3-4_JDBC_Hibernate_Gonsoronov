package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static Connection conn = null;
    private static Util instance = null;
    private final static String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "snhX8xrL";

    private Util() {
        try {
            if (null == conn || conn.isClosed()) {
                conn = DriverManager
                        .getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Util getInstance() {
        if (null == instance) {
            instance = new Util();
        }
        return instance;
    }

    public Connection getConnection() {
        return conn;
    }
}
