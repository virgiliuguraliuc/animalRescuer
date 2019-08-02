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

    public void FeedPet(Animal pet, Food petFood) {
        if (pet.getHungerLevel() <= 10 && pet.getHungerLevel() >= 8){
        System.out.println(getOwnerName() + " feeds " + pet.getPetName()  + petFood.getFoodName()  + " its favorite food "  + ".");
        pet.setHungerLevel(pet.getHungerLevel()- 2);}
        if (pet.getHungerLevel() < 8 && pet.getHungerLevel() > 5);{
        pet.setHungerLevel(pet.getHungerLevel()- 1);}
        if (pet.getHungerLevel() <=5 && pet.getHungerLevel() > 3);{
            pet.setHungerLevel(pet.getHungerLevel()- 1);}
        if (pet.getHungerLevel() <= 3 && pet.getHungerLevel() > 0);{
            pet.setHungerLevel(pet.getHungerLevel()- 1);}
            if(pet.getHungerLevel() == 0);{
            System.out.println(pet.getPetName() + " vomits the food, you get the feeling it ate too much. ");
                pet.setHealthLevel(pet.getHealthLevel() -1 );
        }
    }

public void TrainPet(Animal pet, PetOwner rescuer) {
    System.out.println(getOwnerName() + " trains " + pet.getPetName()  + ".");
    rescuer.setPetTraining(getPetTraining() +1);


}

    public void RecreationalActivity(Animal pet, String activity){
        System.out.println(getOwnerName() + " plays "+ activity + " with "+ pet.getPetName() );
        if (pet.getHappyness() < 10 && pet.getHappyness() >= 8)
        {pet.setHappyness(pet.getHappyness() + 1);

        }

        if (pet.getHappyness() < 8 && pet.getHappyness() >5 )
        {pet.setHappyness(pet.getHappyness() + 1);

        }
        if (pet.getHappyness() <= 5 && pet.getHappyness() > 3)
        {pet.setHappyness(pet.getHappyness() + 2);

        }
        if (pet.getHappyness() <= 3 && pet.getHappyness() > 0)
        {pet.setHappyness(pet.getHappyness() + 3);

        }
        if (pet.getHappyness() == 10){

        }
    }



    @Override
    public String toString() {
        return "PetOwner{" +
                "ownerName='" + ownerName + '\'' +
                '}';
    }


}



