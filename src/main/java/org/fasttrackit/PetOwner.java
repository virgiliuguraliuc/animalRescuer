package org.fasttrackit;


public class PetOwner {
    private String ownerName;
    private double availableCash;
    private double petTraining;





    public PetOwner(String ownerName) {
        this.ownerName = ownerName;
    }

    //getter
    public String getOwnerName() {
        return ownerName;
    }

    public double getAvailableCash() {
        return availableCash;
    }

    public double getPetTraining() {
        return petTraining;
    }

//setter

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAvailableCash(double availableCash) {
        this.availableCash = availableCash;
    }

    public void setPetTraining(double petTraining) {
        this.petTraining = petTraining;

    }
    //training method

    public void FeedPet(String petName, String petFood) {

        System.out.println(getOwnerName() + " feeds " + petName + " its favorite food " + petFood + ".");

    }

    public void RecreationalActivity(String petName, String FavoriteActivity){
        System.out.println(getOwnerName() + " plays "+ FavoriteActivity + " with "+ petName );

    }



    @Override
    public String toString() {
        return "PetOwner{" +
                "ownerName='" + ownerName + '\'' +
                '}';
    }
}



