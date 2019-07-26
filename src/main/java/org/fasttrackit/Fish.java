package org.fasttrackit;

public class Fish extends Animal {

    public String preferedplace;
    public String nameFavoriteActivity;

       public Fish(String petName) {
        super(petName);
    }

    @Override
    public void HappynessLevel() {
        System.out.println( getPetName() + " Makes a heart shape bubble ");//
    }
}
