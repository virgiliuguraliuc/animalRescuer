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
        System.out.println( getPetName() + " Chirps Merilly ");//
    }


}
