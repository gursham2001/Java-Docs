package com.sparta.gs;

import com.sparta.gs.util.PropertiesLoader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static Connection postGresConnection;

    // method to give us everything we need
    public static  Connection connectToDB() {
        // will refer to the Db.properties and return the details needed
        String url = PropertiesLoader.getProperties("url");
        String userName = PropertiesLoader.getProperties("userName");
        String passWord = PropertiesLoader.getProperties("passWord");

        try {
            postGresConnection = DriverManager.getConnection(url, userName, passWord);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return postGresConnection;
    }

    // method to close connection
    public static void closeConnection() {
        try {
            postGresConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    String INSERT_INTO_DB = "INSERT INTO public.user_db (emp_id, name_prefix, first_name, middle_initial, last_name, gender, email, date_od_birth, date_of_joining, salary) VALUES (? ,? ,?, ?, ?, ?, ?, ?, ?, ?)";

}
