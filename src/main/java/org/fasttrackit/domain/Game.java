package org.fasttrackit.domain;




import org.fasttrackit.persistance.AnimalRescuerRepository;
import org.fasttrackit.service.AnimalRescuerSevice;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Game {

    DecimalFormat df2 = new DecimalFormat("#.##");
    //facem niste liste ca sa putem lucra cu ele
    private List<PetOwner> rescuer = new ArrayList<>();
    private List<Animal> savedAnimal = new ArrayList<>();
    private List<Food> foodsInStore = new ArrayList<>();
    private List<Food> foodOwned = new ArrayList<>();
    private List<PetHouse> shelterInStore = new ArrayList<>();
    private List<PetDoctor> petDoctors = new ArrayList<>();
    private List<AsciiGraphics> Art = new ArrayList<>();
    private List<PetDoctor> selectedDoctor = new ArrayList<>();
    private List<Animal> favoriteActivity = new ArrayList<>();
    private List<Animal> favoriteAquaticActivity = new ArrayList<>();
    AnimalRescuerRepository animalRescuerRepository = new AnimalRescuerRepository(); //asta trebuie facut prin service this is wrong dar acuma testam

    public void Start () throws SQLException, IOException, ClassNotFoundException {
        //0.initiem niste grapshics
        AsciiGraphics asciiArt = new AsciiGraphics();
        Art.add(asciiArt);
        //1. initiem User, cerem nume, dam random cash
        initPetDoctor(); // makes a list with 4 doctors with 4 different specialitys
        initRescuer();

        //1.1 initiem Food.
        addFood();

        //1.2 initiem Shelters.
        addShelter();

        //2. User chooses animal type (dog, cat, fish or bird) //  //3. Cand selectam ce animal vrem aratam ascii art si cerem sa ii puna un nume
        initAnimal();
        // verificare ca totul e ok
        System.out.println( "The name should be " + rescuer.get(0).getOwnerName());
        System.out.println( " the name of the animal should be " + savedAnimal.get(0).getPetName());
        animalRescuerRepository.createAnimal(savedAnimal.get(0).getPetName(), savedAnimal.get(0).getType(), savedAnimal.get(0).getPetAge(), savedAnimal.get(0).getHealthLevel(),
                                                savedAnimal.get(0).getHungerLevel(), savedAnimal.get(0).getNameFavoriteFood(), savedAnimal.get(0).getNameFavoriteActivity(),
                                                savedAnimal.get(0).getMedicineType());

        //4. selectam o casa adecvata pentru animal
        System.out.println( "Its time to select a house for your pet, visit the Store and have a look" );
            buyAshelter();


        //5. game logic feed , train, play and treat the pet.
        // while the pet vitals are stable the game will not end, unnfortunaly the game mechanic is heavily staked against the player, some tactics may be required to make sure the pet survives its first week.
        showMenu();
        // we give the chance for the owner to treat and feed the pet then we do the while
        doGamelogic();


        // Asigurați-vă că în clasa Game, aveți o metodă public void start. În această metodă veți include întreaga logică de funcționare a jocului.
        // Deocamdată, în corpul metodei start apelați metoda initAnimal creată anterior, așa încât, la pornirea jocului, să existe un animal abandonat care trebuie salvat.
        // Încorporați apelarea metodelor requireFeeding și requireActivity într-o buclă while sau for și introduceți o condiție pe baza căreia să fie determinat rezultatul
        // jocului în funcție de valoare proprietăților hungerLevel și happinessLevel din obiectul animal (de exemplu, stabiliți un număr de runde sau o durată de timp, iar în
        // funcție de nivelul de foame și nivelul stării de bine ale animalului la sfârșitul acestor runde sau la sfârșitul timpului, jocul să fie câștigat sau pierdut).
    }

    ///////////////////////////////////////////////////// METHODS ////////////////////////////////////////////////////////////

    public int UserInputInt() {
        System.out.println(" Type your answer here: ");
        Scanner input = new Scanner(System.in);
        int ch = 0;
        try {
            ch = input.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Numbers only, please.");
            UserInputInt();
        }
        return ch;
    }

    public String UserInputString() {
        System.out.println(" Type your answer here: ");
        Scanner input = new Scanner(System.in);
        String st = "";
        try {
            st = input.nextLine();

        } catch (InputMismatchException e) {

            System.out.println("A program needs a name.");
            UserInputString();
        }
        return st;
    }


private void initAnimal () {

    System.out.println(" WELCOME  TO  THE PET SHELTER ");
    System.out.println("------------------------------");
// În clasa Game, creați o metodă private void initAnimal, în cadrul căreia veți instanția un obiect de tip Dog sau Cat sau o altă sub-clasă a clasei Animal
// (îi puteți chiar cere jucătorului să își exprime preferința), pe a cărui referință o veți stoca în variabila de instanță animal din clasa Game. Tot în cadrul acestei metode,
// atribuiți câte o valoare tuturor prorietăților obiectului Animal instanți.

//System.out.println(String.format("%-20s= %s" , "label", "content" ));
//Where %s is a placeholder for you string.
//The '-' makes the result left-justified.
//20 is the width of the first string
//The output looks like this:
//
//label               = content
   System.out.println("Please select the animal you want to rescue:");
   String format = "%1$-20s %2$-20s %3$-20s %4$-20s";
   System.out.format(format, "1.Dog", "2.Cat", "3.Bird", "4.Fish");
   System.out.println("");
   System.out.println(Art.get(0).getAll());

    int petSelection = UserInputInt();
    switch (petSelection) {
        case 1:
            Animal animal = new Dog(nameAnimal());
            animal.setType(RandomDogTypeSelector());
            animal.setPetAge(RandomNumberGenerator());
            animal.setHealthLevel(RandomNumberGenerator());
            animal.setHappyness(RandomNumberGenerator());
            animal.setHungerLevel(RandomNumberGenerator());
            animal.setNameFavoriteFood("name");        // make it match a random dog food
            animal.setNameFavoriteActivity(RandomLandActivitySelector());        // make it match a list of land activitys
            animal.setMedicineType("Canine ");
            animal.setLivesin("land");
       //     System.out.println("the animal is "+ animal.getHealthLevel() + " is health level ");
            System.out.println(" The animal is a " + animal.getType() + " and its name is " + animal.getPetName()+  ".");
            System.out.println(" " + animal.getPetName() + " is " + animal.getPetAge() + " years old and enjoys " + animal.getNameFavoriteActivity() + ".");

            savedAnimal.add(animal);
            break;

        case 2:
            animal = new Cat(nameAnimal());
            animal.setType(RandomCatTypeSelector());
            animal.setPetAge(RandomNumberGenerator());
            animal.setHealthLevel(RandomNumberGenerator());
            animal.setHappyness(RandomNumberGenerator());
            animal.setHungerLevel(RandomNumberGenerator());
            animal.setNameFavoriteFood("name");
            animal.setNameFavoriteActivity(RandomLandActivitySelector());
            animal.setMedicineType("Feline ");
            animal.setLivesin("land");
            System.out.println(" The animal is a " + animal.getType() + " and its name is " + animal.getPetName()+  ".");
            System.out.println(" " + animal.getPetName() + " is " + animal.getPetAge() + " years old and enjoys " + animal.getNameFavoriteActivity() + ".");

            savedAnimal.add(animal);
           break;

        case 3:
            animal = new Bird(nameAnimal());
            animal.setType(RandomBirdTypeSelector());
            animal.setPetAge(RandomNumberGenerator());
            animal.setHealthLevel(RandomNumberGenerator());
            animal.setHappyness(RandomNumberGenerator());
            animal.setHungerLevel(RandomNumberGenerator());
            animal.setNameFavoriteFood("name");        // make it match a random dog food
            animal.setNameFavoriteActivity(RandomLandActivitySelector());        // make it match a list of land activitys
            animal.setMedicineType("Avian ");
            animal.setLivesin("land");
            System.out.println(" The animal is a " + animal.getType() + " and its name is " + animal.getPetName()+  ".");
            System.out.println(" " + animal.getPetName() + " is " + animal.getPetAge() + " years old and enjoys " + animal.getNameFavoriteActivity() + ".");

            savedAnimal.add(animal);
            break;

        case 4:
            animal = new Fish(nameAnimal());
            animal.setType(RandomFishTypeSelector());
            animal.setPetAge(RandomNumberGenerator());
            animal.setHealthLevel(RandomNumberGenerator());
            animal.setHappyness(RandomNumberGenerator());
            animal.setHungerLevel(RandomNumberGenerator());
            animal.setHealthLevel(ThreadLocalRandom.current().nextDouble(1,9));
            animal.setHappyness(ThreadLocalRandom.current().nextDouble(1,9));
            animal.setNameFavoriteFood("name");        // make it match a random dog food
            animal.setNameFavoriteActivity(RandomAquaticActivitySelector());        // make it match a list of aquatic activity
            animal.setMedicineType("Aquatic ");
            animal.setLivesin("water");
            System.out.println(" The animal is a " + animal.getType() + " and its name is " + animal.getPetName()+  ".");
            System.out.println(" " + animal.getPetName() + " is " + animal.getPetAge() + " years old and enjoys " + animal.getNameFavoriteActivity() + ".");


            savedAnimal.add(animal);
            break;
       default:
            System.out.println();
            initAnimal();
    }

}

private String nameAnimal (){
//    În clasa Game, creați o nouă metodă private void nameAnimal prin care să îi solicitați utilizatorului să îi dea un nume animalului salvat. Citiți datele introduse
//    de utilizator folosind clasa Scanner și stocați numele introdus în proprietatea name a obiectului animal din clasa Game.
//            Apoi apelați metoda nameAnimal din metoda start.
    System.out.println("Lets name your new Friend!");
    String petname = UserInputString();

    return petname;
}

private void initRescuer () {
//În clasa Game, creați o nouă metodă private void initRescuer, în cadrul căreia veți instanția un obiect de tip Rescuer, pe a cărui referință o veți stoca în variabila de
// instanță rescuer din clasa Game. Tot în cadrul acestei metode, îi veți afișa utilizatorului un mesaj solicitându-i să își introducă numele, iar apoi, cu ajutorul unui obiect
// de tip Scanner, veți citi numele introdus de utilizator. În cele din urmă, stocați acest nume în proprietatea name a obiectului rescuer. Folosiți try-catch și recursivitatea pentru
// a forța utilizatorul să introducă date valide.

    System.out.println("Please tell us your Name");
    String RescuerName = UserInputString();
    double AvailableCash = ThreadLocalRandom.current().nextDouble(70,120);   // make it to be random somehow //done
    PetOwner petOwner = new PetOwner(RescuerName);
    petOwner.setAvailableCash(AvailableCash);
    petOwner.setPetTraining(1);
    System.out.println("Hello " + petOwner.getOwnerName() + ", your available cash is " + df2.format(petOwner.getAvailableCash()));
    rescuer.add(petOwner);
}

private void initPetDoctor (){
    for (int i = 0; i < 4; i++) {
        String speciality = DoctorType[i] + " ";  // luam din lista
        String doctorName = DoctorName[i] + " ";
        double skilllevel = ThreadLocalRandom.current().nextInt(1,4);
        double medicinalCost = ThreadLocalRandom.current().nextInt(2,13);
        PetDoctor doctor = new PetDoctor(skilllevel, medicinalCost);
        doctor.setSpeciality(speciality);
        doctor.setPetDoctorName(doctorName);
        petDoctors.add(doctor);
    }
}

private void requireFeeding(){
    System.out.println("You feed " + foodOwned.get(0).getFoodName() + " to " + savedAnimal.get(0).getPetName() + ".");
    rescuer.get(0).FeedPet(savedAnimal.get(0) ,foodOwned.get(0));
}

    private void requirePlay(String activity){
           rescuer.get(0).RecreationalActivity(savedAnimal.get(0),activity);// Faceți la fel pentru a-i solicita utilizatorului să se joace cu animalul salvat.
    }


private void addShelter(){  ///vroiam sa scriu PetHouse
    for (int s = 0; s <= 7; s++){

        String shelter = ShelterType[s] + " ";  // luam din lista
        PetHouse petShelter = new PetHouse("");
        if (s == 6 || s == 7 ){ petShelter.setPetHouseBiome("water");
        petShelter.setPetHouseType("fish");
        }
        if (s <6) {petShelter.setPetHouseBiome("land");}
        if (s == 0 || s == 1 ){ petShelter.setPetHouseType("dog");}

        petShelter.setPetHouseName(shelter);
        petShelter.setPetHouseType("");
        petShelter.setPetHouseCost((ThreadLocalRandom.current().nextDouble(20,40)));


        shelterInStore.add(petShelter);

    }

    }


private void addFood() {
    for (int i = 0; i <= 7; i++){
        String foods = FoodType[i] + " ";  // luam din lista
        Food petFood = new Food(foods);
        petFood.setFoodPrice (ThreadLocalRandom.current().nextDouble(1,8));
        petFood.setFoodQuantity (ThreadLocalRandom.current().nextDouble(1,4));
        petFood.setInStock(true);
        petFood.setCreatedDate(2018, 8, 1);
        petFood.setExpiryDate(2019,7,11);
        foodsInStore.add(petFood);
    }

    }

    private void doGamelogic(){
        double he = savedAnimal.get(0).getHealthLevel();
        double hap = savedAnimal.get(0).getHappyness();
        double hu = savedAnimal.get(0).getHungerLevel();
               while ((he > 0 & hap > 0) & hu < 11) {

            if (savedAnimal.get(0).getHungerLevel() > 7 & savedAnimal.get(0).getHungerLevel() < 11){
                savedAnimal.get(0).setHealthLevel(savedAnimal.get(0).getHealthLevel() - ThreadLocalRandom.current().nextInt(1,2));
            }
            if (savedAnimal.get(0).getHappyness() < 4 & savedAnimal.get(0).getHappyness() > 0){
                savedAnimal.get(0).setHealthLevel(savedAnimal.get(0).getHealthLevel() - 1);
                savedAnimal.get(0).setHungerLevel(savedAnimal.get(0).getHungerLevel() + 1);
            }

            if ((savedAnimal.get(0).getHealthLevel() > 0 & savedAnimal.get(0).getHappyness() > 0) & savedAnimal.get(0).getHungerLevel() < 11) {
               // System.out.println("executing while");
                double cashPerDay = ThreadLocalRandom.current().nextDouble(10,20);
                rescuer.get(0).setAvailableCash(rescuer.get(0).getAvailableCash() + cashPerDay);
                savedAnimal.get(0).setHungerLevel(savedAnimal.get(0).getHungerLevel() + ThreadLocalRandom.current().nextInt(1,2));
                savedAnimal.get(0).setHappyness(savedAnimal.get(0).getHappyness() - ThreadLocalRandom.current().nextInt(1,2));
                double he1 = savedAnimal.get(0).getHealthLevel();
                double hap1 = savedAnimal.get(0).getHappyness();
                double hu1 = savedAnimal.get(0).getHungerLevel();

              //  System.out.println("a day passes "  + he1 + " "+ hap1 + " " + hu1);
                               showMenu();
            } else
                { EndGame();
                        }return;
        }

    }

    private void EndGame(){
        System.out.println("      --G A M E   O V E R--");
        if(savedAnimal.get(0).getHealthLevel() <= 0){

            System.out.println(savedAnimal.get(0).getPetName() + " has died due to poor health." );
        }
        if( savedAnimal.get(0).getHappyness() <= 0){

            System.out.println(savedAnimal.get(0).getPetName() + " has ran away due to bad treatment." );
        }
        if (savedAnimal.get(0).getHungerLevel() >= 10) {

            System.out.println(savedAnimal.get(0).getPetName() + "has died due to malnutrition." );
        }return;
    }

    private void showMenu() {

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("rescuer available cash is: " + df2.format(rescuer.get(0).getAvailableCash()));
        System.out.println(" 1.Access Shop " + " 2.Play With " + savedAnimal.get(0).getPetName()  + " 3.Feed "+ savedAnimal.get(0).getPetName() + " 4.Observe " +savedAnimal.get(0).getPetName() + " 5.Train " + savedAnimal.get(0).getPetName() + " 6.MedicalCare " + " 7.NextDay");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println(" Choose an action ");
        int selector = UserInputInt();
        switch (selector) {
            case 1:
                accessShop();
                break;
            case 2:

                requirePlay(savedAnimal.get(0).getNameFavoriteActivity()); // de adaugat tipurile de activitati si listat

                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                showMenu();
                break;
            case 3:
                try{
               requireFeeding();
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                showMenu();}
                catch (IndexOutOfBoundsException e){
                    System.out.println(" NO food available! You need to buy some!\n hint: Visit the Shop");
                    showMenu();
                }
                break;
            case 4:
                observePetStats();   // aici animalul ar trebui sa ne dea indicii despre starea lui generala
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                showMenu();

                break;
            case 5:
                rescuer.get(0).TrainPet(savedAnimal.get(0), rescuer.get(0));
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                showMenu();
                break;
            case 6:
                SelectDoctor();
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                break;
            case 7:
                doGamelogic();
            System.out.println("The next day...");
            System.out.println("-------------------------------------------------------------------------------------------------------------------");
                break;
            default:
                System.out.println("The next day DEFAULT...");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                break;
        }
      //  doGamelogic();
    }

    private void accessShop(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println(rescuer.get(0).getOwnerName() + " available cash is " + df2.format(rescuer.get(0).getAvailableCash()) + "$.");
        System.out.println(" Select an option ");
        System.out.println("1. Pet House             2.Pet Food              3.Exit Store");
        int shopSelector = UserInputInt();
        switch (shopSelector) {
            case 1:
                buyAshelter();
            break;
            case 2:
                BuyFood();
                break;
            default:
                showMenu();
                break;
        }
    }

    private void SelectDoctor(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("rescuer available cash is: " + df2.format(rescuer.get(0).getAvailableCash()));
        System.out.println(" So " + savedAnimal.get(0).getPetName() + "feels bad, no problem, there are Doctors here to help, witch one will you call?");
        String format4 = "|%1$-5s|%2$-20s|%3$-20s|\n";
        System.out.format(format4, "no.", "Name", "Speciality");
        System.out.println();
                for (int d = 0; d < 4; d++) { // fa cu format ca sa fie fain
            String format3 = "|%1$-5s|%2$-20s|%3$-20s|\n";
            System.out.format(format3, (d + 1),  petDoctors.get(d).getPetDoctorName(), petDoctors.get(d).getSpeciality());
        }
        System.out.println("....................................................................................................................");
        int selectDoc = UserInputInt();
        String medicalTypeNeeded = (savedAnimal.get(0).getMedicineType()); // WE ARE CHECKING FOR THE CORRECT DOCTOR TYPE
        String medicalTypeSelected = (petDoctors.get(selectDoc-1).getSpeciality());
        if(medicalTypeNeeded.equals(medicalTypeSelected)){
        System.out.println("you have selected " + petDoctors.get(selectDoc-1).getPetDoctorName()); //IF = TRUE THEN EXECUTE
        selectedDoctor.add(petDoctors.get(selectDoc-1));
        selectedDoctorMenu();
        }
            System.out.println(" That is not the correct doctor speciality, call an appropriate doctor");
            SelectDoctor();
        }


    private void selectedDoctorMenu(){
        System.out.println("1. Examine Pet " + " 2. Treat Pet " + " 3. Leave ");
        int medicalAction = UserInputInt();
        switch (medicalAction) {
            case 1:
                System.out.println("The doctor will examine your pet and give you an accurate reading of its vitals for the sum of " + (selectedDoctor.get(0).getMedicinalCost() / 2) + "$.");
                System.out.println(" 1. Pay for the examination " + " 2. Back to Medical Care");
                int examine = UserInputInt();
                double price = ((selectedDoctor.get(0).getMedicinalCost() / 2));
                if (price > rescuer.get(0).getAvailableCash()){
                    System.out.println(" You cannot afford to pay for the costs at this time");
                    selectedDoctorMenu();
                }
                switch (examine) {
                    case 1:
                        examinePet();
                        selectedDoctorMenu();
                        break;
                    case 2:
                        selectedDoctorMenu();
                        break;
                    default:
                        showMenu();
                        break;
                }
                showMenu();
                break;
            case 2:
                double price2 = ( selectedDoctor.get(0).medicalcarePrice(selectedDoctor.get(0).getSkilllevel(), savedAnimal.get(0).getHealthLevel(), selectedDoctor.get(0).getMedicinalCost()));

                System.out.println(" The treatment would cost " + price2 );
                if (price2 > rescuer.get(0).getAvailableCash()){
                    System.out.println(" You cannot afford treatment costs at this time");
                    selectedDoctorMenu();
                }
                System.out.println(" 1. Treat the Pet " + " 2. Back to Medical Care");
                int treat = UserInputInt();
                switch (treat) {
                    case 1:
                        selectedDoctor.get(0).medicalcare(selectedDoctor.get(0).getSkilllevel(), savedAnimal.get(0).getHealthLevel(), selectedDoctor.get(0).getMedicinalCost());
                        savedAnimal.get(0).setHealthLevel(10);
                        double remainingCash2 = rescuer.get(0).getAvailableCash() - (selectedDoctor.get(0).getMedicinalCost());
                        rescuer.get(0).setAvailableCash(remainingCash2);

                        showMenu();
                        break;

                    case 2:
                        selectedDoctorMenu();
                }
            case 3:

                showMenu();
                break;
        }
    }

    private void buyAshelter() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("rescuer available cash is: " + df2.format(rescuer.get(0).getAvailableCash()));
        System.out.println("Welcome to the PetHouse Emporium");
        for (int n = 0; n <= 7; n++) {
            String format = "|%1$-5s|%2$-50s|%3$-5s %4$-1s|\n";
            System.out.format(format, ((n + 1) + ". "), shelterInStore.get(n).getPetHouseName(), df2.format(shelterInStore.get(n).getPetHouseCost()), "$");
        }

        int buyShelter = UserInputInt();
        double price = shelterInStore.get(buyShelter - 1).getPetHouseCost();
                if (price > rescuer.get(0).getAvailableCash()){
            System.out.println(" You cannot afford a PetHouse costs at this time");
            showMenu();
        }
        double remainingCash = rescuer.get(0).getAvailableCash() - shelterInStore.get(buyShelter - 1).getPetHouseCost();
        rescuer.get(0).setAvailableCash(remainingCash);
        System.out.println("rescuer remainingCash is: " + df2.format(remainingCash) + " because you bought "+ shelterInStore.get(buyShelter - 1).getPetHouseName());
        System.out.println("|"+savedAnimal.get(0).getLivesin()+"|"+shelterInStore.get(buyShelter -1).getPetHouseBiome()+"|"); //<<debug

//
          if ( savedAnimal.get(0).getLivesin().equals("water"))   {
              if (savedAnimal.get(0).getLivesin().equals(shelterInStore.get(buyShelter -1).getPetHouseBiome()) ) {
              showMenu();
             // System.out.println("passed this test");
              }
              else if (!savedAnimal.get(0).getLivesin().equals(shelterInStore.get(buyShelter -1).getPetHouseBiome()) & !savedAnimal.get(0).getLivesin().equals(shelterInStore.get(buyShelter -1).getPetHouseBiome())){
                  System.out.println("A fish must live in water!");
                  savedAnimal.get(0).setHealthLevel(0);
                  EndGame();
          }
            //  System.out.println("fish detected but continue");
           showMenu();}
    }

    private void BuyFood() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("rescuer available cash is : " + df2.format(rescuer.get(0).getAvailableCash()));
        System.out.println("Welcome to the Food store");
        for (int n = 0; n <= 7; n++) {
            String format = "|%1$-5s|%2$-20s|%3$-4s %4$-1s|\n";
            System.out.format(format, ((n+1) + ". "), foodsInStore.get(n).getFoodName(), df2.format(foodsInStore.get(n).getFoodPrice()) , "$");;
        }
        System.out.println("....................................................................................................................");
        System.out.println( "select the food you want to buy with the apropriate numeric value, 9 for exiting the FoodShop");
        int buyFood = UserInputInt();
        double price = foodsInStore.get(buyFood - 1).getFoodPrice();
        if (price > rescuer.get(0).getAvailableCash()){
            System.out.println(" You cannot afford a PetHouse costs at this time");
            showMenu();
        }
        if (buyFood <9) {
            double remainingCash = rescuer.get(0).getAvailableCash() - foodsInStore.get(buyFood - 1).getFoodPrice();
            rescuer.get(0).setAvailableCash(remainingCash);
            System.out.println("rescuer remainingCash is: " + df2.format(remainingCash) + " because you bought: " +foodsInStore.get(buyFood -1 ).getFoodName());
            foodOwned.add(foodsInStore.get(buyFood - 1));
        }
        if (buyFood >= 9){
            showMenu();
        }
        else{
            showMenu();
        }
    }

    private void examinePet(){
        System.out.println("Pet name: " + savedAnimal.get(0).getPetName());
        System.out.println("Pet type: " + savedAnimal.get(0).getType());
        System.out.println("Age: " + savedAnimal.get(0).getPetAge() + " years.");
        System.out.println("Diagnosis is: ");
        System.out.println(savedAnimal.get(0).getPetName() + " happyness level is : " + savedAnimal.get(0).getHappyness() + " out of a max of 10.");
        System.out.println(savedAnimal.get(0).getPetName() + " hunger level is: " + savedAnimal.get(0).getHungerLevel() + " out of a max of 10.");
        System.out.println(savedAnimal.get(0).getPetName() + " health level is: " + savedAnimal.get(0).getHealthLevel() + " out of a max of 10.");
        double remainingCash = rescuer.get(0).getAvailableCash() - (selectedDoctor.get(0).getMedicinalCost() /2);
        rescuer.get(0).setAvailableCash(remainingCash);
    }

    private void observePetStats (){
        savedAnimal.get(0).observeHappynessLevel();
        savedAnimal.get(0).observeHungerLevel();
        savedAnimal.get(0).observeHealthMethod();
    }

