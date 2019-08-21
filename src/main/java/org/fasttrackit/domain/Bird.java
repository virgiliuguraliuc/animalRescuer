package org.fasttrackit.domain;

public class Bird extends Animal {

    public String preferedplace;
    public String nameFavoriteActivity;
    public String loooksAlive = "                   ,\n" +
            "         ,_     ,     .'<_\n" +
            "        _> `'-,'(__.-' __<\n" +
            "        >_.--(.. )  =;`\n" +
            "             `V-'`'\\/``";

    public Bird(String petName) {
        super(petName);
    }

    @Override
    public void observeHappynessLevel() {
        if (getHappyness() == 10) {
            System.out.println(getPetName() + " cirps happyly and lands on your hand.");
        }
        if (getHappyness() >= 8 && getHappyness() < 10) {
            System.out.println(getPetName() + " cirps happyly and lands on your hand.");

        }
        if (getHappyness() >= 5 && getHappyness() < 8) {
            System.out.println(getPetName() + " sings and tries to imitate your sounds. ");

        }
        if (getHappyness() >= 3 && getHappyness() < 5) {
            System.out.println(getPetName() + " is very quiet, and as you aproach pinches you ");

        }
        if (getHappyness() >= 0 && getHappyness() < 3) {
            System.out.println(getPetName() + " is actively tearing your keyboard keys apart from your laptop. ");

        }
    }
        @Override
        public void observeHungerLevel() {
            if (getHungerLevel() >= 0 && getHungerLevel() <= 3) {
                System.out.println(getPetName() + " is so full can, that i can barely fly. ");
            }
            if (getHungerLevel() > 3 && getHungerLevel() < 5) {
                System.out.println(getPetName() + " eats some bird seeds but is not overly interested by them.");
            }
            if (getHungerLevel() >= 5 && getHungerLevel() < 7) {
                System.out.println(getPetName() + " barely cirps and seems to be preocupied in finding things on the ground, from time to time looks at you with a open beak. ");
            }
            if (getHungerLevel() >= 7 && getHungerLevel() <= 9) {
                System.out.println(getPetName() + "is without energy, does not sing and seems to barely keep its head up. ");
            }

        }

    public void observeHealthMethod (){
        if (getHealthLevel() >= 8 && getHealthLevel() < 10){
            System.out.println(getPetName() + " feathers are shiny with bright attentive eyes. ");}
        if (getHealthLevel() >= 5 && getHealthLevel() < 8){
            System.out.println(getPetName() + " feathers are shiny.");}
        if (getHealthLevel() >= 3 && getHealthLevel() < 5){
            System.out.println(getPetName() + " feathers are discoloured and dirty looking. ");}
        if (getHealthLevel() >= 0 && getHealthLevel() < 3){
            System.out.println(getPetName() + " feathers are falling off and its clear the bird does not feel well. ");}
    }



    }
