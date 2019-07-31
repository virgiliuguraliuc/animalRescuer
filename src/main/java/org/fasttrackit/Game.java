package org.fasttrackit;


import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static org.fasttrackit.Animal.*;


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



    public void Start (){
        //0.initiem niste grapshics
        AsciiGraphics asciiArt = new AsciiGraphics();
        Art.add(asciiArt);
        //1. initiem User, cerem nume, dam random cash
        initPetDoctor();
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


        //4. selectam o casa adecvata pentru animal
        System.out.println( "Its time to select a house for your pet, visit the Store and have a look" );
        System.out.println("Shelter in store");
        for (int sh = 0; sh <= 7; sh++) {
            System.out.println((sh+1) + ". " + shelterInStore.get(sh).getPetHouseName() + " " +  df2.format(shelterInStore.get(sh).getPetHouseCost()) + "$");
        }


        buyAshelter();

        //5. train and play and feed with animal for 5 minutes or so.
        rescuer.get(0).FeedPet(savedAnimal.get(0) ,foodsInStore.get(0));

        Menu();



        //6. if good job the animal likes you and likes to stay with you, dies or runs away.


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

    public String UserInputString() { // vezi cum fortezi sa bage doar string

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


public void initAnimal () {

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
            animal.setNameFavoriteFood("name");        // make it match a random dog food
            animal.setNameFavoriteActivity("");        // make it match a list of land activitys

            System.out.println("the animal is "+ animal.getHealthLevel() + " is health level ");
            System.out.println(" The animal is a " + animal.getType() + " and its name is " + animal.getPetName()+  ".");
            System.out.println(" " + animal.getPetName() + " is " + animal.getPetAge() + " years old and enjoys " + animal.getNameFavoriteActivity() + ".");

            savedAnimal.add(animal);
            break;

        case 2:
            animal = new Cat(nameAnimal());
            animal.setType(RandomCatTypeSelector());
            animal.setPetAge(RandomNumberGenerator());
            animal.setHealthLevel(RandomNumberGenerator());
            animal.setNameFavoriteFood("name");
            animal.setNameFavoriteActivity("");

            System.out.println(" The animal is a " + animal.getType() + " and its name is " + animal.getPetName()+  ".");
            System.out.println(" " + animal.getPetName() + " is " + animal.getPetAge() + " years old and enjoys " + animal.getNameFavoriteActivity() + ".");

            savedAnimal.add(animal);
           break;

        case 3:
            animal = new Bird(nameAnimal());
            animal.setType(RandomBirdTypeSelector());
            animal.setPetAge(RandomNumberGenerator());
            animal.setHealthLevel(RandomNumberGenerator());
            animal.setNameFavoriteFood("name");        // make it match a random dog food
            animal.setNameFavoriteActivity("");        // make it match a list of land activitys

            System.out.println(" The animal is a " + animal.getType() + " and its name is " + animal.getPetName()+  ".");
            System.out.println(" " + animal.getPetName() + " is " + animal.getPetAge() + " years old and enjoys " + animal.getNameFavoriteActivity() + ".");

            savedAnimal.add(animal);
            break;

        case 4:
            animal = new Fish(nameAnimal());
            animal.setType(RandomFishTypeSelector());
            animal.setPetAge(RandomNumberGenerator());
            animal.setHealthLevel(RandomNumberGenerator());
            animal.setNameFavoriteFood("name");        // make it match a random dog food
            animal.setNameFavoriteActivity("");        // make it match a list of land activitys

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
//    În clasa Game, creați o nouă metodă private void requireFeeding prin care să îi solicitați utilizatorului să hrănească animalul salvat.
//    În cadrul acestei metode, folosind o buclă for, afișați-i utilizatorului toate tipurile de hrană disponibile.
//    Îi puteți lăsa și posibilitatea de a nu alege niciunul dintre ele. Cu ajutorul clasei Scanner citiți tipul de hrană ales de utilizator și folosiți-l pentru a apela,
//    din cadrul metodei requireFeeding, metoda feed expusă de obiectul rescuer din clasa Game.
//    Apoi apelați metoda requireFeeding din metoda start.


}

    private void requirePlay(){
// Faceți la fel pentru a-i solicita utilizatorului să se joace cu animalul salvat.

    }

    private void requireShelter(){

    }


private void addShelter(){  ///vroiam sa scriu PetHouse
    for (int s = 0; s <= 7; s++){
        String shelter = ShelterType[s] + " ";  // luam din lista
        PetHouse petShelter = new PetHouse("");
        petShelter.setPetHouseName(shelter);
        petShelter.setPetHouseType("");
        petShelter.setPetHouseCost((ThreadLocalRandom.current().nextDouble(20,40)));
        shelterInStore.add(petShelter);
    }
    //VERIFICAM CA TOTUL E OK cu shelter
    System.out.println( "-------------------");
    System.out.println("Shelter in store");
    for (int sh = 0; sh <= 7; sh++) {
        String format2 = "|%1$-20s|%2$-20s|%3$-20s|%4$-20s|";
        System.out.format(format2, ((sh+1) + ". "), shelterInStore.get(sh).getPetHouseName(), df2.format(shelterInStore.get(sh).getPetHouseCost()),"$");
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
    //VERIFICAM CA TOTUL E OK cu foods
    System.out.println( "------------------");
    System.out.println("Food store");
    for (int n = 0; n <= 7; n++) { // fa cu format ca sa fie fain
        String format = "|%1$-20s|%2$-20s|%3$-20s|%4$-20s|";
               System.out.format(format, ((n+1) + ". "), foodsInStore.get(n).getFoodName(), df2.format(foodsInStore.get(n).getFoodPrice()) , "$");
    }

}

    private void Menu() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("rescuer available cash is: " + df2.format(rescuer.get(0).getAvailableCash()));
        System.out.println(" 1.Access Shop " + " 2.Play With " + savedAnimal.get(0).getPetName()  + " 3.Feed "+ savedAnimal.get(0).getPetName() + " 4.Observe" +savedAnimal.get(0).getPetName() + " 5.Train " + savedAnimal.get(0).getPetName() + " 6.MedicalCare " + "7.NextDay");
        System.out.println(" Choose an action ");
        int selector = UserInputInt();
        switch (selector) {
            case 1:
                Shop();
                break;
            case 2:
                rescuer.get(0).RecreationalActivity(savedAnimal.get(0));
                Menu();
                break;
            case 3:
                try{
                rescuer.get(0).FeedPet(savedAnimal.get(0) ,foodOwned.get(0));}
                catch (IndexOutOfBoundsException e){
                    System.out.println(" NO food available! You need to buy some!\n hint: Visit the Shop");
                    Menu();
                }
                break;
            case 4:
                double health = savedAnimal.get(0).getHealthLevel();
                System.out.println("pet health level is "+  health); // this needs more work
                savedAnimal.get(0).HappynessLevel();
                Menu();
                 // aici animalul ar trebui sa ne dea idicii despre starea lui personala
                break;
            case 5:
                rescuer.get(0).TrainPet();
                Menu();
                break;
            case 6:
                SelectDoctor();
                break;
            case 7:

                break;
            default:
                Menu();
                break;
        }
    }

    private void Shop(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println(rescuer.get(0).getOwnerName() + " available cash is " + rescuer.get(0).getAvailableCash() + "$.");
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
            case 3:
                Menu();
                break;
            default:
                Menu();
                break;
        }

    }

    private void SelectDoctor(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("rescuer available cash is: " + df2.format(rescuer.get(0).getAvailableCash()));
        System.out.println(" So " + savedAnimal.get(0).getPetName() + "feels bad, no problem, there are Doctors here to help, witch one will you call?");
        System.out.println();

        for (int d = 0; d < 4; d++) { // fa cu format ca sa fie fain
            String format3 = "|%1$-20s|%2$-20s|%3$-20s|%4$-20s|\n";
            System.out.format(format3, (d + 1),  petDoctors.get(d).getPetDoctorName(), petDoctors.get(d).getSpeciality());
        }
        System.out.println("....................................................................................................................");
        int selectDoc = UserInputInt();
        System.out.println("you have selected " + petDoctors.get(selectDoc-1).getPetDoctorName()); //fa o verificare ca e doctoru e pt tipul de animal corect.
        selectedDoctor.add(petDoctors.get(selectDoc-1));
        selectedDoctorMenu();
    }

    private void selectedDoctorMenu(){
        System.out.println("1. Examine Pet " + " 2. Treat Pet" + "3. Leave");
        int medicalAction = UserInputInt();
        switch (medicalAction) {
            case 1:
                System.out.println("The doctor will examine your pet and give you an accurate reading of its vitals for the sum of " + (selectedDoctor.get(0).getMedicinalCost() / 2) + "$.");
                System.out.println(" 1. Examine the Pet " + " 2. Back to Medical Care");
                int examine = UserInputInt();
                switch (examine) {
                    case 1:
                        System.out.println(savedAnimal.get(0).getPetName() + " health level is " + savedAnimal.get(0).getHealthLevel() + " out of a max of 10.");
                        double remainingCash = rescuer.get(0).getAvailableCash() - (selectedDoctor.get(0).getMedicinalCost() /2);
                        rescuer.get(0).setAvailableCash(remainingCash);
                        selectedDoctorMenu();

                        break;
                    case 2:
                        selectedDoctor.get(0).medicalcare(selectedDoctor.get(0).getSkilllevel(), savedAnimal.get(0).getHealthLevel(), selectedDoctor.get(0).getMedicinalCost());
                        double remainingCash2 = rescuer.get(0).getAvailableCash() - (selectedDoctor.get(0).getMedicinalCost());
                        rescuer.get(0).setAvailableCash(remainingCash2);

                        selectedDoctorMenu();
                        break;
                    default:
                        Menu();
                        break;
                }
                Menu();
                break;
            case 2:
                petDoctors.get(0).medicalcare(petDoctors.get(0).getSkilllevel(), petDoctors.get(0).getSkilllevel(), petDoctors.get(0).getMedicinalCost());
                Menu();
                break;
            case 3:

                Menu();
                break;
            default:
                System.out.println("Try again:");
                Menu();
                break;
        }
    }



    private void buyAshelter() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("rescuer available cash is: " + df2.format(rescuer.get(0).getAvailableCash()));
        int buyShelter = UserInputInt();
        double remainingCash = rescuer.get(0).getAvailableCash() - shelterInStore.get(buyShelter - 1).getPetHouseCost();
        rescuer.get(0).setAvailableCash(remainingCash);
        System.out.println("rescuer remainingCash is: " + df2.format(remainingCash) + " because you bought "+ shelterInStore.get(buyShelter - 1).getPetHouseName());

    }

    private void BuyFood() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("rescuer available cash is : " + df2.format(rescuer.get(0).getAvailableCash()));

        System.out.println("Welcome to the Food store");
        for (int n = 0; n <= 7; n++) { // fa cu format ca sa fie fain
            String format = "|%1$-5s|%2$-20s|%3$-4s %4$-1s|\n";
            System.out.format(format, ((n+1) + ". "), foodsInStore.get(n).getFoodName(), df2.format(foodsInStore.get(n).getFoodPrice()) , "$");;

        }
        System.out.println("....................................................................................................................");
        System.out.println( "select the food you want to buy with the apropriate numeric value, 9 for exiting the FoodShop");
        int buyFood = UserInputInt();
        if (buyFood <9) {
            double remainingCash = rescuer.get(0).getAvailableCash() - foodsInStore.get(buyFood - 1).getFoodPrice();
            rescuer.get(0).setAvailableCash(remainingCash);
            System.out.println("rescuer remainingCash is: " + df2.format(remainingCash) + " because you bought: " +foodsInStore.get(buyFood -1 ).getFoodName());
            foodOwned.add(foodsInStore.get(buyFood - 1));
        }
        if (buyFood >= 9){
            Menu();
        }
        else{
            Menu();
        }
    }

