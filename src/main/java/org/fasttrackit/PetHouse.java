package org.fasttrackit;

public class PetHouse {
 private String petHouseBiome;
 private String petHouseName;
 private String petHouseType;
 private double petHouseCost;
 private double PetHouseHappynessLevel;

//getter


    public PetHouse(String petHouseBiome) {
        this.petHouseBiome = petHouseBiome;
    }

    public String getPetHouseName() {
        return petHouseName;
    }

    public String getPetHouseType() {
        return petHouseType;
    }

    public double getPetHouseCost() {
        return petHouseCost;
    }


    public String getPetHouseBiome() {
        return petHouseBiome;
    }

    public double getPetHouseHappynessLevel() {
        return PetHouseHappynessLevel;
    }

//setter


    public void setPetHouseName(String petHouseName) {
        this.petHouseName = petHouseName;
    }

    public void setPetHouseType(String petHouseType) {
        this.petHouseType = petHouseType;
    }

    public void setPetHouseCost(double petHouseCost) {
        this.petHouseCost = petHouseCost;
    }

    public void setPetHouseHappynessLevel(double petHouseHappynessLevel) {
        PetHouseHappynessLevel = petHouseHappynessLevel;
    }

    public void setPetHouseBiome(String petHouseBiome) {
        this.petHouseBiome = petHouseBiome;
    }
}
