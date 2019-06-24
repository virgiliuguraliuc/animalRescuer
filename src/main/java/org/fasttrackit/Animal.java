package org.fasttrackit;

import java.sql.SQLOutput;

public class Animal {


  private String type;
  private String petName;
  private double petAge;
  private double healthLevel;
  private double hungerLevel;
  private double happyness;
  private String nameFavoriteFood;
  private String nameFavoriteActivity;

//getteri
    public String getType() {
        return type;
    }

    public String getPetName() {
        return petName;
    }

    public double getPetAge() {
        return petAge;
    }

    public double getHealthLevel() {
        return healthLevel;
    }

    public double getHungerLevel() {
        return hungerLevel;
    }

    public double getHappyness() {
        return happyness;
    }

    public String getNameFavoriteFood() {
        return nameFavoriteFood;
    }

    public String getNameFavoriteActivity() {
        return nameFavoriteActivity;
    }
//setteri

    public void setType(String type) {
        this.type = type;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetAge(double petAge) {
        this.petAge = petAge;
    }

    public void setHealthLevel(double healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void setHungerLevel(double hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setHappyness(double happyness) {
        this.happyness = happyness;
    }

    public void setNameFavoriteFood(String nameFavoriteFood) {
        this.nameFavoriteFood = nameFavoriteFood;
    }

    public void setNameFavoriteActivity(String nameFavoriteActivity) {
        this.nameFavoriteActivity = nameFavoriteActivity;
    }
//hunger method
    public static double Hunger (double hungermodifier, double exertion, double time) {
        hungermodifier = 1;
        double hungerLevel = exertion * time * hungermodifier;
        System.out.println("hunger level is " + hungerLevel);
        return hungerLevel;
    }
//happy method


//health method

}
