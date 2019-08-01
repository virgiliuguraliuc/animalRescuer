package org.fasttrackit;

public class Fish extends Animal {

    public String preferedplace;
    public String nameFavoriteActivity;
    public String looksLikeAlive = "       \\\n" +
            "         }\\\n" +
            "   `\\  .'  \\\n" +
            "    }\\/ ~~ o\\\n" +
            "    }/\\  )) _}\n" +
            "   ,/ /`.  /`\n" +
            "         }/\n" +
            "         /";
    public String looksLikeDead = "  ....._____.......\n" +
            "      /     \\/|\n" +
            "      \\x__  /\\|\n" +
            "          \\|\n";


    public Fish(String petName) {
        super(petName);
    }

    @Override
    public void observeHappynessLevel() {
        if (getHappyness() == 10) {
            System.out.println(getPetName() + " makes a underwater loop and comes near the glass of the aquarium to play.");
        }
        if (getHappyness() >= 8 && getHappyness() < 10) {
            System.out.println(getPetName() + " makes a underwater loop and comes near the glass of the aquarium to play.");
        }
        if (getHappyness() >= 5 && getHappyness() < 8) {
            System.out.println(getPetName() + " tries its best to make heart shape bubbles and swims around in circles ");
        }
        if (getHappyness() >= 3 && getHappyness() < 5) {
            System.out.println(getPetName() + " is hiding in the underwater vegetation ");
        }
        if (getHappyness() >= 0 && getHappyness() < 3) {
            System.out.println(getPetName() + " jump at your hand as you aproach the aquarium edge and bites you, then hides in a corner ");
        }
    }

    @Override
    public void observeHungerLevel() {
        if (getHungerLevel() >= 0 && getHungerLevel() <= 3) {
            System.out.println(getPetName() + " looks like its full, it barely touches the food. ");
        }
        if (getHungerLevel() > 3 && getHungerLevel() < 5) {
            System.out.println(getPetName() + " swims strong and energy aplenty.");
        }
        if (getHungerLevel() >= 5 && getHungerLevel() < 7) {
            System.out.println(getPetName() + " hang around the surface of the water looking for food. ");
        }
        if (getHungerLevel() >= 7 && getHungerLevel() <= 9) {
            System.out.println(getPetName() + " swims slowly without energy at the surface of the water. ");
        }

    }

    public void observeHealthMethod (){
        if (getHealthLevel() >= 8 && getHealthLevel() < 10){
            System.out.println(getPetName() + " is actively swimming around, doing fish things. ");}
        if (getHealthLevel() >= 5 && getHealthLevel() < 8){
            System.out.println(getPetName() + " is actively swimming around.");}
        if (getHealthLevel() >= 3 && getHealthLevel() < 5){
            System.out.println(getPetName() + " swims slowly, it seems to have trouble maintaining depth. ");}
        if (getHealthLevel() >= 0 && getHealthLevel() < 3){
            System.out.println(getPetName() + " is swimming in its side, you have the feeling this is not normal at all. ");}
    }


}