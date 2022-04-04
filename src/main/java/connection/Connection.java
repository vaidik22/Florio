/*
 * Author Name: Vaidik Nigam
 * IDE: Intellij IDEA Community Edition
 * Date: 05-04-2022
 */

package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static final String URL = "jdbc:mysql://localhost:3306/florio";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static java.sql.Connection connection = null;

    private static java.sql.Connection getConnection() {
        return connection;
    }

    public static boolean startConnection() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection != null;
    }

    public static void printStatus() {
        System.out.println(connection != null ? "ONLINE" : "OFFLINE");
    }

    public void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

}
