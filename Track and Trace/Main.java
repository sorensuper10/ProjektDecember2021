package com.example.projectdecember2021;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws SQLException {

        DbSql db = new DbSql();

        // Createuser c = new Createuser(6, "Lone", "Andersen", "loneandersen@hotmail.com", 40506070,"Sandvej 6", "Grønland", 5200,"Lever pakken ved døren");

        // Createuser c = new Createuser();

        // Createpackage p = new Createpackage();

        // DbSql.opretUser(c);

        // Createpackage p = new Createpackage(6,"TV", 5, 16122021, "6");

        // DbSql.opretPakke(p);

        // CreatePlacement cp = new CreatePlacement(5,"Pakke sendt retur til afsender.");
        // DbSql.opretPlacering(cp);

        // CreatePlacement cp = new CreatePlacement();

        //db.sletPlacering(4);

        // Createuser c = db.soegKunde(1);
        // System.out.println(c);

        // Createpackage p = db.soegPakke(1);
        // System.out.println(p);

        // db.sletKunde(6);

        // db.sletPakke(0);

        //c=db.soegKundeId(1);
        //System.out.println(c.toString());

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

        // p=db.soegPakke(1);
        // System.out.println(p.toString());

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

        // db.updateKundeNavn();

        // db.updateKundeEfterNavn();

        // db.updateuserMail();

        // db.updateuserPhone();

        // db.updateUserAdress();

        // db.updateKunderpostnr();

        // db.updateuserCountry();

        // db.updateUserNote();

        // db.updatePackageId();

        // db.updatePackageName();

        // db.updatePackageWeight();

        // db.updatePackageSendtDate();

        // db.updateTrackingId();

        // db.updatePlacementId();

        // db.updatePlacementDescription();

       /*  ArrayList<Createuser> tabelalle;
        tabelalle = db.allekunder();
        for (int i = 0; i < tabelalle.size(); i++) {
            c = tabelalle.get(i);
            System.out.println(c.toString()); */

            /*ArrayList<Createpackage> tabelalle;
            tabelalle = db.allepakker();
            for (int i = 0; i < tabelalle.size(); i++) {
                p = tabelalle.get(i);
                System.out.println(p.toString()); */

               /* ArrayList<CreatePlacement> tabelalle;
                tabelalle = db.allePlaceringer();
                for (int i = 0; i < tabelalle.size(); i++) {
                    cp = tabelalle.get(i);
                    System.out.println(cp.toString()); */


    }
}


