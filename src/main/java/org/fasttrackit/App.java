package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Animal pet = new Animal();
        pet.petName = "Fluffy";
        pet.type = "Kitty";
        pet.petAge = 2;
        pet.happyness = 7;
        pet.healthLevel = 5;
        pet.nameFavoriteFood = " kitkat ";
        pet.nameFavoriteActivity = " jumping after birds ";


        PetOwner petOwner = new PetOwner();
        petOwner.ownerName = " Virgiliu Guraliuc ";
        petOwner.availableCash = 100;

        Food petFood = new Food();
        petFood.FoodName = " kitkat ";
        petFood.FoodPrice = 1.2;
        petFood.FoodQuantity = 5;
        petFood.createdDate = LocalDate.of(2018, 6, 13);
        petFood.expiryDate = LocalDate.of(2019,7,10);
        petFood.inStock = true;

        RecreationalActivity fun = new RecreationalActivity();
        fun.RecreationalActivityName = "jumping after birds";
        fun.jumpedafterbirds = true;

        PetDoctor petDoctor = new PetDoctor();
        petDoctor.PetDoctorName = " Dr. Johnson ";
        petDoctor.Speciality = " felines ";
        petDoctor.skilllevel = 4 ;
        petDoctor.medicinalCost = 1;




















    }
}
