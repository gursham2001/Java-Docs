package com.sparta.gs;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    // Jdbc depends on
    // 1. connection - it's a interface implemented differently depending on type of database
    // 2. Statement - Sql statement
    // 3. Result set - set of results

    public static void main(String[] args) {

        Connection postgresConnection = ConnectionManager.connectToDB();
        UserDAO userDAO = new UserDAO(postgresConnection);
        userDAO.createUser(1, "Gursham", "gsingh@spartaglobal.com");
        userDAO.createUser(2, "Manish", "mgadhvi@spartaglobal.com");
        userDAO.createUser(3, "Sunil", "sshemar@spartaglobal.com");
        userDAO.printAllUsers();
        ConnectionManager.closeConnection();
    }
}
