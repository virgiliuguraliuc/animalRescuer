package org.fasttrackit;

public class Cat extends Animal {
    public String preferedplace;
    public String nameFavoriteActivity;
    public String looksAlive = "  /\\_/\\\n" +
            "   >^.^<.---.\n" +
            "  _'-`-'     )\\\n" +
            " (6--\\ |--\\ (`.`-.\n" +
            "     --'  --'  ``-'";
    public Cat(String petName) {
        super(petName);
    }

    @Override
    public void HappynessLevel() {
        if (getHappyness() == 10) {
            System.out.println(getPetName() + " purrs and cuddles with you.");
        }
        if (getHappyness() >= 8 && getHappyness() < 10) {
            System.out.println(getPetName() + " purrs and cuddles with you.");

        }
        if (getHappyness() >= 5 && getHappyness() < 8) {
            System.out.println(getPetName() + " purrs . ");

        }
        if (getHappyness() >= 3 && getHappyness() < 5) {
            System.out.println(getPetName() + " runs away and hisses. ");
        }
        if (getHappyness() >= 0 && getHappyness() < 3) {
            System.out.println(getPetName() + " gives you cat death stare while its years are flat on its head.");


        }
    }
}