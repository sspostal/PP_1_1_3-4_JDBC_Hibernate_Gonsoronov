package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private final static String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "snhX8xrL";
    public static void main(String[] args) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
//            statement.addBatch("INSERT INTO user(name, lastName, age) VALUES ('batch1','desc', 5)");
//            statement.addBatch("INSERT INTO user(name, lastName, age) VALUES ('batch1','desc', 5)");
//            statement.addBatch("INSERT INTO user(name, lastName, age) VALUES ('batch1','desc', 5)");
//            statement.executeBatch();
            //statement.clearBatch();
            if (!connection.isClosed()) {
                System.out.println("ok");
            }
            connection.close();

            if (connection.isClosed()) {
                System.out.println("closed");
            }
        } catch (SQLException e) {
            System.out.println("error not connection");
        }

    }
}
