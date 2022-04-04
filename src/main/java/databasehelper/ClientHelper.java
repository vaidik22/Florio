/*
 * Author Name: Vaidik Nigam
 * IDE: Intellij IDEA Community Edition
 * Date: 05-04-2022
 */

package databasehelper;

import model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientHelper {
    public boolean createNewStudent(Connection connection, Client client) throws SQLException {
        String insertQuery = "INSERT INTO subject(username,password) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(insertQuery);
        statement.setString(1, client.getUsername());
        statement.setString(2, client.getPassword());
        return statement.executeUpdate() >= 1;
    }

}
