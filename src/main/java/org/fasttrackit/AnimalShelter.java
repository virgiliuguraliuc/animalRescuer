package org.fasttrackit;

public class AnimalShelter {
   public String shelterName;
   public double availablePets;
   public double petcost;
   public String PetType;

//getter

    public String getShelterName() {
        return shelterName;
    }

    public double getAvailablePets() {
        return availablePets;
    }

    public double getPetcost() {
        return petcost;
    }

    public String getPetType() {
        return PetType;
    }
//setter

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }

    public void setAvailablePets(double availablePets) {
        this.availablePets = availablePets;
    }

    public void setPetcost(double petcost) {
        this.petcost = petcost;
    }

    public void setPetType(String petType) {
        PetType = petType;
    }


    //shelter method


}
