package org.fasttrackit;

import java.time.LocalDate;

import static org.fasttrackit.Game.Mesaj;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Animal pet = new Animal();
        pet.setPetName("Fluffy");
        pet.setType("cat");
        pet.setPetAge(2);
        pet.setHappyness(7);
        pet.setHealthLevel(5);
        pet.setNameFavoriteFood("kitkat");
        pet.setNameFavoriteActivity("jumping after birds");
        pet.setHungerLevel(2);


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
        fun.fun = true;

        PetDoctor petDoctor = new PetDoctor();
        petDoctor.PetDoctorName = " Dr. Johnson ";
        petDoctor.Speciality = " feline specialist ";
        petDoctor.skilllevel = 4;
        petDoctor.medicinalCost = 1;

        PetHouse catHouse = new PetHouse();
        catHouse.petHouseType = "cardboardBox";
        catHouse.petHouseName = "CerealBox";
        catHouse.petHouseCost = 0;
        catHouse.getPetHouseHappynessLevel = 1;



        System.out.println(" The animal is a " + pet.getType() + " and its name is " + pet.getPetName()+ ".");
        System.out.println(" " + pet.getPetName() + " is " + pet.getPetAge() + " years old and enjoys " + pet.getNameFavoriteActivity() + ".");
        System.out.println(" The owner, " + petOwner.ownerName + " and loves " + pet.getType() + " very much. ");
        System.out.println(" Every time the " + pet.getPetName() + " is hungry " + petOwner.ownerName + " feeds " + pet.getPetName() + "" + pet.getNameFavoriteFood() + "," + " which is its favorite food.");
        System.out.println(" Lately, " + pet.getPetName() + " has been feeling ill, so the owner has brought her to " + petDoctor.PetDoctorName + " who is a" + petDoctor.Speciality + ".");
        System.out.println(" Pet food expires on " + petFood.expiryDate);



        double medicalcare = petDoctor.medicalcare(4, 5, 1);



        remainingCash();
        remainingCash2();

        Mesaj();

    }

    public static void remainingCash() {
        double result;
        double a = 100;
        double b = 1.25;
        result = a-b;
        System.out.println( " Remaing cash is " + result + " $. ");


    }

    public static void remainingCash2() {

        System.out.println( " I am testing things " );
    }







}





