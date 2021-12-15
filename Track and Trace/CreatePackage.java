package com.example.trackntrace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreatePackage {
    public static void insertPackage(Connection connection) {
        try {
            System.out.println("Indtast pakkenavn, pakkevægt, afsendtdato, placering, trackingnummer.");
            int PackageId;
            String packageTrackingId;
            int packageSendDate;
            String packageName;
            double packageWeight;
            Scanner scan = new Scanner(System.in);
            PackageId = scan.nextInt();
            packageName = scan.next();
            packageWeight = scan.nextDouble();
            packageSendDate = scan.nextInt();
            packageTrackingId = scan.next();

            String sql = "INSERT INTO Packages (packageId, packageName, packageWeight, packageSendDate, packageTrackingId) VALUES(" +
                    String.valueOf(PackageId) + ",'"
                    + packageName + "','"
                    + packageWeight + ",'"
                    + packageSendDate + "','"
                    + packageTrackingId + "','";
            Statement stmt=connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
