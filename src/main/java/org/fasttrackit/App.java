package org.fasttrackit;

import java.net.HttpURLConnection;
import java.sql.SQLOutput;
import java.time.LocalDate;

import static org.fasttrackit.Game.Mesaj;
import static org.fasttrackit.Animal.Hunger;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        AnimalEnvironment animalEnvironment = new AnimalEnvironment();
        animalEnvironment.preferedBiome = "land";


        PetOwner petOwner = new PetOwner("Virgiliu");
        petOwner.setAvailableCash(100);


        Animal pet = new Animal("Purina");
        pet.setType("cat");
        pet.setPetAge(2);
        pet.setHappyness(7);
        pet.setHealthLevel(5);
        pet.setNameFavoriteFood("kitkat");
        pet.setNameFavoriteActivity("jumping after birds");
        pet.setHungerLevel(2);


//AM CASTAT
        Animal dog = new Dog("Max");
        ((Dog) dog).preferedplace = "land";

        Animal cat = new Cat("Miau");
        ((Cat) cat).preferedplace = "land";
        ((Cat) cat).nameFavoriteActivity = "playing with string";



        Food petFood = new Food("Chaika");
        petFood.setFoodPrice(1.2);
        petFood.setFoodQuantity(5);
        petFood.setCreatedDate(2018,6,13);                //LocalDate.of(2018, 6, 13));
        petFood.setExpiryDate(2019,8, 2);
        petFood.setInStock(true);

        RecreationalActivity fun = new RecreationalActivity("jumping after birds");
        //fun.setRecreationalActivityName("jumping after birds");
        fun.setFun(true);

        PetDoctor petDoctor = new PetDoctor(4,1);
        petDoctor.setPetDoctorName("Dr. Johnson");
        petDoctor.setSpeciality(" feline specialist ");
       // petDoctor.setSkilllevel(4);
       // petDoctor.setMedicinalCost(1);

        PetHouse catHouse = new PetHouse(" land ");
        catHouse.setPetHouseType(" carboardBox ") ;
        catHouse.setPetHouseName(" Cereal Box ") ;
        catHouse.setPetHouseCost(0);
        catHouse.setPetHouseHappynessLevel(1);


        System.out.println(" The animal needs to live on " + animalEnvironment.preferedBiome + ".");
        System.out.println(" The animal is a " + pet.getType() + " and its name is " + pet.getPetName()+  ".");
        System.out.println(" " + pet.getPetName() + " is " + pet.getPetAge() + " years old and enjoys " + pet.getNameFavoriteActivity() + ".");
        System.out.println(" The owner, " + petOwner.getOwnerName() + " and loves " + pet.getType() + " very much. ");
        System.out.println(" Every time the " + pet.getType() + " is hungry " + petOwner.getOwnerName() + " feeds " + pet.getPetName() + "" + pet.getNameFavoriteFood() + "," + " which is its favorite food.");
        System.out.println(" Lately, " + pet.getPetName() + " has been feeling ill, so the owner has brought her to " + petDoctor.getPetDoctorName() + " who is a" + petDoctor.getSpeciality() + ".");
        System.out.println(" Pet food expires on " + petFood.getExpiryDate());
        System.out.println(" Dog name is " + dog.getPetName());


        double medicalcare = petDoctor.medicalcare(4, 5, 1);



        remainingCash();
        remainingCash2();

        Mesaj();

        Hunger(1,2,1);

        Hunger(pet.getPetAge(),pet.getHappyness(),pet.getHealthLevel());


        petOwner.FeedPet(pet, petFood);

        petOwner.RecreationalActivity(pet);
        pet.HappynessLevel();
        dog.HappynessLevel();
        cat.HappynessLevel();

  //      FeedPet3();
   //     petOwner.FeedPet2();
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


  //  public static void FeedPet3(Animal pet, Food petFood) {

  //      System.out.println( + pet + " feeds " + petFood  + " its favorite food "  + ".");





}

//    În proiectul AnimalRescuer, reveniți la metoda main din clasa App unde ați instanțiat câte un obiect din clasa Animal și din sub-clasele acesteia și ați apelat pentru fiecare metoda suprascrisă anterior pentru exprimarea stării de spirit pozitive.
//
//        Asigurați-vă acum că variabilele în care sunt stocate referințele obiectelor din sub-clasele clasei Animal sunt toate de tip Animal, iar apoi executați din nou metoda main.
//
//
//
//        Observați care dintre implementările metodei este folosită în fiecare caz.
//
//        Publicați ca răspuns la această temă link-ul repository-ului din GitHub.
//
//
//
