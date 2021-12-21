package com.example.projectdecember2021;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("trackandtracegui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Track 'n' Trace");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws SQLException {

        boolean exit = false;
        String testExit = "y";

        System.out.println("For information omkring indholdet i switch case, se README.md på github.");
        System.out.println("https://github.com/sorensuper10/ProjektDecember2021");
        System.out.println("Aktivering af MEGET simpel gui, tast 42");
        System.out.println("For at afslutte programmet skriv [y]");

        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            String operator = scanner.next();

            switch (operator) {
                case "1" -> {
                    DbSql db = new DbSql();
                    Createuser c = new Createuser(7, "Bob", "Ross", "bobross@yamama.com", 22334455, "Boblane 69", "Wonderland", 6969, "I will punch you, like, real hard!");
                    DbSql.opretUser(c);
                }
                case "2" -> {
                    DbSql db = new DbSql();
                    Createpackage p = new Createpackage(7,"Hund", 25, 17122021, "7");
                    DbSql.opretPakke(p);
                }
                case "3" -> {
                    DbSql db = new DbSql();
                    CreatePlacement cp = new CreatePlacement(6, "Pakke er væk.");
                    DbSql.opretPlacering(cp);
                }
                case "4" -> {
                    DbSql db = new DbSql();
                    Createuser c = db.soegKundeId(3);
                    System.out.println(c);
                    //c = db.soegKundeId(1);
                    //System.out.println(c.toString());
                }
                case "5" -> {
                    DbSql db = new DbSql();
                    Createpackage p = db.soegPakke(4);
                    System.out.println(p);
                    //p = db.soegPakke(1);
                    //System.out.println(p.toString());
                }
                case "6" -> {
                    DbSql db = new DbSql();
                    CreatePlacement cp = db.soegPlacementId(5);
                    System.out.println(cp);

                    //cp = db.soegPlacementId(1);
                    //System.out.println(cp.toString());

                }
                case "7" -> {
                    DbSql db = new DbSql();
                    db.sletKunde(7);
                }
                case "8" -> {
                    DbSql db = new DbSql();
                    db.sletPakke(7);

                }
                case "9" -> {
                    DbSql db = new DbSql();
                    db.sletPlacering(6);
                }
                case "10" -> {
                    DbSql db = new DbSql();
                    Createuser c = new Createuser();
                    c = db.soegfnavnkunde("Hans");
                    System.out.println(c.toString());
                }
                case "11" -> {
                    DbSql db = new DbSql();
                    Createuser c = new Createuser();
                    c = db.soegenavnkunde("Jensen");
                    System.out.println(c.toString());
                }
                case "12" -> {
                    DbSql db = new DbSql();
                    Createuser c = new Createuser();
                    c = db.soegmailkunder("hellepetersen@hotmail.com");
                    System.out.println(c.toString());
                }
                case "13" -> {
                    DbSql db = new DbSql();
                    Createuser c = new Createuser();
                    c = db.soegtlfkunder(20406080);
                    System.out.println(c.toString());
                }
                case "14" -> {
                    DbSql db = new DbSql();
                    Createuser c = new Createuser();
                    c = db.soegadressekunde("Appelsinvej 5");
                    System.out.println(c.toString());
                }
                case "15" -> {
                    DbSql db = new DbSql();
                    Createuser c = new Createuser();
                    c = db.soegpostnr(5200);
                    System.out.println(c.toString());
                }
                case "16" -> {
                    DbSql db = new DbSql();
                    Createuser c = new Createuser();
                    c = db.soegland("Danmark");
                    System.out.println(c.toString());
                }
                case "17" -> {
                    DbSql db = new DbSql();
                    Createuser c = new Createuser();
                    c = db.soegnote("Bank hårdt på dør");
                    System.out.println(c.toString());
                }
                case "18" -> {
                    DbSql db = new DbSql();
                    Createpackage p = new Createpackage();
                    p = db.soegpakkenavn("Frugt");
                    System.out.println(p.toString());
                }
                case "19" -> {
                    DbSql db = new DbSql();
                    Createpackage p = new Createpackage();
                    p = db.soegpakkevægt(4);
                    System.out.println(p.toString());
                }
                case "20" -> {
                    DbSql db = new DbSql();
                    Createpackage p = new Createpackage();
                    p = db.soegpakkesendtdato(13122021);
                    System.out.println(p.toString());
                }
                case "21" -> {
                    DbSql db = new DbSql();
                    Createpackage p = new Createpackage();
                    p = db.soegpakketrackingid("4");
                    System.out.println(p.toString());
                }
                case "22" -> {
                    DbSql db = new DbSql();
                    CreatePlacement cp = new CreatePlacement();
                    cp = db.soegPlacementId(1);
                    System.out.println(cp.toString());
                }
                case "23" -> {
                    DbSql db = new DbSql();
                    CreatePlacement cp = new CreatePlacement();
                    cp = db.soegplacementDescription("Under levering.");
                    System.out.println(cp);
                }
                case "24" -> {
                    DbSql db = new DbSql();
                    db.updateKundeNavn();
                }
                case "25" -> {
                    DbSql db = new DbSql();
                    db.updateKundeEfterNavn();
                }
                case "26" -> {
                    DbSql db = new DbSql();
                    db.updateuserMail();
                }
                case "27" -> {
                    DbSql db = new DbSql();
                    db.updateuserPhone();

                }
                case "28" -> {
                    DbSql db = new DbSql();
                    db.updateUserAdress();

                }
                case "29" -> {
                    DbSql db = new DbSql();
                    db.updateKunderpostnr();

                }
                case "30" -> {
                    DbSql db = new DbSql();
                    db.updateuserCountry();

                }
                case "31" -> {
                    DbSql db = new DbSql();
                    db.updateUserNote();
                }
                case "32" -> {
                    DbSql db = new DbSql();
                    db.updatePackageId();

                }
                case "33" -> {
                    DbSql db = new DbSql();
                    db.updatePackageName();

                }
                case "34" -> {
                    DbSql db = new DbSql();
                    db.updatePackageWeight();

                }
                case "35" -> {
                    DbSql db = new DbSql();
                    db.updatePackageSendtDate();
                }
                case "36" -> {
                    DbSql db = new DbSql();
                    db.updateTrackingId();
                }
                case "37" -> {
                    DbSql db = new DbSql();
                    db.updatePlacementId();
                }
                case "38" -> {
                    DbSql db = new DbSql();
                    db.updatePlacementDescription();
                }
                case "39" -> {
                    DbSql db = new DbSql();
                    ArrayList<Createuser> tabelalle;
                    Createuser c = new Createuser();
                    tabelalle = db.allekunder();
                    for (int i = 0; i < tabelalle.size(); i++) {
                        c = tabelalle.get(i);
                        System.out.println(c.toString());
                    }
                }
                case "40" -> {
                    ArrayList<Createpackage> tabelalle;
                    Createpackage p = new Createpackage();
                    DbSql db = new DbSql();
                    tabelalle = db.allepakker();
                    for (int i = 0; i < tabelalle.size(); i++) {
                        p = tabelalle.get(i);
                        System.out.println(p.toString());
                    }
                }
                    case "41" -> {
                        CreatePlacement cp = new CreatePlacement();
                        ArrayList<CreatePlacement> tabelalle;
                        DbSql db = new DbSql();
                        tabelalle = db.allePlaceringer();
                        for (int i = 0; i < tabelalle.size(); i++) {
                            cp = tabelalle.get(i);
                            System.out.println(cp.toString());
                        }
                    }
                    case "42" -> {
                        launch();
                    }

                    default -> {
                        System.out.println("Ukendt kommando.");
                        System.out.println("Prøv igen.");
                    }

            }
            String breakOut = scanner.next();
            if (breakOut.equalsIgnoreCase(testExit)) {
                exit = true;
            }

        }


                   // DbSql db = new DbSql();

                    /* Oprettelse af bruger*/
                    // Createuser c = new Createuser(6, "Lone", "Andersen", "loneandersen@hotmail.com", 40506070,"Sandvej 6", "Grønland", 5200,"Lever pakken ved døren");
                    // Createuser c = new Createuser();
                    // DbSql.opretUser(c);

                    /* Oprettelse af pakke*/
                    // Createpackage p = new Createpackage();
                    // Createpackage p = new Createpackage(6,"TV", 5, 16122021, "6");
                    // DbSql.opretPakke(p);

                    /* Oprettelse af placering */
                    // CreatePlacement cp = new CreatePlacement(5,"Pakke sendt retur til afsender.");
                    // CreatePlacement cp = new CreatePlacement();
                    // DbSql.opretPlacering(cp);

                    /* Søgning på kunde (id 1) og udskrivning på alt info omkring kunden (to forskellige metoder) */
                    //Createuser c = db.soegKundeId(1);
                    //System.out.println(c);

                    //c=db.soegKundeId(1);
                    //System.out.println(c.toString());

                    /* Søgning på en pakke (id 1) og udskrift (to forskellige måder) */
                    // Createpackage p = db.soegPakke(1);
                    // System.out.println(p);

                    /* Søger efter pakke (id 1, linje 506) */
                    // p=db.soegPakke(1);
                    // System.out.println(p.toString());

                    /* Søgning på Placering (id 1) og udskrivning på alt info omkring placering (to forskellige metoder) */
                    //CreatePlacement cp = db.soegPlacementId(1);
                    //System.out.println(cp);

                    //cp=db.soegPlacementId(1);
                    //System.out.println(cp.toString());

                    /* Sletning af kunde (id 6), pakke (id 0) og placering (id 4) */
                    // db.sletKunde(6);
                    // db.sletPakke(0);
                    // db.sletPlacering(4);

                    /* Få alt information udskrevet ved de forskellige kriterier omkring kunder */
                    // c=db.soegfnavnkunde("Hans");
                    // System.out.println(c.toString());

                    // c=db.soegenavnkunde("Hansen");
                    // System.out.println(c.toString());

                    // c=db.soegmailkunder("hanshansen@hotmail.com");
                    // System.out.println(c.toString());

                    // c=db.soegtlfkunder(12345678);
                    // System.out.println(c.toString());

                    // c=db.soegadressekunde("Æblevej 1");
                    // System.out.println(c.toString());

                    // c=db.soegpostnr(4700);
                    // System.out.println(c.toString());

                    // c=db.soegland("Danmark");
                    // System.out.println(c.toString());

                    //c=db.soegnote("Pas på hund");
                    //System.out.println(c.toString());

                    /* Få alt information udskrevet ved de forskellige kriterier omkring pakken */
                    // p=db.soegpakkenavn("Frugt");
                    // System.out.println(p.toString());

                    // p=db.soegpakkevægt(2);
                    // System.out.println(p.toString());

                    // p=db.soegpakkesendtdato(11122021);
                    // System.out.println(p.toString());

                    // p=db.soegpakketrackingid("1");
                    // System.out.println(p.toString());

                    // cp=db.soegPlacementId(1);
                    // System.out.println(cp.toString());

                    // cp=db.soegplacementDescription("Under sortering");
                    // System.out.println(cp);

                    /* Forskellige opdatering omkring kunden */
                    // db.updateKundeNavn();
                    // db.updateKundeEfterNavn();
                    // db.updateuserMail();
                    // db.updateuserPhone();
                    // db.updateUserAdress();
                    // db.updateKunderpostnr();
                    // db.updateuserCountry();
                    // db.updateUserNote();

                    /* Forskellige opdateringer omkring pakker */
                    // db.updatePackageId();
                    // db.updatePackageName();
                    // db.updatePackageWeight();
                    // db.updatePackageSendtDate();
                    // db.updateTrackingId();


                    /* Forskellige opdateringer omkring placering */
                    // db.updatePlacementId();
                    // db.updatePlacementDescription();

                    /* Udskriver alle kunder gennem arraylist*/

                    /*  ArrayList<Createuser> tabelalle;
                        tabelalle = db.allekunder();
                            for (int i = 0; i < tabelalle.size(); i++) {
                            c = tabelalle.get(i);
                        System.out.println(c.toString()); */

                    // Udskriver alle pakker gennem arraylist

            /*ArrayList<Createpackage> tabelalle;
            tabelalle = db.allepakker();
            for (int i = 0; i < tabelalle.size(); i++) {
                p = tabelalle.get(i);
                System.out.println(p.toString()); */

                    // Udskriver alle placeringer gennem arraylist

               /* ArrayList<CreatePlacement> tabelalle;
                tabelalle = db.allePlaceringer();
                for (int i = 0; i < tabelalle.size(); i++) {
                    cp = tabelalle.get(i);
                    System.out.println(cp.toString()); */


                }
            }

