package com.example.trackntrace;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 */

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args ) throws SQLException {
        DbSql db1 = new DbSql();

        CreateUser c = new CreateUser();

        DbSql.indsaetUser(c);
        System.out.println(c);

        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();

        if (scan.nextInt() == 1){

        }
        if (scan.nextInt() == 2){

        }

        if (scan.nextInt() == 3){

        }

        if (scan.nextInt() == 4){

        }

        if (scan.nextInt() == 5){

        }
        else {

        }

        //launch();
    }
}