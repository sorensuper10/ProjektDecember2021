package com.example.projectdecember2021;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private TextField allCostumers;
    // Der skal laves et fx.id="allCostumers" i det TextField der skal have udskrevet de værdier man beder om.

    @FXML
    protected void findCostumers() {
        DbSql db = new DbSql();
        Createuser c = db.soegKundeId(1);
        allCostumers.setText(String.valueOf(c));
    }

    /* DbSql db = new DbSql();
        ArrayList<Createuser> tabelalle;
        Createuser c = new Createuser();
        tabelalle = db.allekunder();
        for (int i = 0; i < tabelalle.size(); i++) {
            c = tabelalle.get(i);
            System.out.println(c.toString());
        }*/

    @FXML
    public void findPackage() {

        DbSql db = new DbSql();
        Createpackage p = db.soegPakke(1);
        allCostumers.setText(String.valueOf(p));

        // Denne del kunne vi ikke få til at fungere. Den udskriver kun sidste ID fra tabellen
        /*
        ArrayList<Createpackage> tabelalle;
        Createpackage p = new Createpackage();
        DbSql db = new DbSql();
        tabelalle = db.allepakker();
        for (int i = 0; i < tabelalle.size(); i++) {
            p = tabelalle.get(i);
            System.out.println(p.toString());
        }
        allCostumers.setText(String.valueOf(p.toString()));
        */
    }
}






