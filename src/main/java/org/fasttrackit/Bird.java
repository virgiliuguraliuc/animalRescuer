package org.fasttrackit;

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
    public void HappynessLevel() {
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
}