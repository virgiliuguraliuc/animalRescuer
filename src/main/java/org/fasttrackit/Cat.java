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
        System.out.println( getPetName() + " Purrs ");//
    }
}