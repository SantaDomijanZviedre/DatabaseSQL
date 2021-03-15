package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    Connection c;

    {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost/RCS?" +
                    "user=java_user&password=Riga1234");
            Statement stmt = c.createStatement();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void main(String[] args) {
	// write your code here
    }
}
