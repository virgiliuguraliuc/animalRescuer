package org.fasttrackit;

public class Bird extends Animal {

    public String preferedplace;
    public String nameFavoriteActivity;

    public Bird(String petName) {
        super(petName);
    }

    @Override
    public void HappynessLevel() {
        System.out.println( getPetName() + " Chirps Merilly ");//
    }


}
