package com.sparta.gs;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;
import java.sql.*;
import java.util.ResourceBundle;

public class UserDAO {
    // create connection from connection manager
    // we only want one connection to the Dao rn
    private final Connection postgresConnection;
    private Statement statement;

    public UserDAO(Connection postgresConnection) {
        this.postgresConnection = postgresConnection;
        try {
            statement = postgresConnection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // print all users
    public void printAllUsers() {
        try {
            ResultSet resultSet = statement.executeQuery(SQLQueries.SELECT_ALL);
            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createUser(int id, String name, String email) {
        // write sql statement and concatenate variables within
        try {
            PreparedStatement preparedStatement = postgresConnection.prepareStatement(SQLQueries.INSERT_INTO_DB);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, email);
            // run the code and replace place holder questionmarks with the second param
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser() {

    }

    public void editUser() {

    }
}
