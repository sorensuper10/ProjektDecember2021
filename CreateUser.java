package com.example.trackntrace;

public class CreateUser {
    int userId;
    int userPhone;
    int userZipcode;
    String userFirstName;
    String userLastName;
    String userMail;
    String userAdress;
    String userCountry;
    String userNote;

    @Override
    public String toString() {
        return "CreateUser{" +
                "userId=" + userId +
                ", userPhone=" + userPhone +
                ", userZipcode=" + userZipcode +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userAdress='" + userAdress + '\'' +
                ", userCountry='" + userCountry + '\'' +
                ", userNote='" + userNote + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public int getUserZipcode() {
        return userZipcode;
    }

    public void setUserZipcode(int userZipcode) {
        this.userZipcode = userZipcode;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    public void Create(int userId, int userZipcode, int userPhone, String userAdress, String userMail, String userFirstName, String userCountry) {
        this.userId = userId;
        this.userZipcode = userZipcode;
        this.userMail = userMail;
        this.userCountry = userCountry;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userNote = userNote;
    }
}





    /* public static void insertUser(Connection connection) throws SQLException {
        class DbSql {
            private static Connection connection;
            private Statement stmt;

            DbSql() throws SQLException {
                connection = null;
                stmt = null;

                try {

                    String url = "jdbc:sqlite:C://sqlite/trackandtrace.db";
                    connection = DriverManager.getConnection(url);
                    connection.setAutoCommit(true);

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
    }
}

     */