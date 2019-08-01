package org.fasttrackit;

public class Dog extends Animal {

    public String preferedplace;
    public String nameFavoriteActivity;
    public String looksLikeAlive = "      /^-----^\n" +
            "     V  o o  V\n" +
            "      |  Y  |\n" +
            "       \\ Q /\n" +
            "       / - \\\n" +
            "       |    \\\n" +
            "       |     \\    )\n" +
            "       || (___\\====";

    public Dog(String petName) {
        super(petName);
    }


    public String getPreferedplace() {
        return preferedplace;
    }

    public void setPreferedplace(String preferedplace) {
        this.preferedplace = preferedplace;
    }

    @Override
    public String getNameFavoriteActivity() {
        return nameFavoriteActivity;
    }

    @Override
    public void setNameFavoriteActivity(String nameFavoriteActivity) {
        this.nameFavoriteActivity = nameFavoriteActivity;
    }

    @Override
    public void HappynessLevel() {
        if (getHappyness() == 10 ){
            System.out.println(getPetName() + " jumps around and waggles tail in a very play full mood.");
        }
        if (getHappyness() >= 8 && getHappyness() < 10) {
            System.out.println(getPetName() + " jumps around and waggles tail in a very play full mood.");
           ;
        }
        if (getHappyness() >= 5 && getHappyness() < 8) {
            System.out.println(getPetName() + " waggles tail and rolls its belly to you. ");

        }
        if (getHappyness() >= 3 && getHappyness() < 5) {
            System.out.println(getPetName() + " is reclusive and growls. ");

        }
        if (getHappyness() >= 0 && getHappyness() < 3) {
            System.out.println(getPetName() + " barks angrily and bears teeth. ");

        }

    }

}
