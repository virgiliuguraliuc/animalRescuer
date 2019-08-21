package org.fasttrackit.domain;

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
    public void observeHappynessLevel() {
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

    @Override
    public void observeHungerLevel() {
        if (getHungerLevel() >= 0 && getHungerLevel() <= 3) {
            System.out.println(getPetName() + " has a very full belly, and sleeps alot. ");
        }
        if (getHungerLevel() > 3 && getHungerLevel() < 5) {
            System.out.println(getPetName() + " fur looks shiny and is very energetic.");
        }
        if (getHungerLevel() >= 5 && getHungerLevel() < 7) {
            System.out.println(getPetName() + " meows weakly and paws at the food bowl. ");
        }
        if (getHungerLevel() >= 7 && getHungerLevel() <= 9) {
            System.out.println(getPetName() + " is curled up and looks at you without energy. ");
        }

    }
    public void observeHealthMethod (){
        if (getHealthLevel() >= 8 && getHealthLevel() < 10){
            System.out.println(getPetName() + " fur is shiny, its eyes are bright. ");}
        if (getHealthLevel() >= 5 && getHealthLevel() < 8){
            System.out.println(getPetName() + " fur is shiny and nose cold. ");}
        if (getHealthLevel() >= 3 && getHealthLevel() < 5){
            System.out.println(getPetName() + " fur looks unkempt, and the cat purrs heavily. ");}
        if (getHealthLevel() >= 0 && getHealthLevel() < 3){
            System.out.println(getPetName() + " purrs heavily and is immobile, you think something is very wrong. ");}
    }

}