private int RandomNumberGenerator () {
       Random rng = new Random();
int randomnumber =  rng.nextInt(10) + 1;
    return randomnumber;
}

// lists of animal types and a random list selector for each
String[] DoglistType = {"Alsacian", "Bulldog", "Saint-Bernard", "Husky", "Labrador"};
String[] CatlistType = {"TigerStripes", "Birmanese", "Commnon Cat", "MainCoon", "Labrador"};
String[] BirdlistType = {"Nymph", "Parrot", "Raven", "Toucan", "Pidjon", "Owl", "Penguin"};
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



//facem niste liste de mancare pentru animale din care vom extrange random numele mancarii
String[] FoodType = {"PowerDog","HappyDoggy","PURRina","KittyYum","MixedSeeds","FruitYum","GreenWaters", "PredatorFishP",};
//facem o lista pentru animal Shelters ( va afecta happiness si health pentru)
String[] ShelterType = {" White Dog house "," Red Dog House "," Cat Post with sleeping Platform "," Cardboard Box "," Guilded bird cage "," Bird cage with tree branch ","Round Fish Bowl with Plants","Rectangle Aqquarium with Castle"};
String[] DoctorType = {" Canine ", " Feline ", " Avian ", " Aquatic "};
String[] DoctorName = {" John ", " Madelaine ", " Randolph ", " Gustav "};
}