private double RandomNumberGenerator () {
       Random rng = new Random();
double randomnumber =  ThreadLocalRandom.current().nextDouble(1,9);
    return randomnumber;
}

// lists of animal types and a random list selector for each
String[] DoglistType = {"Alsacian", "Bulldog", "Saint-Bernard", "Husky", "Labrador"};
String[] CatlistType = {"TigerStripes", "Birmanese", "Commnon Cat", "MainCoon", "Labrador"};
String[] BirdlistType = {"Nymph", "Parrot", "Raven", "Toucan", "Pidjin", "Owl", "Penguin"};
String[] FishlistType = {"Gelyfish", "Clown fish", "Rainbow Fish", "BubbleFish", "Squid"};

    private String RandomDogTypeSelector(){
    Random r = new Random();

   String dogType = DoglistType[r.nextInt(DoglistType.length)];

    return dogType;
}
    private String RandomCatTypeSelector(){
        Random r = new Random();
        String catType = CatlistType[r.nextInt(CatlistType.length)];
        return catType;
    }
    private String RandomBirdTypeSelector(){
        Random r = new Random();
        String birdType = BirdlistType[r.nextInt(BirdlistType.length)];
        return birdType;
    }
    private String RandomFishTypeSelector(){
        Random r = new Random();
        String fishType = FishlistType[r.nextInt(FishlistType.length)];
        return fishType;
    }
    private String RandomLandActivitySelector(){
        Random r = new Random();
        String favoriteActivity = LandActitivity[r.nextInt(LandActitivity.length)];
        return favoriteActivity;
    }
    private String RandomAquaticActivitySelector(){
        Random r = new Random();
        String favoriteActivity =AquaticActivity[r.nextInt(AquaticActivity.length)];
        return favoriteActivity;
    }

