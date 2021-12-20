package com.example.projectdecember2021;

import java.util.ArrayList;

public class CreatePlacement {

        int placementId;
        String placementDescription;

        public ArrayList<CreatePlacement> Placeringsliste= new ArrayList<>(

        );

        public CreatePlacement() {

        }

        @Override
        public String toString() {
            return "CreatePlacement{" +
                    "placementId=" + placementId +
                    ", placementDescription='" + placementDescription + '\'' +
                    '}';

        }

        public int getPlacementId() {
            return placementId;
        }

        public void setPlacementId(int placementId) {
            this.placementId = placementId;
        }

        public String getPlacementDescription() {
            return placementDescription;
        }

        public void setPlacementDescription(String placementDescription) {
            this.placementDescription = placementDescription;
        }

        public CreatePlacement(int placementId, String placementDescription) {
            this.placementId = placementId;
            this.placementDescription = placementDescription;
        }
    }


