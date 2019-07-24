package org.fasttrackit;

public class Dog extends Animal {

    public String preferedplace;
    public String nameFavoriteActivity;


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
        System.out.println(getPetName() + " waggles tail ");
    }

}


