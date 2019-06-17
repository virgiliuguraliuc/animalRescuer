package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Animal pet = new Animal();
        pet.petName = "Fluffy";
        pet.type = "cat";
        pet.petAge = 2;
        pet.happyness = 7;
        pet.healthLevel = 5;
        pet.nameFavoriteFood = " kitkat ";
        pet.nameFavoriteActivity = " jumping after birds ";


        PetOwner petOwner = new PetOwner();
        petOwner.ownerName = " Virgiliu ";
        petOwner.availableCash = 100;

        Food petFood = new Food();
        petFood.FoodName = " kitkat ";
        petFood.FoodPrice = 1.2;
        petFood.FoodQuantity = 5;
        petFood.createdDate = LocalDate.of(2018, 6, 13);
        petFood.expiryDate = LocalDate.of(2019, 7, 10);
        petFood.inStock = true;

        RecreationalActivity fun = new RecreationalActivity();
        fun.RecreationalActivityName = "jumping after birds";
        fun.jumpedafterbirds = true;

        PetDoctor petDoctor = new PetDoctor();
        petDoctor.PetDoctorName = " Dr. Johnson ";
        petDoctor.Speciality = " feline specialist ";
        petDoctor.skilllevel = 4;
        petDoctor.medicinalCost = 1;


        System.out.println(" The animal is a " + pet.type + " and its name is " + pet.petName + ".");
        System.out.println(" " + pet.petName + " is " + pet.petAge + " years old and enjoys " + pet.nameFavoriteActivity + ".");
        System.out.println(" The owner, " + petOwner.ownerName + " and loves " + pet.petName + " very much. ");
        System.out.println(" Every time the " + pet.type + " is hungry " + petOwner.ownerName + " feeds " + pet.petName + "" + pet.nameFavoriteFood + "," + " which is its favorite food.");
        System.out.println(" Lately, " + pet.petName + " has been feeling ill, so the owner has brought her to " + petDoctor.PetDoctorName + " who is a" + petDoctor.Speciality + ".");
        System.out.println(" Pet food expires on " + petFood.expiryDate);

        double medicalcare = petDoctor.medicalcare(4, 5, 1);


//adaugam mai incolo si preturile la mancare


    }
}
