package com.example.trackntrace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbSql {
    private static Connection connection;
    private Statement stmt;

    DbSql() {
        connection = null;
        stmt = null;
        try {
            String url = "jdbc:sqlite:C://sqlite/trackandtrace.db";
            connection = DriverManager.getConnection(url);
            connection.setAutoCommit(true);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void indsaetUser(CreateUser createUser) throws SQLException{
        try {
            System.out.println("Indtast bruger id, fornavn, efternavn, email, telefon nr, adresse, postnummer, land og evt noter onkring leveringen.");
            int userId, userPhone, userZipcode;
            String userFirstName, userLastName, userMail, userAdress, userCountry, userNote;
            Scanner scan = new Scanner(System.in);
            userId = scan.nextInt();
            userFirstName = scan.next();
            userLastName = scan.next();
            userMail = scan.next();
            userPhone = scan.nextInt();
            userAdress = scan.next();
            userZipcode = scan.nextInt();
            userCountry = scan.next();
            userNote = scan.next();
            String sql = "INSERT INTO Costumers (userID,userFirstName, userLastName, userMail, userPhone, userAdress,userZipcode, userCountry, userNote) VALUES(" +
                    String.valueOf(userId) + ",'"
                    + userFirstName + "','"
                    + userLastName + ",'"
                    + userMail + "','"
                    + userPhone + ",'"
                    + userAdress + ",'"
                    + userZipcode + "','"
                    + userCountry + "','"
                    + userNote + "','";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