//facem niste liste de mancare pentru animale din care vom extrange random numele mancarii
private String[] FoodType = {"PowerDog","HappyDoggy","PURRina","KittyYum","MixedSeeds","FruitYum","GreenWaters","PredatorFishP"};
private String[] ShelterType = {"White Dog house","Red Dog House","Cat Post with sleeping Platform","Cardboard Box","Guilded bird cage","Bird cage with tree branch","Round Fish Bowl with Plants","Rectangle Aqquarium with Castle"};
private String[] DoctorType = {"Canine", "Feline", "Avian", "Aquatic"};
private String[] DoctorName = {" John ", " Madelaine ", " Randolph ", " Gustav "};
private String[] LandActitivity = {"Running outside", "Chasing the pointer", "Play-fighting with master", "Retrieving the object", "Hide and seek"};
private String[] AquaticActivity = {"Hide and seek around aquarium plants", "Blowing bubbles", "Swimming after the food", "Underwater course"};


    public List<PetOwner> getRescuer() {
        return rescuer;
    }

    public void setRescuer(List<PetOwner> rescuer) {
        this.rescuer = rescuer;
    }

    public List<Animal> getSavedAnimal() {
        return savedAnimal;
    }

    public void setSavedAnimal(List<Animal> savedAnimal) {
        this.savedAnimal = savedAnimal;
    }

    public List<Food> getFoodsInStore() {
        return foodsInStore;
    }

    public void setFoodsInStore(List<Food> foodsInStore) {
        this.foodsInStore = foodsInStore;
    }

    public List<Food> getFoodOwned() {
        return foodOwned;
    }

    public void setFoodOwned(List<Food> foodOwned) {
        this.foodOwned = foodOwned;
    }

    public List<PetHouse> getShelterInStore() {
        return shelterInStore;
    }

    public void setShelterInStore(List<PetHouse> shelterInStore) {
        this.shelterInStore = shelterInStore;
    }

    public List<PetDoctor> getPetDoctors() {
        return petDoctors;
    }

    public void setPetDoctors(List<PetDoctor> petDoctors) {
        this.petDoctors = petDoctors;
    }
}
