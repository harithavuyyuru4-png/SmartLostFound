
package com.lostfound;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {
            String url = "jdbc:mysql://localhost:3306/lost_found_db";
            String username = "root";
            String password = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, username, password);

            System.out.println("JDBC Connection Successful!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}

