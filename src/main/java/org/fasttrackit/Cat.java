package org.fasttrackit;

public class Cat extends Animal {
    public String preferedplace;
    public String nameFavoriteActivity;

    public Cat(String petName) {
        super(petName);
    }

    @Override
    public void HappynessLevel() {
        System.out.println( " Purrs ");
    }
}