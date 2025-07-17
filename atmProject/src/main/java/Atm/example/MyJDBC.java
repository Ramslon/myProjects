package Atm.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyJDBC {
    public static void main(String[] args) {
        Connection connecting = DriverManager.getConnection(
         "jdbc:mysql://"
        );
    }
}
