package com.example.projectdecember2021;

import java.sql.*;
import java.util.ArrayList;
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

        public static void opretUser(Createuser createuser) {
            try {
                int userId, userPhone, userZipcode;
                String userFirstName, userLastName, userMail, userAdress, userCountry, userNote;
                connection.setAutoCommit(true);
                String sql = "INSERT INTO Costumers (userID,userFirstName, userLastName, userMail, userPhone, userAdress,userCountry, userZipcode, userNote) VALUES(" +
                        String.valueOf(createuser.getUserId()) + ",'" + (createuser.getUserFirstName()) + "','" + (createuser.getUserLastName()) + "','" + (createuser.getUserMail()) + "','" + createuser.getUserPhone() + "','" + createuser.getUserAdress() + "','" + createuser.getUserCountry() + "','" + createuser.getUserZipcode() + "','" + createuser.getUserNote() + "');";
                Statement stmt = connection.createStatement();

                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
                /*
                System.out.println("Bruger er oprettet med informationerne:");
                System.out.println("Navn: " + userFirstName + " " + userLastName);
                System.out.println("e-mail: " + userMail);
                System.out.println("Telefon nr: " + userPhone);
                System.out.println("Adresse: " + userAdress + ", " + userZipcode + ", " + userCountry);
                System.out.println("Note: " + userNote);
                 */
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void sletKunde(Integer userId) {
            try {
                String sql = "DELETE FROM Costumers WHERE userId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


        public static void opretPakke(Createpackage createpackage) {
            try {
                int packageId, packageSendDate;
                String packageName, packageTrackingId;
                double packageWeight;
                connection.setAutoCommit(true);
                String sql = "INSERT INTO Packages (packageId,packageName, packageWeight, packageSendDate, packageTrackingId) VALUES(" +
                        String.valueOf(createpackage.getPackageId()) + ",'" + (createpackage.getPackageName()) + "','" + (createpackage.getPackageWeight()) + "','" + (createpackage.getPackageSendDate()) + "','" + createpackage.getPackageTrackingId() + "');";
                Statement stmt = connection.createStatement();

                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

        public void sletPakke(Integer packageId) {
            try {
                String sql = "DELETE FROM Packages WHERE packageId=" + String.valueOf(packageId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public static void opretPlacering(CreatePlacement createPlacement) {
            try {
                int placementId;
                String placementDescription;
                connection.setAutoCommit(true);
                String sql = "INSERT INTO Placement (placementId, placementDescription) VALUES(" +
                        String.valueOf(createPlacement.getPlacementId()) + ",'" + (createPlacement.getPlacementDescription()) + "');";
                Statement stmt = connection.createStatement();

                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void sletPlacering(Integer placementId) {
            try {
                String sql = "DELETE FROM Placement WHERE placementId=" + String.valueOf(placementId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


        public void updateKundeNavn() {
            try {
                System.out.println("Indtast userId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                String userFirstName;
                System.out.println("Indtast nyt navn ");
                userFirstName = scan.next();
                String sql = "UPDATE Costumers SET userFirstName ='" + userFirstName + "' WHERE userId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void updateKundeEfterNavn() {
            try {
                System.out.println("Indtast userId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                String userLastName;
                System.out.println("Indtast nyt efternavn ");
                userLastName = scan.next();
                String sql = "UPDATE Costumers SET userLastName ='" + userLastName + "' WHERE userId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void updateuserMail() {
            try {
                System.out.println("Indtast userId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                String userMail;
                System.out.println("Indtast ny email ");
                userMail = scan.next();
                String sql = "UPDATE Costumers SET userMail ='" + userMail + "' WHERE userId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void updateuserPhone() {
            try {
                System.out.println("Indtast userId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                int userPhone;
                System.out.println("Indtast nyt tlfnr ");
                userPhone = scan.nextInt();
                String sql = "UPDATE Costumers SET userPhone ='" + userPhone + "' WHERE userId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void updateUserAdress() {
            try {
                System.out.println("Indtast userId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                String userAdress;
                System.out.println("Indtast ny adresse ");
                userAdress = scan.next();
                String sql = "UPDATE Costumers SET userAdress ='" + userAdress + "' WHERE userId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


        public void updateKunderpostnr() {
            try {
                System.out.println("Indtast userId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                int userZipcode;
                System.out.println("Indtast nyt postnr ");
                userZipcode = scan.nextInt();
                String sql = "UPDATE Costumers SET userZipcode ='" + userZipcode + "' WHERE userId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void updateuserCountry() {
            try {
                System.out.println("Indtast userId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                String userCountry;
                System.out.println("Indtast nyt land ");
                userCountry = scan.next();
                String sql = "UPDATE Costumers SET userCountry ='" + userCountry + "' WHERE userId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void updateUserNote() {
            try {
                System.out.println("Indtast userId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                String userNote;
                System.out.println("Indtast ny note ");
                userNote = scan.next();
                String sql = "UPDATE Costumers SET userNote ='" + userNote + "' WHERE userId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public Createuser soegKundeId(int userId) {
            Createuser c = new Createuser();
            String sql = "SELECT * from Costumers where userId=" + String.valueOf(userId);
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    c.setUserId(rs.getInt(1));
                    c.setUserFirstName(rs.getString(2));
                    c.setUserLastName(rs.getString(3));
                    c.setUserMail(rs.getString(4));
                    c.setUserPhone(rs.getInt(5));
                    c.setUserAdress(rs.getString(6));
                    c.setUserCountry(rs.getString(7));
                    c.setUserZipcode(rs.getInt(8));
                    c.setUserNote(rs.getString(9));
                } else
                    c = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return c;

        }

        public Createuser soegfnavnkunde(String userFirstName) {
            Createuser c = new Createuser();
            String sql = "SELECT * from Costumers where userFirstName='" + String.valueOf(userFirstName) + "'";
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    c.setUserId(rs.getInt(1));
                    c.setUserFirstName(rs.getString(2));
                    c.setUserLastName(rs.getString(3));
                    c.setUserMail(rs.getString(4));
                    c.setUserPhone(rs.getInt(5));
                    c.setUserAdress(rs.getString(6));
                    c.setUserCountry(rs.getString(7));
                    c.setUserZipcode(rs.getInt(8));
                    c.setUserNote(rs.getString(9));
                } else
                    c = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return c;
        }

        public Createuser soegenavnkunde(String userLastName) {
            Createuser c = new Createuser();
            String sql = "SELECT * from Costumers where userLastName='" + String.valueOf(userLastName) + "'";
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    c.setUserId(rs.getInt(1));
                    c.setUserFirstName(rs.getString(2));
                    c.setUserLastName(rs.getString(3));
                    c.setUserMail(rs.getString(4));
                    c.setUserPhone(rs.getInt(5));
                    c.setUserAdress(rs.getString(6));
                    c.setUserCountry(rs.getString(7));
                    c.setUserZipcode(rs.getInt(8));
                    c.setUserNote(rs.getString(9));
                } else
                    c = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return c;
        }

        public Createuser soegmailkunder(String userMail) {
            Createuser c = new Createuser();
            String sql = "SELECT * from Costumers where userMail='" + String.valueOf(userMail) + "'";
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    c.setUserId(rs.getInt(1));
                    c.setUserFirstName(rs.getString(2));
                    c.setUserLastName(rs.getString(3));
                    c.setUserMail(rs.getString(4));
                    c.setUserPhone(rs.getInt(5));
                    c.setUserAdress(rs.getString(6));
                    c.setUserCountry(rs.getString(7));
                    c.setUserZipcode(rs.getInt(8));
                    c.setUserNote(rs.getString(9));
                } else
                    c = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return c;
        }

        public Createuser soegtlfkunder(int userPhone) {
            Createuser c = new Createuser();
            String sql = "SELECT * from Costumers where userPhone='" + String.valueOf(userPhone) + "'";
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    c.setUserId(rs.getInt(1));
                    c.setUserFirstName(rs.getString(2));
                    c.setUserLastName(rs.getString(3));
                    c.setUserMail(rs.getString(4));
                    c.setUserPhone(rs.getInt(5));
                    c.setUserAdress(rs.getString(6));
                    c.setUserCountry(rs.getString(7));
                    c.setUserZipcode(rs.getInt(8));
                    c.setUserNote(rs.getString(9));
                } else
                    c = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return c;
        }

        public Createuser soegadressekunde(String userAdress) {
            Createuser c = new Createuser();
            String sql = "SELECT * from Costumers where userAdress='" + String.valueOf(userAdress) + "'";
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    c.setUserId(rs.getInt(1));
                    c.setUserFirstName(rs.getString(2));
                    c.setUserLastName(rs.getString(3));
                    c.setUserMail(rs.getString(4));
                    c.setUserPhone(rs.getInt(5));
                    c.setUserAdress(rs.getString(6));
                    c.setUserCountry(rs.getString(7));
                    c.setUserZipcode(rs.getInt(8));
                    c.setUserNote(rs.getString(9));
                } else
                    c = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return c;
        }

        public Createuser soegpostnr(int userZipcode) {
            Createuser c = new Createuser();
            String sql = "SELECT * from Costumers where userZipcode='" + String.valueOf(userZipcode) + "'";
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    c.setUserId(rs.getInt(1));
                    c.setUserFirstName(rs.getString(2));
                    c.setUserLastName(rs.getString(3));
                    c.setUserMail(rs.getString(4));
                    c.setUserPhone(rs.getInt(5));
                    c.setUserAdress(rs.getString(6));
                    c.setUserCountry(rs.getString(7));
                    c.setUserZipcode(rs.getInt(8));
                    c.setUserNote(rs.getString(9));
                } else
                    c = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return c;
        }

        public Createuser soegland(String userCountry) {
            Createuser c = new Createuser();
            String sql = "SELECT * from Costumers where userCountry='" + String.valueOf(userCountry) + "'";
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    c.setUserId(rs.getInt(1));
                    c.setUserFirstName(rs.getString(2));
                    c.setUserLastName(rs.getString(3));
                    c.setUserMail(rs.getString(4));
                    c.setUserPhone(rs.getInt(5));
                    c.setUserAdress(rs.getString(6));
                    c.setUserCountry(rs.getString(7));
                    c.setUserZipcode(rs.getInt(8));
                    c.setUserNote(rs.getString(9));
                } else
                    c = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return c;
        }

        public Createuser soegnote(String userNote) {
            Createuser c = new Createuser();
            String sql = "SELECT * from Costumers where userNote='" + String.valueOf(userNote) + "'";
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    c.setUserId(rs.getInt(1));
                    c.setUserFirstName(rs.getString(2));
                    c.setUserLastName(rs.getString(3));
                    c.setUserMail(rs.getString(4));
                    c.setUserPhone(rs.getInt(5));
                    c.setUserAdress(rs.getString(6));
                    c.setUserCountry(rs.getString(7));
                    c.setUserZipcode(rs.getInt(8));
                    c.setUserNote(rs.getString(9));
                } else
                    c = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return c;
        }

        public Createpackage soegPakke(int packageId) {
            Createpackage p = new Createpackage();
            String sql = "SELECT * from Packages where packageId=" + String.valueOf(packageId);
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    p.setPackageId(rs.getInt(1));
                    p.setPackageName(rs.getString(2));
                    p.setPackageWeight(rs.getDouble(3));
                    p.setPackageSendDate(rs.getInt(4));
                    p.setPackageTrackingId(rs.getString(5));

                } else
                    p = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return p;
        }


        public Createpackage soegpakkenavn(String packageName) {
            Createpackage p = new Createpackage();
            String sql = "SELECT * from Packages where packageName='" + String.valueOf(packageName) + "'";
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    p.setPackageId(rs.getInt(1));
                    p.setPackageName(rs.getString(2));
                    p.setPackageWeight(rs.getDouble(3));
                    p.setPackageSendDate(rs.getInt(4));
                    p.setPackageTrackingId(rs.getString(5));

                } else
                    p = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return p;
        }


        public Createpackage soegpakkevægt(double packageWeight) {
            Createpackage p = new Createpackage();
            String sql = "SELECT * from Packages where packageWeight=" + String.valueOf(packageWeight);
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    p.setPackageId(rs.getInt(1));
                    p.setPackageName(rs.getString(2));
                    p.setPackageWeight(rs.getDouble(3));
                    p.setPackageSendDate(rs.getInt(4));
                    p.setPackageTrackingId(rs.getString(5));

                } else
                    p = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return p;

        }

        public Createpackage soegpakkesendtdato(int packageSendDate) {
            Createpackage p = new Createpackage();
            String sql = "SELECT * from Packages where packageSendDate=" + String.valueOf(packageSendDate);
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    p.setPackageId(rs.getInt(1));
                    p.setPackageName(rs.getString(2));
                    p.setPackageWeight(rs.getDouble(3));
                    p.setPackageSendDate(rs.getInt(4));
                    p.setPackageTrackingId(rs.getString(5));

                } else
                    p = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return p;

        }

        public Createpackage soegpakketrackingid(String packageTrackingId) {
            Createpackage p = new Createpackage();
            String sql = "SELECT * from Packages where packageTrackingId=" + String.valueOf(packageTrackingId);
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    p.setPackageId(rs.getInt(1));
                    p.setPackageName(rs.getString(2));
                    p.setPackageWeight(rs.getDouble(3));
                    p.setPackageSendDate(rs.getInt(4));
                    p.setPackageTrackingId(rs.getString(5));

                } else
                    p = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return p;

        }

        public void updatePackageId() {
            try {
                System.out.println("Indtast packageId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                int packageId;
                System.out.println("Indtast nyt ID ");
                packageId = scan.nextInt();
                String sql = "UPDATE Packages SET packageId ='" + packageId + "' WHERE packageId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void updatePackageName() {
            try {
                System.out.println("Indtast packageId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                String packageName;
                System.out.println("Indtast nyt navn ");
                packageName = scan.next();
                String sql = "UPDATE Packages SET packageName ='" + packageName + "' WHERE packageId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void updatePackageWeight() {
            try {
                System.out.println("Indtast packageId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                double packageWeight;
                System.out.println("Indtast ny vægt ");
                packageWeight = scan.nextDouble();
                String sql = "UPDATE Packages SET packageWeight ='" + packageWeight + "' WHERE packageId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void updatePackageSendtDate() {
            try {
                System.out.println("Indtast packageId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                int packageSendDate;
                System.out.println("Indtast ny dato ");
                packageSendDate = scan.nextInt();
                String sql = "UPDATE Packages SET packageSendDate ='" + packageSendDate + "' WHERE packageId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void updateTrackingId() {
            try {
                System.out.println("Indtast packageId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                String packageTrackingId;
                System.out.println("Indtast nyt ID ");
                packageTrackingId = scan.next();
                String sql = "UPDATE Packages SET packageTrackingId ='" + packageTrackingId + "' WHERE packageId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public CreatePlacement soegPlacementId(int placementId) {
            CreatePlacement cp = new CreatePlacement();
            String sql = "SELECT * from Placement where placementId=" + String.valueOf(placementId);
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    cp.setPlacementId(rs.getInt(1));
                    cp.setPlacementDescription(rs.getString(2));


                } else
                    cp = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return cp;

        }

        public CreatePlacement soegplacementDescription(String placementDescription) {
            CreatePlacement cp = new CreatePlacement();
            String sql = "SELECT * from Placement where placementDescription='" + String.valueOf(placementDescription) + "'";
            try {
                connection.setAutoCommit(true);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    cp.setPlacementId(rs.getInt(1));
                    cp.setPlacementDescription(rs.getString(2));

                } else
                    cp = null;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return cp;
        }

        public void updatePlacementId() {
            try {
                System.out.println("Indtast PlacementId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                int placementId;
                System.out.println("Indtast nyt ID ");
                placementId = scan.nextInt();
                String sql = "UPDATE Placement SET placementId ='" + placementId + "' WHERE placementId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void updatePlacementDescription() {
            try {
                System.out.println("Indtast placementId på den der skal opdateres ");
                int userId;
                Scanner scan = new Scanner(System.in);
                userId = scan.nextInt();
                String placementDescription;
                System.out.println("Indtast ny beskrivelse ");
                placementDescription = scan.next();
                String sql = "UPDATE Placement SET placementDescription ='" + placementDescription + "' WHERE placementId=" + String.valueOf(userId);
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public ArrayList<Createuser> allekunder() {
            ArrayList<Createuser> tabel = new ArrayList<Createuser>();
            String sql = "SELECT * from Costumers";
            try {
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                int i = 0;
                while (rs.next()) {
                    Createuser c = new Createuser();
                    c.setUserId(rs.getInt("userId"));
                    c.setUserFirstName(rs.getString("userFirstName"));
                    c.setUserLastName(rs.getString("userLastName"));
                    c.setUserMail(rs.getString("userMail"));
                    c.setUserPhone(rs.getInt("userPhone"));
                    c.setUserAdress(rs.getString("userAdress"));
                    c.setUserCountry(rs.getString("userCountry"));
                    c.setUserZipcode(rs.getInt("userZipcode"));
                    c.setUserNote(rs.getString("userNote"));
                    tabel.add(c);
                    i++;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return tabel;
        }

        public ArrayList<Createpackage> allepakker() {
            ArrayList<Createpackage> tabel = new ArrayList<Createpackage>();
            String sql = "SELECT * from Packages";
            try {
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                int i = 0;
                while (rs.next()) {
                    Createpackage p = new Createpackage();
                    p.setPackageId(rs.getInt("packageId"));
                    p.setPackageName(rs.getString("packageName"));
                    p.packageWeight(rs.getDouble("packageWeight"));
                    p.setPackageSendDate(rs.getInt("packageSendDate"));
                    p.packageTrackingId(rs.getString("packageTrackingId"));

                    tabel.add(p);
                    i++;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return tabel;
        }

        public ArrayList<CreatePlacement> allePlaceringer() {
            ArrayList<CreatePlacement> tabel = new ArrayList<CreatePlacement>();
            String sql = "SELECT * from Placement";
            try {
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                int i = 0;
                while (rs.next()) {
                    CreatePlacement cp = new CreatePlacement();
                    cp.setPlacementId(rs.getInt("placementId"));
                    cp.setPlacementDescription(rs.getString("placementDescription"));


                    tabel.add(cp);
                    i++;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return tabel;
        }
}

        // TODO kan bygge denne inner join del færdig
            /*public ArrayList<CreatePackages> Pakkeoplysning() {
        ArrayList<CreatePackages> tabel = new ArrayList<CreatePackages>();
        String sql = "SELECT * from Packages inner join Updates on Packages.packageId = Updates.packageId " +
                "inner join Placement on Updates.placementId = Placement.placementId";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int i = 0;
            while (rs.next()) {
                CreatePackages pu = new CreatePackages();
                pu.getS().setpackageID(rs.getInt("Pakke Id: "));
                pu.getS().setPackageName(rs.getString("Pakkenavn"));
                pu.getS().packageWeight(rs.getDouble("packageWeight"));
                pu.getS().setPackageSendDate(rs.getInt("packageSendDate"));
                pu.getS().setPackageTrackingId(rs.getString("packageTrackingId"));
                pu.getS().setPlacementId(rs.getString("placementId"));
                pu.getS().setPlacementDescription(rs.getString("placementDescription"));
                tabel.add(pu);
                i++;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tabel; */
