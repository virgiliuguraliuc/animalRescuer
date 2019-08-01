package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.Objects;

public class Animal {


  private String type;
  public String petName;
  private double petAge;
  private double healthLevel;
  private double hungerLevel;
  private double happyness;
  private String nameFavoriteFood;
  private String nameFavoriteActivity;


    public Animal(String petName) {
        this.petName = petName;
    }


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
    public void HappynessLevel (){
        if (getHappyness() >= 8 && getHappyness() < 10){
        System.out.println(getPetName() + " Animal is happy ");}
        if (getHappyness() >= 5 && getHappyness() < 8){
            System.out.println(getPetName() + " Animal is content");}
        if (getHappyness() >= 3 && getHappyness() < 5){
            System.out.println(getPetName() + " Animal is unhappy ");}
        if (getHappyness() >= 0 && getHappyness() < 3){
            System.out.println(getPetName() + " Animal is unhappy ");}
    }

//health method

    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", petName='" + petName + '\'' +
                ", petAge=" + petAge +
                ", healthLevel=" + healthLevel +
                ", hungerLevel=" + hungerLevel +
                ", happyness=" + happyness +
                ", nameFavoriteFood='" + nameFavoriteFood + '\'' +
                ", nameFavoriteActivity='" + nameFavoriteActivity + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.petAge, petAge) == 0 &&
                Double.compare(animal.healthLevel, healthLevel) == 0 &&
                Double.compare(animal.hungerLevel, hungerLevel) == 0 &&
                Double.compare(animal.happyness, happyness) == 0 &&
                Objects.equals(type, animal.type) &&
                Objects.equals(petName, animal.petName) &&
                Objects.equals(nameFavoriteFood, animal.nameFavoriteFood) &&
                Objects.equals(nameFavoriteActivity, animal.nameFavoriteActivity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, petName, petAge, healthLevel, hungerLevel, happyness, nameFavoriteFood, nameFavoriteActivity);
    }
}
