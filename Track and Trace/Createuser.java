package com.example.projectdecember2021;

import java.util.ArrayList;

public class Createuser {

        int userId;
        String userFirstName;
        String userLastName;
        String userMail;
        int userPhone;
        String userAdress;
        String userCountry;
        int userZipcode;
        String userNote;

        public ArrayList<Createuser> Kundeliste= new ArrayList<>(

        );
        public Createuser() {

        }

        @Override
        public String toString() {
            return "Createuser{" +
                    "userId=" + userId +
                    ", userFirstName='" + userFirstName + '\'' +
                    ", userLastName='" + userLastName + '\'' +
                    ", userMail='" + userMail + '\'' +
                    ", userPhone=" + userPhone +
                    ", userAdress='" + userAdress + '\'' +
                    ", userCountry='" + userCountry + '\'' +
                    ", userZipcode=" + userZipcode +
                    ", userNote='" + userNote + '\'' +
                    '}';
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
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

        public int getUserPhone() {
            return userPhone;
        }

        public void setUserPhone(int userPhone) {
            this.userPhone = userPhone;
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

        public int getUserZipcode() {
            return userZipcode;
        }

        public void setUserZipcode(int userZipcode) {
            this.userZipcode = userZipcode;
        }

        public String getUserNote() {
            return userNote;
        }

        public void setUserNote(String userNote) {
            this.userNote = userNote;
        }

        public Createuser(int userId, String userFirstName, String userLastName, String userMail, int userPhone, String userAdress, String userCountry, int userZipcode, String userNote) {
            this.userId = userId;
            this.userFirstName = userFirstName;
            this.userLastName = userLastName;
            this.userMail = userMail;
            this.userPhone = userPhone;
            this.userAdress = userAdress;
            this.userCountry = userCountry;
            this.userZipcode = userZipcode;
            this.userNote = userNote;
        }

    }

