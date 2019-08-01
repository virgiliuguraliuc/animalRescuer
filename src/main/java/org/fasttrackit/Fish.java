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
    public void HappynessLevel() {
        if (getHappyness() == 10) {
            System.out.println(getPetName() + " makes a underwater loop and comes near the glass of the aquarium to play.");
        }
        if (getHappyness() >= 8 && getHappyness() < 10) {
            System.out.println(getPetName() + " makes a underwater loop and comes near the glass of the aquarium to play.");

        }
        if (getHappyness() >= 5 && getHappyness() < 8) {
            System.out.println(getPetName() + " tries its best to make heart shape bubbles and swims around in circles ");
       ;
        }
        if (getHappyness() >= 3 && getHappyness() < 5) {
            System.out.println(getPetName() + " is hiding in the underwater vegetation ");

        }
        if (getHappyness() >= 0 && getHappyness() < 3) {
            System.out.println(getPetName() + " jump at your hand as you aproach the aquarium edge and bites you, then hides in a corner ");

        }
    }
}