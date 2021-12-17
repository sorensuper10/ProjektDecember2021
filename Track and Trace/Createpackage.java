package com.example.projectdecember2021;

import java.util.ArrayList;

public class Createpackage {
        int packageId;
        String packageName;
        double packageWeight;
        int packageSendDate;
        String packageTrackingId;

        public ArrayList<Createpackage> Pakkeliste= new ArrayList<>(

        );


        public Createpackage() {

        }

        @Override
        public String toString() {
            return "Createpackage{" +
                    "packageId=" + packageId +
                    ", packageName='" + packageName + '\'' +
                    ", packageWeight=" + packageWeight +
                    ", packageSendDate=" + packageSendDate +
                    ", packageTrackingId='" + packageTrackingId + '\'' +
                    '}';
        }

        public int getPackageId() {
            return packageId;
        }

        public void setPackageId(int packageId) {
            this.packageId = packageId;
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public double getPackageWeight() {
            return packageWeight;
        }

        public void setPackageWeight(double packageWeight) {
            this.packageWeight = packageWeight;
        }

        public int getPackageSendDate() {
            return packageSendDate;
        }

        public void setPackageSendDate(int packageSendDate) {
            this.packageSendDate = packageSendDate;
        }

        public String getPackageTrackingId() {
            return packageTrackingId;
        }

        public void setPackageTrackingId(String packageTrackingId) {
            this.packageTrackingId = packageTrackingId;
        }

        public Createpackage(int packageId, String packageName, double packageWeight, int packageSendDate, String packageTrackingId) {
            this.packageId = packageId;
            this.packageName = packageName;
            this.packageWeight = packageWeight;
            this.packageSendDate = packageSendDate;
            this.packageTrackingId = packageTrackingId;
        }

        public void packageWeight(double packageWeight) {
        }

        public void packageTrackingId(String packageTrackingId) {
        }
    }

