package org.fasttrackit;

import java.net.HttpURLConnection;
import java.time.LocalDate;

import static org.fasttrackit.Game.Mesaj;
import static org.fasttrackit.Animal.Hunger;

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
        petOwner.setOwnerName("Virgiliu");
        petOwner.setAvailableCash(100);

        Food petFood = new Food();
        petFood.setFoodName("KITKAT");
        petFood.setFoodPrice(1.2);
        petFood.setFoodQuantity(5);
        petFood.setCreatedDate(2018,8,1);                //LocalDate.of(2018, 6, 13));
        petFood.setExpiryDate(2019,8, 2);
        petFood.setInStock(true);

        RecreationalActivity fun = new RecreationalActivity();
        fun.setRecreationalActivityName("jumping after birds");
        fun.setFun(true);

        PetDoctor petDoctor = new PetDoctor();
        petDoctor.setPetDoctorName("Dr. Johnson");
        petDoctor.setSpeciality(" feline specialist ");
        petDoctor.setSkilllevel(4);
        petDoctor.setMedicinalCost(1);

        PetHouse catHouse = new PetHouse();
        catHouse.petHouseType = "cardboardBox";
        catHouse.petHouseName = "CerealBox";
        catHouse.petHouseCost = 0;
        catHouse.getPetHouseHappynessLevel = 1;



        System.out.println(" The animal is a " + pet.getType() + " and its name is " + pet.getPetName()+ ".");
        System.out.println(" " + pet.getPetName() + " is " + pet.getPetAge() + " years old and enjoys " + pet.getNameFavoriteActivity() + ".");
        System.out.println(" The owner, " + petOwner.getOwnerName() + " and loves " + pet.getType() + " very much. ");
        System.out.println(" Every time the " + pet.getType() + " is hungry " + petOwner.getOwnerName() + " feeds " + pet.getPetName() + "" + pet.getNameFavoriteFood() + "," + " which is its favorite food.");
        System.out.println(" Lately, " + pet.getPetName() + " has been feeling ill, so the owner has brought her to " + petDoctor.getPetDoctorName() + " who is a" + petDoctor.getSpeciality() + ".");
        System.out.println(" Pet food expires on " + petFood.getExpiryDate());



        double medicalcare = petDoctor.medicalcare(4, 5, 1);



        remainingCash();
        remainingCash2();

        Mesaj();
        Hunger(1,2,1);
        Hunger(pet.getPetAge(),pet.getHappyness(),pet.getHealthLevel());

        System.out.println();
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





