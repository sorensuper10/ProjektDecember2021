package com.example.trackntrace;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreatePlacement {
    public static void insertPlacement(Connection connection) {
        try {
            System.out.println("Indtast ID og Beskrivelse.");
            int PlacementID;
            String Beskrivelse;
            Scanner scan = new Scanner(System.in);
            PlacementID = scan.nextInt();
            Beskrivelse = scan.next();
            String sql = "INSERT INTO Placement (PlacementID,Beskrivelse) VALUES(" +
                    String.valueOf(PlacementID)
                    + Beskrivelse + ",";
            Statement stmt=connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
