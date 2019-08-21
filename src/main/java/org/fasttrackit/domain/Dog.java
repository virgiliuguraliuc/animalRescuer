package org.fasttrackit.domain;

public class Dog extends Animal {

    public String preferedplace;
    public String nameFavoriteActivity;
    public String looksLikeAlive = "      /^-----^\n" +
            "     V  o o  V\n" +
            "      |  Y  |\n" +
            "       \\ Q /\n" +
            "       / - \\\n" +
            "       |    \\\n" +
            "       |     \\    )\n" +
            "       || (___\\====";

    public Dog(String petName) {
        super(petName);
    }


    public String getPreferedplace() {
        return preferedplace;
    }

    public void setPreferedplace(String preferedplace) {
        this.preferedplace = preferedplace;
    }

    @Override
    public String getNameFavoriteActivity() {
        return nameFavoriteActivity;
    }

    @Override
    public void setNameFavoriteActivity(String nameFavoriteActivity) {
        this.nameFavoriteActivity = nameFavoriteActivity;
    }

    @Override
    public void observeHappynessLevel() {
        if (getHappyness() == 10) {
            System.out.println(getPetName() + " jumps around and waggles tail in a very play full mood.");
        }
        if (getHappyness() >= 8 && getHappyness() < 10) {
            System.out.println(getPetName() + " jumps around and waggles tail in a very play full mood.");
            ;
        }
        if (getHappyness() >= 5 && getHappyness() < 8) {
            System.out.println(getPetName() + " waggles tail and rolls its belly to you. ");

        }
        if (getHappyness() >= 3 && getHappyness() < 5) {
            System.out.println(getPetName() + " is reclusive and growls. ");

        }
        if (getHappyness() >= 0 && getHappyness() < 3) {
            System.out.println(getPetName() + " barks angrily and bears teeth. ");

        }


    }
    @Override
    public void observeHungerLevel() {
        if (getHungerLevel() >= 0 && getHungerLevel() <= 3) {
            System.out.println(getPetName() + " has a very full belly. ");
        }
        if (getHungerLevel() > 3 && getHungerLevel() < 5) {
            System.out.println(getPetName() + " fur looks shiny and energy aplenty.");
        }
        if (getHungerLevel() >= 5 && getHungerLevel() < 7) {
            System.out.println(getPetName() + " has a sad look and circles the food bowl. ");
        }
        if (getHungerLevel() >= 7 && getHungerLevel() <= 9) {
            System.out.println(getPetName() + " has a sad look and  is without energy. ");
        }

    }
    public void observeHealthMethod (){
        if (getHealthLevel() >= 8 && getHealthLevel() < 10){
            System.out.println(getPetName() + " fur is shiny and the eyes are playful. ");}
        if (getHealthLevel() >= 5 && getHealthLevel() < 8){
            System.out.println(getPetName() + " fur is shiny.");}
        if (getHealthLevel() >= 3 && getHealthLevel() < 5){
            System.out.println(getPetName() + " fur is patchy and the dog whimpers. ");}
        if (getHealthLevel() >= 0 && getHealthLevel() < 3){
            System.out.println(getPetName() + " whimpers and is immobile, you think something is very wrong, seek medical help. ");}
    }

}